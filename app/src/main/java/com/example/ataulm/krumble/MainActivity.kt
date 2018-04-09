package com.example.ataulm.krumble

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cookie = Cookie("Mr Peanut", R.drawable.peanut_cookie, "Love taking long walks on the beach.")

        cookieImageView.setImageResource(cookie.image)
        nameTextView.text = cookie.name
        storyTextView.text = cookie.story
    }

    data class Cookie(val name: String, val image:Int, val story: String)
}
