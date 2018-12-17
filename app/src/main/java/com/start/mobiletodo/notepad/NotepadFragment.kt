package com.start.mobiletodo.notepad

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.start.mobiletodo.R
import com.start.mobiletodo.main.MainFragment

class NotepadFragment : Fragment(), NotepadContract.MainView {

    override fun viewMessage(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }

    companion object {
    fun newInstance(): NotepadFragment {
        return NotepadFragment()
    }
}

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                          savedInstanceState: Bundle?): View? {

        var view = inflater.inflate(R.layout.fragment_notepad, container, false)

        return view

    }
}