package com.example.dagger2_demo_01.use2.module;

import com.example.dagger2_demo_01.use2.obj.NetworkObject;

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
    public NetworkObject providerNetworkObject(){
        return new NetworkObject();
    }
}







