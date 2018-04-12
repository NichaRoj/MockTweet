package com.example.nicha.mocktweet

/**
 * Created by Nicha on 3/29/2018.
 */
class TweetRepository {
    companion object {
        var tweets: ArrayList<Tweet> = ArrayList<Tweet>()
        fun addDefaults(){
            tweets.add(Tweet())
            tweets.add(Tweet())
            tweets.add(Tweet())
        }

        fun addTweet(user: String, text: String, time: String){
            tweets.add(Tweet(user,text,time))
        }
    }
}