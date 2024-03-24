package com.example.dagger2_demo_01.use3.module;

import com.example.dagger2_demo_01.use3.obj.DataObject;

import dagger.Module;
import dagger.Provides;

/**
 * 这个类用来提供对象
 */
@Module
public class DataModule {
    @Provides
    public DataObject providerDatabaseObject(){
        return new DataObject();
    }
}







