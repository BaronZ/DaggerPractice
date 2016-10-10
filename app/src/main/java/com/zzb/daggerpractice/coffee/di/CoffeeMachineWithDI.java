package com.zzb.daggerpractice.coffee.di;

import com.zzb.daggerpractice.coffee.CoffeeMaker;

import javax.inject.Inject;

/**
 * Created by ZZB on 2016/10/10.
 */

public class CoffeeMachineWithDI {

    @Inject
    CoffeeMaker mCoffeeMaker;

    @Inject
    public CoffeeMachineWithDI(CoffeeMaker coffeeMaker) {
        mCoffeeMaker = coffeeMaker;
    }

    public void makeCoffee() {
        mCoffeeMaker.make();
    }
}
