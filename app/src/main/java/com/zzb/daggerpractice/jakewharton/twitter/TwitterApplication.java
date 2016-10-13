package com.zzb.daggerpractice.jakewharton.twitter;

import javax.inject.Inject;

/**
 * Created by ZZB on 2016/10/13.
 */

public class TwitterApplication implements Runnable {

    Tweeter tweeter;
    Timeline timeline;
    @Inject
    public TwitterApplication(Tweeter tweeter, Timeline timeline) {
        this.tweeter = tweeter;
        this.timeline = timeline;
    }

    @Override
    public void run() {
        for(int i=0; i<20; i++){
            tweeter.tweet("hello twitter:" + i);
        }
        timeline.loadMore(20);
        for (Tweet tweet : timeline.get()) {
            Logger.d("TW", tweet.toString());
        }
    }
}
