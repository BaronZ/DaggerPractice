package com.zzb.daggerpractice.jakewharton.twitter.di;

import com.zzb.daggerpractice.jakewharton.twitter.TwitterApi;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ZZB on 2016/10/13.
 */

@Singleton
@Component(modules = NetworkModule.class)
public interface ApiComponent {
    TwitterApi api();
}
