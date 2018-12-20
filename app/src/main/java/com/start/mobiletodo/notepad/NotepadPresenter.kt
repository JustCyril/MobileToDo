package com.start.mobiletodo.notepad

class NotepadPresenter(var view: NotepadContract.NotepadView): NotepadContract.NotepadPresenter {

    override fun addNote() {
        view.startNoteActivity()
        //view.viewMessage("Недоступно")
    }

    override fun deleteNote() {
        view.viewMessage("Недоступно")
    }

    override fun openNote() {
        view.viewMessage("Недоступно")
    }

}
