package com.infinitelearning.savoricious

import android.annotation.SuppressLint
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class bikaambon : AppCompatActivity() {
    var vVideo : VideoView? = null
    var mediaControls : MediaController? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bikaambon)

        vVideo = findViewById<VideoView>(R.id.videobika) as VideoView

        if (mediaControls == null){
            mediaControls = MediaController(this)
            mediaControls !!.setAnchorView(this.vVideo)

        }

        vVideo!!.setMediaController(mediaControls)
        vVideo!!.setVideoURI(
            Uri.parse("android.resource://"
                + packageName + "/" + R.raw.bikaambon))

        vVideo!!.requestFocus()
        vVideo!!.start()

        vVideo!!.setOnCompletionListener {
            Toast.makeText(applicationContext, "Vidio Selesai",
                Toast.LENGTH_LONG).show()

        }

        vVideo!!.setOnErrorListener { mp, what, extra ->
            Toast.makeText(applicationContext, "Error" +
                    "Vidio sedang Diputar!!!", Toast.LENGTH_LONG).show()
            false


        }
        supportActionBar!! .setDisplayHomeAsUpEnabled(true)
    }
}