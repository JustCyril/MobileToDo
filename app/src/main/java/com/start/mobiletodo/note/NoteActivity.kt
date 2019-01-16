package com.start.mobiletodo.note

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.start.mobiletodo.R

class NoteActivity : AppCompatActivity() {

    var noteFragment: NoteFragment = NoteFragment.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)
        noteFragment.setOnBackPresed(object: NoteContract.OnBackPressedListener{
            override fun onBackPressed(): Boolean {
                Back()
                return true
            }
        })
        supportFragmentManager
                .beginTransaction()
                .add(R.id.note_container, noteFragment, "note_fragment")
                .commit()
    }

    override fun onBackPressed() {
        noteFragment.onBackPressed()
    }

    fun Back(){
        super.onBackPressed()
    }


}
