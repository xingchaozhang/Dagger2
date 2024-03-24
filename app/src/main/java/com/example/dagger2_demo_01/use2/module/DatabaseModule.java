package com.example.dagger2_demo_01.use2.module;

import com.example.dagger2_demo_01.use2.obj.DatabaseObject;

import dagger.Module;
import dagger.Provides;

/**
 * 这个类用来提供对象
 */
@Module
public class DatabaseModule {
    @Provides
    public DatabaseObject providerDatabaseObject(){
        return new DatabaseObject();
    }
}







