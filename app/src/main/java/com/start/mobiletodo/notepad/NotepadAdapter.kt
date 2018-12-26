package com.start.mobiletodo.notepad

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.start.mobiletodo.R
import com.start.mobiletodo.model.Note

class NotepadAdapter(private val notes: List<Note>) : RecyclerView.Adapter<NotepadAdapter.NtpdViewHolder>() {

    class NtpdViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun getItemCount() = notes.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotepadAdapter.NtpdViewHolder {
        val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_recycleview_notepad, parent, false) as TextView
        return NtpdViewHolder(textView)
    }

    override fun onBindViewHolder(holder: NtpdViewHolder, position: Int) {
        holder.textView.text = notes[position].title
    }



}