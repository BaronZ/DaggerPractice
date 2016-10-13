package com.zzb.daggerpractice.jakewharton.twitter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zzb.daggerpractice.R;
import com.zzb.daggerpractice.jakewharton.twitter.di.ApiComponent;
import com.zzb.daggerpractice.jakewharton.twitter.di.DaggerApiComponent;
import com.zzb.daggerpractice.jakewharton.twitter.di.DaggerTwitterComponent;
import com.zzb.daggerpractice.jakewharton.twitter.di.TwitterComponent;
import com.zzb.daggerpractice.jakewharton.twitter.di.TwitterModule;

public class TwitterActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        ApiComponent apiComponent = DaggerApiComponent.create();
        TwitterComponent component = DaggerTwitterComponent.builder()
                .apiComponent(apiComponent)
                .twitterModule(new TwitterModule("realbo89")).build();
//        component.inject(this);
        TwitterApplication twitterApp = component.app();
        twitterApp.run();

    }
}
