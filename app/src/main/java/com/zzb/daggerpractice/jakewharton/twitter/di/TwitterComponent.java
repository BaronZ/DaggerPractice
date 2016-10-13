package com.zzb.daggerpractice.jakewharton.twitter.di;

import com.zzb.daggerpractice.jakewharton.twitter.TwitterApplication;

import dagger.Component;

/**
 * Created by ZZB on 2016/10/13.
 */
@User
@Component(dependencies = ApiComponent.class, modules = {TwitterModule.class})
public interface TwitterComponent {

    TwitterApplication app();

//    void inject(TwitterActivity activity);
}
