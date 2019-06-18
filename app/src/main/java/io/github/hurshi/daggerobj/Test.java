package io.github.hurshi.daggerobj;

import androidx.annotation.NonNull;

import javax.inject.Inject;

import io.github.hurshi.daggerobj.dagger.scopes.ActivityScope;
import io.github.hurshi.daggerobj.lib.AndroidObjInjection;
import io.github.hurshi.simplifydagger.annotation.AutoAndroidComponent;

@AutoAndroidComponent(scope = ActivityScope.class)
public class Test {

    @Inject
    public String name;


    public Test() {
        AndroidObjInjection.inject(this);
    }


    @NonNull
    @Override
    public String toString() {
        return "Test Object name is " + name;
    }

}
