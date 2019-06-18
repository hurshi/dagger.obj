package io.github.hurshi.daggerobj.dagger;


import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import io.github.hurshi.daggerobj.dagger.scopes.AppScope;
import io.github.hurshi.daggerobj.simplifydagger.AutoAndroidActivityScopeComponentInjector;

@AppScope
@dagger.Component(modules = {AndroidSupportInjectionModule.class, AppModule.class, AutoAndroidActivityScopeComponentInjector.class})
public interface AppComponent extends AndroidInjector<App> {
//    void inject(Test test);
}
