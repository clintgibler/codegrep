port module Pages.Detail exposing (..)

import Html exposing (..)
import Html.Attributes exposing (class, href, id)
import Http
import RemoteData exposing (WebData)
import Json.Decode as Decode exposing (list)
import Json.Decode.Pipeline exposing (decode, required)
import Views.HeaderView as HeaderView
import String.Extra exposing (leftOf)


type Msg
    = NoOp
    | DataReceived (Result Http.Error Code)


initialModel =
    { result = Nothing }


type alias Token =
    { text : String
    , line : Int
    , char : Int
    , type_ : String
    }


type alias Code =
    { content : String
    , filename : String
    , repository : String
    , tokens : List Token
    }


type alias Model =
    { result : Maybe Code }


port highlight : String -> Cmd msg


port highlighted : (String -> msg) -> Sub msg


tokenDecoder : Decode.Decoder Token
tokenDecoder =
    decode Token
        |> required "text" Decode.string
        |> required "line" Decode.int
        |> required "char" Decode.int
        |> required "type" Decode.string


decoder : Decode.Decoder Code
decoder =
    decode Code
        |> required "content" Decode.string
        |> required "filename" Decode.string
        |> required "repository" Decode.string
        |> required "tokens" (list tokenDecoder)


fetch : Maybe String -> Cmd Msg
fetch id =
    case id of
        Just v ->
            Http.send DataReceived (Http.get ("/api/document/" ++ v) decoder)

        Nothing ->
            Cmd.none


view : Model -> Html Msg
view model =
    div []
        [ HeaderView.headerView
        , case model.result of
            Just m ->
                div [ class "pa4 bg-washed-yellow" ]
                    [ a [ href ((leftOf ".git" m.repository) ++ "/tree/master/" ++ m.filename) ] [ text m.filename ], hr [] [], a [ href m.repository ] [ text m.repository ] ]

            Nothing ->
                h1 [] [ text "Loading" ]
        ]


update : Msg -> Model -> ( Model, Cmd Msg )
update msg model =
    case msg of
        NoOp ->
            ( model, Cmd.none )

        DataReceived result ->
            case result of
                Ok c ->
                    ( { model | result = Just (c) }, highlight c.content )

                Err err ->
                    ( model, highlight (toString err) )
