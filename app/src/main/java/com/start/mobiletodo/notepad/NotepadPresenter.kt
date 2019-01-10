package com.start.mobiletodo.notepad

import com.start.mobiletodo.model.Note

class NotepadPresenter(var view: NotepadContract.NotepadView): NotepadContract.NotepadPresenter {

    override fun addNote() {
        view.startNoteActivity()
        //view.viewMessage("Недоступно")
    }

    override fun deleteNote() {
        view.viewMessage("Недоступно")
    }

    override fun openNote(note : Note) {
        view.startNoteActivity(note)
    }

}
