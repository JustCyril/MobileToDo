package com.start.mobiletodo.main

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.start.mobiletodo.notepad.NotepadActivity

import com.start.mobiletodo.R

class MainFragment : Fragment(), MainContract.MainView {


    override fun viewMessage(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }

    lateinit var mBtnToDo : Button
    lateinit var mBtnPurchase : Button
    lateinit var mBtnCalendar : Button
    lateinit var mBtnNotepad : Button
    var mainPresenter:MainContract.MainPresenter? = null

    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var view = inflater.inflate(R.layout.fragment_main, container, false)

        mainPresenter = MainPresenter(this)

        mBtnToDo = view.findViewById(R.id.btn_main_todo)
        mBtnCalendar = view.findViewById(R.id.btn_main_calendar)
        mBtnNotepad = view.findViewById(R.id.btn_main_notepad)
        mBtnPurchase = view.findViewById(R.id.btn_main_purchase)

        mBtnToDo.setOnClickListener{
            mainPresenter?.startToDo()
        }

        mBtnPurchase.setOnClickListener {
            mainPresenter?.startPurchase()
        }

        mBtnNotepad.setOnClickListener{
            mainPresenter?.startNotepad()

        }

        mBtnCalendar.setOnClickListener {
            mainPresenter?.startCalendar()
        }

        return view
    }

    override fun startNotepadActivity() {
        var notepadActivity = Intent(context, NotepadActivity::class.java)
        startActivity(notepadActivity)
    }

}
