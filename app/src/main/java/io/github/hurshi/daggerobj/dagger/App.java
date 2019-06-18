package io.github.hurshi.daggerobj.dagger;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import io.github.hurshi.daggerobj.lib.DaggerObjApplication;

public class App extends DaggerObjApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();
    }
}
