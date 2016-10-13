package com.zzb.daggerpractice.jakewharton.twitter.di;

import com.zzb.daggerpractice.jakewharton.twitter.OkHttpClient;
import com.zzb.daggerpractice.jakewharton.twitter.TwitterApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ZZB on 2016/10/13.
 */
@Module
public class NetworkModule {
    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient() {
        return new OkHttpClient();
    }

    @Provides
    @Singleton
    TwitterApi provideTwitterApi(OkHttpClient client) {
        return new TwitterApi(client);
    }
}
