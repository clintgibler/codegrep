module Views.HeaderView exposing (..)

import Html exposing (..)
import Html.Attributes exposing (..)


headerView : Html msg
headerView =
    header [ class "w-100 pa2 bg-light-yellow" ]
        [ nav [ class "flex flex-row items-center justify-between" ]
            [ a [ class "flex items-center link dark-gray", href "/", title "Home" ]
                [ img [ alt "codegrep", class "dib w2 h2 br-100", src "dist/logo.svg" ]
                    []
                , span [ class "pl2 fw6 code" ]
                    [ text "codegrep" ]
                ]
            , div [ class "w-10" ] [ rightSideLinks ]
            ]
        ]


rightSideLinks : Html msg
rightSideLinks =
    div [ class "flex flex-row justify-end" ]
        [ a [ class "link dark-gray ttc", href "https://github.com/syamp/codegrep" ] [ span [] [ text "Github" ] ]
        , span [] [ text " " ]
        ]
