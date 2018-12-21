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
}