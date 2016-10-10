package com.zzb.daggerpractice;

import com.zzb.daggerpractice.coffee.nodi.CoffeeMachineWithoutDI;

import org.junit.Test;

/**
 * Created by ZZB on 2016/10/10.
 */

public class WithoutDITest {

    @Test
    public void test() {
        CoffeeMachineWithoutDI machine = new CoffeeMachineWithoutDI();
        machine.makeCoffee();
    }
}
