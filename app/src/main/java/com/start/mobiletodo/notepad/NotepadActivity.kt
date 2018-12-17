package com.start.mobiletodo.notepad

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.start.mobiletodo.R

class NotepadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notepad)

        supportFragmentManager
                .beginTransaction()
                .add(R.id.notepad_container, NotepadFragment.newInstance(), "notepad_fragment")
                .commit()
    }
}
