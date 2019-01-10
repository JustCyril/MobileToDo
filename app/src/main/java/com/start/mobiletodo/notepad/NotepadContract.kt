package com.start.mobiletodo.notepad

import com.start.mobiletodo.model.Note

class NotepadContract {

    interface NotepadView {
        fun viewMessage(text: String)
        // Decided to use function overloading for blank/filled activity opening
        fun startNoteActivity()
        fun startNoteActivity(note : Note)
    }

    interface NotepadPresenter{
        fun openNote(note : Note)
        fun addNote()
        fun deleteNote()
    }
}