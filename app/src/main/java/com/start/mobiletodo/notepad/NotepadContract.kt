package com.start.mobiletodo.notepad

import android.content.Context

class NotepadContract {

        interface MainView {
            fun viewMessage(text: String)
        }
}