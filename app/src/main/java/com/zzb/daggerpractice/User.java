package com.zzb.daggerpractice;

import javax.inject.Inject;

/**
 * Created by ZZB on 2016/10/11.
 */

public class User {
    @Inject
    Company company;

    @Inject
    public User() {
        System.out.println(this);
    }
}
