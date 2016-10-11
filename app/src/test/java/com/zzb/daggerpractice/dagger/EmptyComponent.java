package com.zzb.daggerpractice.dagger;

import com.zzb.daggerpractice.EmptyComponentTest;

import dagger.Component;

/**
 * Created by ZZB on 2016/10/11.
 */
@Component
public interface EmptyComponent {
    void inject(EmptyComponentTest test);
}
