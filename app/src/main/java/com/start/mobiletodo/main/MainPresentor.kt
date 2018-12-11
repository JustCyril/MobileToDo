package com.start.mobiletodo.main

import android.widget.Toast

class MainPresentor(var view: MainContract.MainView): MainContract.MainPresentor {

    override fun startNotepad() {
        view.viewMessage("Пока блокнот не сделали")
    }

    override fun startCalendar() {
        view.viewMessage("Пока календарь не сделали")
    }

    override fun startToDo() {
        view.viewMessage("Пока список дел не сделали")
    }

    override fun startPurchase() {
        view.viewMessage("Пока список покупок не сделали")
    }

}