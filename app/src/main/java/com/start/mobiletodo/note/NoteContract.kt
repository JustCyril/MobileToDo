package com.start.mobiletodo.note

class NoteContract {

    interface NoteView {
        fun viewMessage(text: String)
        fun saveDataFromEditText()
    }

    interface NotePresenter{
        fun saveNote()
    }

    interface OnBackPressedListener {
        fun onBack()
    }
}