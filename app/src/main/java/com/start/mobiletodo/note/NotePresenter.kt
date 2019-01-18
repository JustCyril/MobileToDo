package com.start.mobiletodo.note

class NotePresenter(var view: NoteContract.NoteView): NoteContract.NotePresenter {

    override fun saveNote() {
        view.saveDataFromEditText()
        //view.viewMessage("Недоступно")
    }

}