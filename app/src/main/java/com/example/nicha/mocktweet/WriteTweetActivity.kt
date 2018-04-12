package com.example.nicha.mocktweet

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_write_tweet.*
import java.text.DateFormat
import java.util.*

class WriteTweetActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_write_tweet)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v==button){
            TweetRepository.addTweet(tweetUserWrite.text.toString(),
                    tweetTextWrite.text.toString(),
                    DateFormat.getDateTimeInstance().format(Date()))
            this.finish()
        }
    }
}
