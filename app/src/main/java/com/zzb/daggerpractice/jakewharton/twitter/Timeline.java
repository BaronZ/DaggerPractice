package com.zzb.daggerpractice.jakewharton.twitter;

import java.util.List;

/**
 * Created by ZZB on 2016/10/13.
 */

public class Timeline {
    private static final String TAG = "Timeline";
    private final TwitterApi api;
    private final String user;
    private List<Tweet> tweets;

    public Timeline(TwitterApi api, String user) {
        this.api = api;
        this.user = user;
    }

    public void loadMore(int count) {
        Logger.d(TAG, "loadMore");
        tweets = api.getTweets(count);
    }

    public List<Tweet> get() {
        Logger.d(TAG, "get");
        return tweets;
    }
}
