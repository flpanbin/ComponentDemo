package com.example.juniorpan.myapplication.app;

import com.example.module_common.base.BaseAppliction;
import com.github.mzule.activityrouter.annotation.Modules;

@Modules({"book","music"})
public class app extends BaseAppliction {
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
