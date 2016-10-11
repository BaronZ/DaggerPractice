package com.zzb.daggerpractice;

import javax.inject.Inject;

/**
 * Created by ZZB on 2016/10/11.
 */

public class Company {

    public String companyName;

    @Inject
    public Company() {
        System.out.println(this);
        this.companyName = "auto inject";
    }
}
