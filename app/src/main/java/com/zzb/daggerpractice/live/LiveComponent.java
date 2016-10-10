package com.zzb.daggerpractice.live;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ZZB on 2016/10/10.
 */
@Singleton
@Component(modules = LiveModule.class)
public interface LiveComponent {

    void inject(LiveActivity liveActivity);
}
