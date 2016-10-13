package com.zzb.daggerpractice.jakewharton.twitter;

import java.util.List;

/**
 * Created by ZZB on 2016/10/13.
 */

public class TwitterApi {

    private final OkHttpClient client;

    public TwitterApi(OkHttpClient client) {
        this.client = client;
    }

    public void postTweet(String user, String tweet) {
        client.request("url");
        Server.addTweets(new Tweet(user, tweet));
    }

    public List<Tweet> getTweets(int count){
        return Server.getTweets();
    }
}
