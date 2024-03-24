package com.example.dagger2_demo_01.use3.module;

import com.example.dagger2_demo_01.use3.obj.NetWorkObject;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 这个类用来提供对象
 */
@Singleton
@Module
public class NetworkModule {

    @Singleton
    @Provides
    public NetWorkObject providerNetworkObject(){
        return new NetWorkObject();
    }
}







