package com.example.nicha.mocktweet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tweet_recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        tweet_recycler.adapter = TweetAdapter(TweetRepository.tweets)
        floatingActionButton.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()
        tweet_recycler.adapter.notifyDataSetChanged()
    }

    override fun onClick(v: View?) {
        if(v==floatingActionButton){
            startActivity(Intent(this, WriteTweetActivity::class.java))
        }

    }
}
