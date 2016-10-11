package com.zzb.daggerpractice;

import com.zzb.daggerpractice.dagger.DaggerEmptyComponent;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

/**
 * Created by ZZB on 2016/10/11.
 */

public class EmptyComponentTest {
    @Inject
    User mUser;

    @Before
    public void setUp() {
        DaggerEmptyComponent.builder().build().inject(this);
    }

//    @Test
//    public void test() {
//        mCoffeeMachine.makeCoffee();
//    }

    @Test
    public void test1() {
        Assert.assertEquals("auto inject", mUser.company.companyName);
    }
}
