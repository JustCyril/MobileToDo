package com.start.mobiletodo.notepad

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.start.mobiletodo.R
import com.start.mobiletodo.data.Repository
import com.start.mobiletodo.model.Note

import com.start.mobiletodo.note.NoteActivity

class NotepadFragment : Fragment(), NotepadContract.NotepadView {

    override fun viewMessage(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }

    lateinit var ntpdFabBtn : FloatingActionButton
    lateinit var ntpdRecView : RecyclerView
    var ntpdPresenter:NotepadContract.NotepadPresenter? = null

    companion object {
        fun newInstance(): NotepadFragment {
            return NotepadFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                          savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_notepad, container, false)

        ntpdPresenter = NotepadPresenter(this)
        ntpdFabBtn = view.findViewById(R.id.fab_notepad)
        ntpdRecView = view.findViewById(R.id.recview_notepad)
        //internet says it`s necessary to describe LayoutManager for RecycleView
        ntpdRecView.layoutManager = LinearLayoutManager(context)
        //get data for adapter and call adapter after thar
        val notesRepo = Repository()
        val notes : List<Note> = notesRepo.getNotes()
        ntpdRecView.adapter = NotepadAdapter(notes)

        ntpdFabBtn.setOnClickListener{
            ntpdPresenter?.addNote()
        }

        return view

    }

    override fun startNoteActivity() {
        val noteActivity = Intent(context, NoteActivity::class.java)
        startActivity(noteActivity)
    }
}