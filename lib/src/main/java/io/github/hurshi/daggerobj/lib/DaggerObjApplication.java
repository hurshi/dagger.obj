package io.github.hurshi.daggerobj.lib;

import android.app.Application;

import dagger.android.support.DaggerApplication;

public abstract class DaggerObjApplication extends DaggerApplication {
    private static Application application;

    static Application getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }
}
