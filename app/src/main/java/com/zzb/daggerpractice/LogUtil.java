package com.zzb.daggerpractice;

import android.util.Log;

/**
 * Created by ZZB on 2016/10/10.
 */

public class LogUtil {

    public static void daggerLog(Object obj, String msg) {
        Log.d("dagger_log", msg + "@" + obj);
    }
}
