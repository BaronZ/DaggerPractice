package com.zzb.daggerpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * @Inject 可以标注需要依赖的成员变量，也可以标注提供依赖的构造函数
         *
         *
         */
    }
}
