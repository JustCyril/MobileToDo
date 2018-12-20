package com.start.mobiletodo.note

class NoteContract {

    interface NoteView {
        fun viewMessage(text: String)
    }

    interface NotePresenter{
        fun saveNote()
    }
}