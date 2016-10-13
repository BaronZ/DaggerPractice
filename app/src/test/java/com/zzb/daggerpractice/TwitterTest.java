package com.zzb.daggerpractice;

import com.zzb.daggerpractice.jakewharton.twitter.TwitterApplication;
import com.zzb.daggerpractice.jakewharton.twitter.di.ApiComponent;
import com.zzb.daggerpractice.jakewharton.twitter.di.DaggerApiComponent;
import com.zzb.daggerpractice.jakewharton.twitter.di.DaggerTwitterComponent;
import com.zzb.daggerpractice.jakewharton.twitter.di.TwitterComponent;
import com.zzb.daggerpractice.jakewharton.twitter.di.TwitterModule;

import org.junit.Test;

/**
 * Created by ZZB on 2016/10/13.
 */

public class TwitterTest {

    @Test
    public void test(){
        ApiComponent apiComponent = DaggerApiComponent.create();
        TwitterComponent component = DaggerTwitterComponent.builder()
                .apiComponent(apiComponent)
                .twitterModule(new TwitterModule("realbo89")).build();
//        component.inject(this);
        TwitterApplication twitterApp = component.app();
        twitterApp.run();
    }
}
