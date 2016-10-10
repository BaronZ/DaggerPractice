package com.zzb.daggerpractice.live;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.zzb.daggerpractice.R;

import javax.inject.Inject;

public class LiveActivity extends AppCompatActivity implements LiveView{

    @Inject
    LivePresenter mLivePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);

        DaggerLiveComponent.builder().liveModule(new LiveModule(this)).build().inject(this);

        mLivePresenter.getLiveShowData();

    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "loading", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFetchLiveDataSuccess() {
        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideLoading() {
        Toast.makeText(this, "hide", Toast.LENGTH_SHORT).show();
    }
}
