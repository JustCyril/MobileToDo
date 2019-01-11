package com.start.mobiletodo.note

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import com.start.mobiletodo.R



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
        noteTitle.setText(intent?.getStringExtra("NoteTitle"))
        noteText.setText(intent?.getStringExtra("NoteText"))

        return view

    }

    override fun onStop() {
        super.onStop()
        //Decided to use AlertDialog with question about saving when user click "back"-button
        val context = getActivity()?.getApplicationContext()
        val builder = AlertDialog.Builder(context!!)
        builder.setTitle("Сохранение записи")
        builder.setMessage("Сохрнаить изменения?")
        builder.setPositiveButton("YES"){dialog, which ->
            Toast.makeText(context, "Сохранено",Toast.LENGTH_SHORT).show()}
        builder.setNegativeButton("No"){dialog, which ->
            Toast.makeText(context, "Изменения не сохранены",Toast.LENGTH_SHORT).show()}

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

}