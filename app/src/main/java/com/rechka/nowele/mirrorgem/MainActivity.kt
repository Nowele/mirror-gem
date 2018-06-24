package com.rechka.nowele.mirrorgem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var soundRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        soundRecyclerView = findViewById(R.id.sound_recycler_view)
        soundRecyclerView.layoutManager = LinearLayoutManager(this)
        soundRecyclerView.adapter = SoundBoardRecyclerViewAdapter(resources.getStringArray(R.array.buttons))

    }
}
