package com.start.mobiletodo.alertdialogs

import android.support.v7.app.AlertDialog
import android.widget.Toast
import java.security.AccessController.getContext

class YesNoAlertDialog (private var title: String, private var text: String, private  var yesToast: String, private  var noToast: String) {
   /* val builder = AlertDialog.Builder(getContext()!!)
    builder.setTitle(title)
    builder.setMessage(text)
    builder.setPositiveButton("YES"){dialog, which -> Toast.makeText(applicationContext,yesToast,Toast.LENGTH_SHORT).show()}
    builder.setNegativeButton("No"){dialog, which -> Toast.makeText(applicationContext, noToast,Toast.LENGTH_SHORT).show()}

    val dialog: AlertDialog = builder.create()
    dialog.show()*/
}