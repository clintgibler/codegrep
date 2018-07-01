module Pages.Search exposing (..)

import Html exposing (..)
import Html.Attributes exposing (..)
import Html.Attributes.Extra exposing (innerHtml)
import Html.Events exposing (on, onClick, onInput)
import Http
import Json.Decode.Pipeline as Pipeline
import Json.Encode exposing (string)
import Json.Decode as Decode
import Navigation exposing (newUrl)
import RemoteData exposing (WebData)
import String.Extra exposing (leftOf)
import Views.HeaderView exposing (headerView)


-- Models
type alias Model =
    { results : WebData (List Result)
    , languages : WebData (List String)
    , identifiers : WebData (List String)
    , input: SearchFormInput
    }

type alias Result =
    { id : String
    , filename : String
    , repository : String
    , content : String
    , highlight : String
    }

type alias SearchFormInput =
    { query: Maybe String
    , language: Maybe String
    , identifier: Maybe String
    , repository: Maybe String
    }

initialModel =
    { results = RemoteData.NotAsked
    , languages = RemoteData.NotAsked
    , identifiers = RemoteData.NotAsked
    , input =
        { query =  Nothing
        , language = Nothing
        , identifier = Nothing
        , repository = Nothing
        }
    }

-- Msgs

type Msg
    = DataReceivedResults (WebData (List Result))
    | DataReceivedLanguages (WebData (List String))
    | DataReceivedIdentifiers (WebData (List String))
    | Search
    | RepositoryInputChanged String
    | ChangeSearchInput String
    | ChangeLanguage String
    | ChangeIdentifier String
    | UpdateModel Model


-- update

update : Msg -> Model -> ( Model, Cmd Msg )
update msg model =
    case msg of
        DataReceivedResults response ->
            ( { model | results = response }, updateURL model )
        DataReceivedLanguages response ->
            ( { model | languages = response }, Cmd.none )
        DataReceivedIdentifiers response ->
            ( { model | identifiers = response }, Cmd.none )
        Search ->
            ( model , fetchResults model)
        RepositoryInputChanged newRepositoryInput ->
            let
                input = model.input
                newInput = {input | repository = Just newRepositoryInput}
            in
            ( { model | input = newInput }, Cmd.none )

        ChangeSearchInput newSearchInput ->
            let
                input = model.input
                newInput = {input | query = Just newSearchInput}
            in
            ( { model | input = newInput }, Cmd.none )
        ChangeLanguage newLanguage ->
            let
                input = model.input
                newInput = {input | language = Just newLanguage}
                newModel = { model | input = newInput}
            in
            ( newModel , fetchIdentifiers newModel )
        ChangeIdentifier newIdentifier ->
            let
                input = model.input
                newInput = {input | identifier = Just newIdentifier}
            in
            ( { model | input = newInput }, Cmd.none )
        UpdateModel model ->
            (model, Cmd.none)

-- Commands
init: Model -> Maybe String -> Maybe String -> Maybe String -> Maybe String -> (Model, Cmd Msg)
init model maybeQuery maybeLanguage maybeIdentifier maybeRepository =
    let
        newInput =  {query = maybeQuery, language = maybeLanguage, identifier = maybeIdentifier, repository = maybeRepository}
        newModel = {model | input = newInput}
    in
        (newModel, Cmd.batch [fetchResults newModel, fetchIdentifiers newModel, fetchLanguages])

languagesDecoder: Decode.Decoder (List String)
languagesDecoder =
    Decode.list Decode.string

fetchLanguages: Cmd Msg
fetchLanguages =
    Http.get ("/api/languages") languagesDecoder
        |> RemoteData.sendRequest
        |> Cmd.map DataReceivedLanguages

identifiersDecoder: Decode.Decoder (List String)
identifiersDecoder =
    Decode.list Decode.string

fetchIdentifiers: Model -> Cmd Msg
fetchIdentifiers model =
    let
        base = "/api/identifiers"
        url = case model.input.language of
            Just(language) -> base ++ "/" ++ language
            Nothing -> base
    in
        Http.get (url) identifiersDecoder
            |> RemoteData.sendRequest
            |> Cmd.map DataReceivedIdentifiers

--
resultsDecoder : Decode.Decoder (List Result)
resultsDecoder =
    Decode.list resultDecoder


resultDecoder : Decode.Decoder Result
resultDecoder =
    Pipeline.decode Result
        |> Pipeline.required "id" Decode.string
        |> Pipeline.required "filename" Decode.string
        |> Pipeline.required "repository" Decode.string
        |> Pipeline.required "content" Decode.string
        |> Pipeline.required "highlight" Decode.string


fetchResults: Model -> Cmd Msg
fetchResults model =
    case model.input.query of
        Just(query) ->
            Http.get (makeSearchAPIUrl query model) resultsDecoder
            |> RemoteData.sendRequest
            |> Cmd.map DataReceivedResults
        Nothing -> Cmd.none


--

updateURL: Model -> Cmd Msg
updateURL model =
    let
     base = "/search"
     q1 = case model.input.query of
            Just(query) -> base ++ "?query=" ++ query
            Nothing -> base
     q2 = case model.input.language of
            Just(language) -> q1 ++ "&language=" ++ language
            Nothing -> q1
     q3 = case model.input.identifier of
            Just(identifier) -> q2 ++ "&identifier=" ++ identifier
            Nothing -> q2
     q4 = case model.input.repository of
            Just(repository) -> q3 ++ "&repository=" ++ repository
            Nothing -> q3
   in
        newUrl q4

makeSearchAPIUrl : String -> Model -> String
makeSearchAPIUrl query model =
    "/api/search"
     |>
        (\url ->
            case model.input.identifier of
                Nothing -> url ++ "?content=" ++ query
                Just t -> if t == "any" then url ++ "?content=" ++ query else url ++ "?tokens.type=" ++ t ++ "&tokens.text=" ++ query
        )
     |>
        (\url ->
            case model.input.language of
                Nothing -> url
                Just t -> if t == "any" then url else url ++ "&language=" ++ t
        )
     |>
        (\url ->
            case model.input.repository of
                Nothing -> url
                Just t -> if t == "" then url else url ++ "&repository=" ++ t
        )


-- View

searchInputElem: Model -> Html Msg
searchInputElem model =
    let
        query = case model.input.query of
                    Just(q) -> q
                    Nothing -> ""
    in
        input [ class "input-reset ba b--black-20 pa2 w-100"
              , id "content"
              , placeholder "Enter your search terms"
              , onInput ChangeSearchInput
              , value query ] []

searchView: Model -> Html Msg
searchView model =
    let
        repository = case model.input.repository of
                        Just(r) -> r
                        Nothing -> ""

    in
        div [ class "black-80 pa4 bg-washed-yellow" ] [
            div [ class "flex-ns flex-wrap-ns" ] [
                div [ class "w-60-ns pr2 pb2" ] [
                   searchInputElem model
                ],
                div [ class "w-40-ns pr2 pb2" ] [
                                input [ class "input-reset ba b--black-20 w-100 pa2"

                  , id "repository"
                  , placeholder "Filter repository"
                  , onInput RepositoryInputChanged
                  , value repository] []]

                ,div [ class "w-20-ns pr2 pb2" ] [
                   select[class "select w-100", on "change" (Decode.map ChangeLanguage Html.Events.targetValue)   ](maybeSearchLanguageOptions model.languages)
                ],
                div [ class "w-20-ns pr2 pb2" ] [
                   select[class "select w-100", on "change" (Decode.map ChangeIdentifier Html.Events.targetValue) ](maybeSearchIdentifierOptions model.identifiers)
                ]

              ]
             , div[ class "flex-ns flex-wrap-ns" ] [
                button [ class "f6 link dim ph3 pv2 mb2 dib white bg-black", onClick Search]
                    [ text "Search" ]
            ]
    ]

maybeSearchIdentifierOptions : WebData (List String) -> List(Html Msg)
maybeSearchIdentifierOptions response =
    case response of
        RemoteData.NotAsked ->
            [option[value "any"][text "Any Identifier"]]

        RemoteData.Loading ->
            [option[value "any"][text "Identifier"]]

        RemoteData.Success languages ->
            option[value "any"][text "Identifier"] :: searchIdentifierOptions languages

        RemoteData.Failure error ->
            [option[value "any"][text "Identifier"]]


searchIdentifierOptions: List String -> List(Html Msg)
searchIdentifierOptions identifiers =
      List.map (\x -> option[][text x]) identifiers

maybeSearchLanguageOptions : WebData (List String) -> List(Html Msg)
maybeSearchLanguageOptions response =
    case response of
        RemoteData.NotAsked ->
            [option[value "any"][text "Language"]]

        RemoteData.Loading ->
            [option[value "any"][text "Language"]]

        RemoteData.Success languages ->
            option[value "any"][text "Language"] :: searchLanguageOptions languages

        RemoteData.Failure error ->
            [option[value "any"][text "Language"]]


searchLanguageOptions: List String -> List(Html Msg)
searchLanguageOptions languages =
      List.map (\x -> option[][text x]) languages

view : Model -> Html Msg
view model =
    div [] [headerView, searchView model, maybeList model.results]

maybeList : WebData (List Result) -> Html Msg
maybeList response =
    case response of
        RemoteData.NotAsked ->
            text ""

        RemoteData.Loading ->
            div [ class "list pl4 pr4" ][p [][text "Loading..."]]

        RemoteData.Success players ->
            list players

        RemoteData.Failure error ->
            text (toString error)


list : List Result -> Html Msg
list results =
    if List.length(results) /= 0 then
        div [ class "list pl4 pr4" ]
            [ ul[class "pl0"](List.map resultRow results) ]
    else
        div [ class "list pl4 pr4" ][p [][text "No results found"]]


resultRow : Result -> Html Msg
resultRow result =
    li[ class "search-result-item" ][
        div[][
        a[ class "link", href((leftOf ".git" result.repository) ++ "/tree/master/" ++ result.filename)][text result.filename],
        hr[][],
        a [ class "link", href result.repository][text result.repository]
        ],
        div [ class "code-snippet f6", property  "innerHTML" <| string result.highlight  ] []
    ]
