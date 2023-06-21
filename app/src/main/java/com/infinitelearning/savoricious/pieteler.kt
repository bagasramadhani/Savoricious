package com.infinitelearning.savoricious

import android.annotation.SuppressLint
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class pieteler : AppCompatActivity() {
    var vVideo : VideoView? = null
    var mediaControls : MediaController? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pieteler)

        vVideo = findViewById<VideoView>(R.id.videopie) as VideoView

        if (mediaControls == null){
            mediaControls = MediaController(this)
            mediaControls !!.setAnchorView(this.vVideo)

        }

        vVideo!!.setMediaController(mediaControls)
        vVideo!!.setVideoURI(
            Uri.parse("android.resource://"
                + packageName + "/" + R.raw.wafer))

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