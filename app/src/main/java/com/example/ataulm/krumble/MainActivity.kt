package com.example.ataulm.krumble

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cookieImageView.setImageResource(R.drawable.peanut_cookie)
        nameTextView.text = "Mr Peanut"
        storyTextView.text = "Love taking long walks on the beach."
    }
}
