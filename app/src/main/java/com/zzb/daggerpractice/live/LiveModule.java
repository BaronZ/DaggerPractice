package com.zzb.daggerpractice.live;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ZZB on 2016/10/10.
 */
@Module
public class LiveModule {
    private LiveView mLiveView;

    public LiveModule(LiveView liveView) {
        mLiveView = liveView;
    }

    @Provides
    @Singleton
    LiveModel provideLiveModel() {
        return new LiveModel();
    }

    @Provides
    LivePresenter provideLivePresenter(LiveView liveView, LiveModel liveModel) {
        return new LivePresenter(liveView, liveModel);
    }

    @Provides
    LiveView provideLiveView(){
        return mLiveView;
    }
}
