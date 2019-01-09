package com.start.mobiletodo.notepad

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.start.mobiletodo.R
import com.start.mobiletodo.model.Note

class NotepadAdapter(private var notes: List<Note>, private var onItemClickListener: (Note) -> Unit) : RecyclerView.Adapter<NotepadAdapter.NtpdViewHolder>() {

    class NtpdViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView = itemView.findViewById(R.id.item_textView_notepad) as TextView
    }

    override fun getItemCount() = notes.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotepadAdapter.NtpdViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_recycleview_notepad, parent, false)
        return NtpdViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NtpdViewHolder, position: Int) {

        holder.textView.text = notes[position].title
        holder.itemView.setOnClickListener {
            onItemClickListener(notes[position])
        }
    }

}