package com.zzb.daggerpractice.coffee;

import javax.inject.Inject;

/**
 * Created by ZZB on 2016/10/10.
 */

public class SimpleCoffeeMaker implements CoffeeMaker {
    private static final String TAG = "SimpleCoffeeMaker";
    private String createTime;

    @Inject
    public SimpleCoffeeMaker(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public void make() {
        System.out.println("simple make coffee");
    }
}
