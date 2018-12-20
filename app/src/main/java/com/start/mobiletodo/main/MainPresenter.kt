package com.start.mobiletodo.main

class MainPresenter(var view: MainContract.MainView): MainContract.MainPresenter {

    override fun startNotepad() {
        view.startNotepadActivity()
        //view.viewMessage("Пока блокнот не сделали")
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