package com.zzb.daggerpractice.jakewharton.twitter;

/**
 * Created by ZZB on 2016/10/13.
 */

public class Tweeter {
    private final TwitterApi api;
    private final String user;

    public Tweeter(TwitterApi api, String user) {
        this.api = api;
        this.user = user;
    }

    public void tweet(String tweet) {
        api.postTweet(user, tweet);
    }
}
