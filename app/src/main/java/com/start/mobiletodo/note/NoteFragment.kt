package com.start.mobiletodo.note

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import com.start.mobiletodo.R
import android.content.Intent.getIntent
import android.content.Intent



class NoteFragment: Fragment(), NoteContract.NoteView {

    override fun viewMessage(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }

    lateinit var noteTitle : EditText
    lateinit var noteText : EditText
    var notePresenter:NoteContract.NotePresenter? = null

    companion object {
        fun newInstance(): NoteFragment {
            return NoteFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var view = inflater.inflate(R.layout.fragment_note, container, false)

        notePresenter = NotePresenter (this)
        noteTitle = view.findViewById(R.id.edittеxt_title_note)
        noteText = view.findViewById(R.id.edittext_text_note)

        //add note info to fragment components
        val intent = getActivity()?.getIntent()
        noteTitle.setText(intent?.getStringExtra("Title"))
        noteText.setText(intent?.getStringExtra("Text"))

        return view

    }
}