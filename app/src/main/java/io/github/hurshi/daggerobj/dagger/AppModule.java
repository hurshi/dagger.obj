package io.github.hurshi.daggerobj.dagger;

import dagger.Provides;
import io.github.hurshi.daggerobj.dagger.scopes.AppScope;

@dagger.Module
public class AppModule {
    @AppScope
    @Provides
    public String provideLiMing() {
        return "LiMing";
    }
}
