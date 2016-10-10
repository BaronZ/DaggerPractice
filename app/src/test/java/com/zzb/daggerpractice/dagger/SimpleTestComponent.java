package com.zzb.daggerpractice.dagger;

import com.zzb.daggerpractice.DaggerTest;

import dagger.Component;

/**
 * Created by ZZB on 2016/10/10.
 */

@Component(modules = SimpleTestModule.class)
public interface SimpleTestComponent {

    void inject(DaggerTest daggerTest);
}
