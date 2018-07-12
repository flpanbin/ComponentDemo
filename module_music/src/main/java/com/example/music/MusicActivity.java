package com.example.music;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.module_common.base.BaseActivity;
import com.github.mzule.activityrouter.annotation.Router;

@Router("music_main")
public class MusicActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_main);
    }
}
