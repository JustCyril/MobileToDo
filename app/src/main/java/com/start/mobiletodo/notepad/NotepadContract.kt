package com.start.mobiletodo.notepad

import com.start.mobiletodo.model.Note

class NotepadContract {

    interface NotepadView {
        fun viewMessage(text: String)
        fun startNoteActivity()
    }

    interface NotepadPresenter{
        fun openNote(note : Note)
        fun addNote()
        fun deleteNote()
    }
}