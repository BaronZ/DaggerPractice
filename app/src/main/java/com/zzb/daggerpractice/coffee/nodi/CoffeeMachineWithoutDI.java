package com.zzb.daggerpractice.coffee.nodi;

import com.zzb.daggerpractice.coffee.CoffeeMaker;
import com.zzb.daggerpractice.coffee.SimpleCoffeeMaker;

import java.util.Date;

/**
 * Created by ZZB on 2016/10/10.
 */

public class CoffeeMachineWithoutDI {


    CoffeeMaker mCoffeeMaker;

    //without di
    public CoffeeMachineWithoutDI() {
        mCoffeeMaker = new SimpleCoffeeMaker(new Date().toString());
    }

    public void makeCoffee() {
        mCoffeeMaker.make();
    }
}
