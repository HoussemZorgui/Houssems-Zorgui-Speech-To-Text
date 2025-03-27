package com.paulson_partners.navigation

sealed class NavScreens(val route: String) {
    object IntroPage : NavScreens("IntroPage")
    object HomePage : NavScreens("HomePage")
    object SpeechToTextPage : NavScreens("SpeechToTextPage")
    object TextToSpeechPage : NavScreens("TextToSpeechPage")
    object FileListPage : NavScreens("FileListPage")
}