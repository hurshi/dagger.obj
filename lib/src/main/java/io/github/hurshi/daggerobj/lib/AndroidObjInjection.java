package io.github.hurshi.daggerobj.lib;

import android.app.Application;

import dagger.android.AndroidInjector;
import dagger.android.HasAndroidInjector;
import dagger.android.HasServiceInjector;

import static dagger.internal.Preconditions.checkNotNull;

public class AndroidObjInjection {
    public static void inject(Object obj) {
        checkNotNull(obj, "AndroidObjInjection");
        Application application = DaggerObjApplication.getApplication();
        AndroidInjector<Object> injector;
        if (application instanceof HasAndroidInjector) {
            injector = ((HasAndroidInjector) application).androidInjector();
            checkNotNull(injector, "%s.androidInjector() returned null", application.getClass());
        } else {
            throw new RuntimeException(
                    String.format(
                            "%s does not implement %s or %s",
                            application.getClass().getCanonicalName(),
                            HasAndroidInjector.class.getCanonicalName(),
                            HasServiceInjector.class.getCanonicalName()));
        }
        injector.inject(obj);
    }

}
