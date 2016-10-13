package com.zzb.daggerpractice.jakewharton.twitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZZB on 2016/10/13.
 */

public class Server {

    private static List<Tweet> tweets = new ArrayList<>();

    public static void addTweets(Tweet tweet) {
        tweets.add(tweet);
    }

    public static List<Tweet> getTweets() {
        return tweets;
    }
}
