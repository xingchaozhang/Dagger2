package com.example.dagger2_demo_01.use1.module;

import com.example.dagger2_demo_01.use1.object.NetworkObject;

import dagger.Module;
import dagger.Provides;

/**
 * 这个类用来提供对象
 */
@Module
public class NetworkModule {

    @Provides
    public NetworkObject providerNetworkObject(){
        return new NetworkObject();
    }
}







