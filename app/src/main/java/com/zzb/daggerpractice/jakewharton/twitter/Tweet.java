package com.zzb.daggerpractice.jakewharton.twitter;

/**
 * Created by ZZB on 2016/10/13.
 */

public class Tweet {

    String user;
    String tweet;

    public Tweet(String tweet, String user) {
        this.tweet = tweet;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "user='" + user + '\'' +
                ", tweet='" + tweet + '\'' +
                '}';
    }
}
