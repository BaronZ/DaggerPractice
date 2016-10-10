package com.zzb.daggerpractice;

import com.zzb.daggerpractice.coffee.di.CoffeeMachineWithDI;
import com.zzb.daggerpractice.dagger.DaggerSimpleTestComponent;

import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

/**
 * Created by ZZB on 2016/10/10.
 */

public class DaggerTest {

    @Inject
    CoffeeMachineWithDI mCoffeeMachine;

    @Before
    public void setUp() {
        DaggerSimpleTestComponent.builder().build().inject(this);
    }

    @Test
    public void test(){
        mCoffeeMachine.makeCoffee();
    }


}
