package com.example.dagger2_demo_01.use3.app;

import android.app.Application;

import com.example.dagger2_demo_01.use3.component.DaggerMyComponent;
import com.example.dagger2_demo_01.use3.component.MyComponent;
import com.example.dagger2_demo_01.use3.module.DataModule;
import com.example.dagger2_demo_01.use3.module.NetworkModule;

public class MyApplication extends Application {

    private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        // 就是把之前Activity的代码，拿上来了而已
        myComponent= DaggerMyComponent.builder()
                .httpModule(new NetworkModule())
                .databaseModule(new DataModule())
                .build();
    }

    public MyComponent getAppComponent(){
        return myComponent;
    }
}
