package com.start.mobiletodo.note

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.start.mobiletodo.R

class NoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)

        supportFragmentManager
                .beginTransaction()
                .add(R.id.note_container, NoteFragment.newInstance(), "note_fragment")
                .commit()
    }
}
