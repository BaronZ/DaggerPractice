package com.zzb.daggerpractice.dagger;

import com.zzb.daggerpractice.coffee.CoffeeMaker;
import com.zzb.daggerpractice.coffee.SimpleCoffeeMaker;

import java.util.Date;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ZZB on 2016/10/10.
 */

@Module
public class SimpleTestModule {

    @Provides
    CoffeeMaker provideCoffeeMaker() {
        return new SimpleCoffeeMaker(new Date().toString());
    }

}
