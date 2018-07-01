module Main exposing (..)

import Html exposing (Html, div, h1, program, text)
import Navigation exposing (Location)
import UrlParser exposing (..)

import Pages.Detail as Detail
import Pages.Search as Search
import Pages.About as About

-- Routing
type Route
    = SearchRoute (Maybe String) (Maybe String) (Maybe String) (Maybe String)
    | DetailRoute (Maybe String)
    | AboutRoute
    | NotFoundRoute

matchers : Parser (Route -> a) a
matchers =
    oneOf
        [ map SearchRoute (top <?> stringParam "query" <?> stringParam "language" <?> stringParam "identifier" <?> stringParam "repository")
        , map SearchRoute (s "search" <?> stringParam "query" <?> stringParam "language" <?> stringParam "identifier" <?> stringParam "repository")
        , map DetailRoute (s "detail" <?> stringParam "id")
        , map AboutRoute (s "about")
        ]

parseLocation : Location -> Route
parseLocation location =
    case (parsePath matchers location) of
        Just route ->
            route
        Nothing ->
            NotFoundRoute
--
type Page
    = SearchPage Search.Model
    | DetailPage Detail.Model
    | AboutPage
    | NotFoundPage

--
type alias Model = {route: Route, searchModel: Search.Model, detailModel: Detail.Model}

--
type Msg
   = LocationChanged Location
   | SearchMsg Search.Msg
   | DetailMsg Detail.Msg
   | AboutMsg About.Msg


initialModel: Route -> Model
initialModel route =
        { route = route
        , searchModel = Search.initialModel
        , detailModel = Detail.initialModel
        }

init : Location -> ( Model, Cmd Msg )
init location =
    let
        currentRoute =
            parseLocation location
        model =
            initialModel currentRoute
    in
        urlUpdated model

urlUpdated: Model -> (Model, Cmd Msg)
urlUpdated model =
    case model.route of
        SearchRoute query language identifier repository ->
            let
                (newModel, cmd) = Search.init model.searchModel query language identifier repository
            in
                ({model | searchModel = newModel}, cmd |> Cmd.map SearchMsg)
        DetailRoute id ->
            (model, Detail.fetch id |> Cmd.map DetailMsg)
        AboutRoute ->
            (model, Cmd.none)
        NotFoundRoute ->
            (model, Cmd.none)


subscriptions : Model -> Sub Msg
subscriptions model =
    Sub.none

view : Model -> Html Msg
view model =
    div[][renderPage model]

renderPage : Model -> Html Msg
renderPage model =
    case model.route of
        SearchRoute query language identifier repository -> Search.view model.searchModel |> Html.map SearchMsg
        DetailRoute id -> Detail.view model.detailModel |> Html.map DetailMsg
        AboutRoute -> About.view |> Html.map AboutMsg
        NotFoundRoute ->  div[][h1[][text "Notfound"]]

update : Msg -> Model -> ( Model, Cmd Msg )
update msg model =
    case msg of
        LocationChanged location ->
            let
                newRoute =
                    parseLocation location
            in
                ({model|route=newRoute}, Cmd.none)

        SearchMsg searchMsg ->
            let
                (updatedSearchModel, searchCmd) =
                    Search.update searchMsg model.searchModel
            in
                ( {model | searchModel = updatedSearchModel}, Cmd.map SearchMsg searchCmd)

        DetailMsg detailMsg ->
            let
                (updatedDetailModel, detailCmd) =
                    Detail.update detailMsg model.detailModel
            in
                ( {model | detailModel = updatedDetailModel}, Cmd.map DetailMsg detailCmd)

        AboutMsg aboutMsg -> (model, Cmd.none)

-- MAIN
main : Program Never Model Msg
main =
    Navigation.program LocationChanged
        { init = init
        , view = view
        , update = update
        , subscriptions = subscriptions
        }
