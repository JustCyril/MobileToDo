package com.start.mobiletodo.data

import android.provider.ContactsContract
import com.start.mobiletodo.model.Note

class Repository {


    fun getNotes(): ArrayList<Note>{
        return FakeData().getNotes()
    }

    fun getNote(id: Int): Note? {
        var list = FakeData().getNotes()
        return list.filter { s -> s.id == id }.firstOrNull()
    }

    fun addNote(note : Note) {
        var list = FakeData().getNotes()
        note.id = list.size+1
        list.add(note)
        saveNotes(list)
    }

    fun changeNote(note : Note) {
        var list = FakeData().getNotes()
        list.set(note.id , note)
        saveNotes(list)
    }

    fun saveNotes(notes: ArrayList<Note>) {
        //do smth for save our notes
    }
}