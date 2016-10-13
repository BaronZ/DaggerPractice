package com.zzb.daggerpractice.jakewharton.twitter.di;

import com.zzb.daggerpractice.jakewharton.twitter.Timeline;
import com.zzb.daggerpractice.jakewharton.twitter.Tweeter;
import com.zzb.daggerpractice.jakewharton.twitter.TwitterApi;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ZZB on 2016/10/13.
 */
@Module
public class TwitterModule {
    private final String user;

    public TwitterModule(String user) {
        this.user = user;
    }

    @Provides
    @User
//    @Singleton can not be used in un scoped component
    Tweeter provideTweeter(TwitterApi api) {
        return new Tweeter(api, user);
    }

    @Provides
    @User
//    @Singleton can not be used in un scoped component
    Timeline provideTimeline(TwitterApi api) {
        return new Timeline(api, user);
    }
}
