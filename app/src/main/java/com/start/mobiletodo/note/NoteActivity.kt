package com.start.mobiletodo.note

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.start.mobiletodo.R

class NoteActivity : AppCompatActivity(), NoteContract.OnBackPressedListener {

    var noteFragment: NoteFragment = NoteFragment.newInstance()

    override fun onBack() {
        super.onBackPressed()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)
        noteFragment.setOnBackPresed(this)
        supportFragmentManager
                .beginTransaction()
                .add(R.id.note_container, noteFragment, "note_fragment")
                .commit()
    }

    override fun onBackPressed() {
        noteFragment.onBackPressed()
    }


}
