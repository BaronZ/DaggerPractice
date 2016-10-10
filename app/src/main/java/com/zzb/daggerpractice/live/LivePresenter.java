package com.zzb.daggerpractice.live;

import com.zzb.daggerpractice.LogUtil;

/**
 * Created by ZZB on 2016/10/10.
 */

public class LivePresenter {

    LiveView mLiveView;

    LiveModel mLiveModel;

    public LivePresenter(LiveView liveView, LiveModel liveModel) {
        LogUtil.daggerLog(this, "LivePresenter");
        mLiveView = liveView;
        mLiveModel = liveModel;
    }

    public void getLiveShowData() {
        mLiveView.showLoading();
        mLiveModel.getLiveDataFromNet();
        mLiveView.onFetchLiveDataSuccess();
        mLiveView.hideLoading();
    }
}
