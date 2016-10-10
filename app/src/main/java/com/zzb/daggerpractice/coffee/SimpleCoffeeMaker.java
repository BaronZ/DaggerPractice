package com.zzb.daggerpractice.coffee;

import android.util.Log;

/**
 * Created by ZZB on 2016/10/10.
 */

public class SimpleCoffeeMaker implements CoffeeMaker {
    private static final String TAG = "SimpleCoffeeMaker";

    @Override
    public void make() {
        Log.d(TAG, "simple make coffee");
    }
}
