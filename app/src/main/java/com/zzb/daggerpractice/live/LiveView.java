package com.zzb.daggerpractice.live;

/**
 * Created by ZZB on 2016/10/10.
 */

public interface LiveView {

    void showLoading();

    void onFetchLiveDataSuccess();

    void hideLoading();
}
