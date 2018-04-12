package com.example.nicha.mocktweet

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_tweet.view.*

/**
 * Created by Nicha on 3/29/2018.
 */
class TweetAdapter(private val tweets:ArrayList<Tweet>) : RecyclerView.Adapter<TweetAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val inflatedView = parent.inflate(R.layout.item_tweet, false)
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.item_tweet, parent, false)
        return ViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.onBind(tweet = tweets[position])

    override fun getItemCount(): Int = tweets.size

//    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
//        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
//    }

    class ViewHolder(private var v: View) : RecyclerView.ViewHolder(v){
        fun onBind(tweet:Tweet){
            with(v){
                tweetUser.text = tweet.user
                tweetText.text = tweet.text
                tweetTime.text = tweet.time
            }
        }
    }
}