package com.start.mobiletodo.notepad

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.start.mobiletodo.R
import com.start.mobiletodo.model.Note

class NotepadAdapter(private var notes: List<Note>, private var listener : OnItemClickListener) : RecyclerView.Adapter<NotepadAdapter.NtpdViewHolder>() {

    init {
        this.notes = notes
        this.listener = listener
    }

    class NtpdViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView = itemView?.findViewById(R.id.item_textView_notepad) as TextView

        fun bind(note : Note, listener : OnItemClickListener) {
            //вот тут какая-то херня, пробовал варианты textView, noteView вместо itemView,
            //все время жалуется на одно и то же (а noteView вообще не знает, что такое, что логично)
            itemView.setOnClickListener(View.OnClickListener() {
                override fun onClick(View v) {
                    listener.onItemClick(note);
                }
            })
        }
    }

    interface OnItemClickListener {
        fun onItemClick(note: Note)
    }

    override fun getItemCount() = notes.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotepadAdapter.NtpdViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_recycleview_notepad, parent, false)
        return NtpdViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NtpdViewHolder, position: Int) {

        holder?.textView?.text = notes[position].title
        holder.bind(notes.get(position), listener)
    }

}