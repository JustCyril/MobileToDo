package com.start.mobiletodo.notepad

import android.content.Context

class NotepadContract {

    interface NotepadView {
        fun viewMessage(text: String)
        fun startNoteActivity()
    }

    interface NotepadPresenter{
        fun openNote()
        fun addNote()
        fun deleteNote()
    }
}