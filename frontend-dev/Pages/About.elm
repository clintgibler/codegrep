port module Pages.About exposing (..)

import Html exposing (..)
import Html.Attributes exposing (class, href, id)
import Views.HeaderView as HeaderView


type Msg
    = NoOp


view : Html Msg
view =
    div []
        [ HeaderView.headerView
        , div [ class "pa4" ]
            [ p [] [ text """codegrep is an experimental search engine for code. Currently only a few popular open-source repositories are indexed
                If you like what you see please star the project on github""" ]
            , a [ href "https://github.com/syamp/codegrep.git" ] [ text "codegrep" ]
            ]
        ]
