package com.start.mobiletodo.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.start.mobiletodo.R

class MainActivity : AppCompatActivity() {

    var btnNotepad : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
                .beginTransaction()
                .add(R.id.main_container, MainFragment.newInstance(), getString(R.string.main_fragment))
                .commit()

    }
}
