package com.rechka.nowele.mirrorgem

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var soundRecyclerView: RecyclerView

    lateinit var mediaPlayer: MediaPlayer

    var wasPlaying = false

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        mediaPlayer = MediaPlayer.create(this, R.raw.theme_song)

        soundRecyclerView = findViewById(R.id.sound_recycler_view)
        soundRecyclerView.layoutManager = LinearLayoutManager(this)
        soundRecyclerView.adapter = SoundBoardRecyclerViewAdapter(this, mediaPlayer, resources.getStringArray(R.array.buttons))
    }

    override fun onPause() {
        super.onPause()
        backgroundPlayer()
    }

    override fun onResume() {
        super.onResume()
        foregroundPlayer()
    }

    private fun backgroundPlayer() {
        if (mediaPlayer.isPlaying) {
            wasPlaying = true
            mediaPlayer.pause()
        } else {
            wasPlaying = false
        }
    }

    private fun foregroundPlayer() {
        if (wasPlaying) {
            mediaPlayer.start()
        }
    }


}
