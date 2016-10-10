package com.zzb.daggerpractice.coffee.nodi;

import com.zzb.daggerpractice.coffee.CoffeeMaker;
import com.zzb.daggerpractice.coffee.SimpleCoffeeMaker;

/**
 * Created by ZZB on 2016/10/10.
 */

public class CoffeeMachineWithoutDI {

    private CoffeeMaker mCoffeeMaker;

    //without di
    public CoffeeMachineWithoutDI() {
        mCoffeeMaker = new SimpleCoffeeMaker();
    }


}
