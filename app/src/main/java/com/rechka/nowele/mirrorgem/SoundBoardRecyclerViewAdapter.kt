package com.rechka.nowele.mirrorgem

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class SoundBoardRecyclerViewAdapter(val buttons: Array<String>)
    : RecyclerView.Adapter<SoundBoardRecyclerViewAdapter.SoundBoardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SoundBoardViewHolder {

        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.sound_button, null)

        return SoundBoardViewHolder(itemView)

    }

    override fun getItemCount(): Int = buttons.size


    override fun onBindViewHolder(holder: SoundBoardViewHolder, position: Int) {

        //@TODO - set images

        holder.itemTextView.text = buttons[position]

    }


    class SoundBoardViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView) {

        val itemTextView: TextView = itemView.findViewById<View>(R.id.button_text) as TextView

    }

}