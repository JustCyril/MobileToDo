package com.start.mobiletodo.main

import android.content.Context

class MainContract {
    interface MainView {
        fun viewMessage(text: String)
        fun startNotepadActivity()
    }

    interface MainPresenter{
        fun startNotepad()
        fun startCalendar()
        fun startToDo()
        fun startPurchase()
    }
}