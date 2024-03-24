package com.example.dagger2_demo_01.use2.component;

import com.example.dagger2_demo_01.use2.module.DatabaseModule;
import com.example.dagger2_demo_01.use2.module.NetworkModule;
import com.example.dagger2_demo_01.use2.ui.MainActivity;
import com.example.dagger2_demo_01.use2.ui.MainActivity2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 组件
 */
// 快递员是不是可以 有多个包裹
@Singleton
@Component(modules = {NetworkModule.class, DatabaseModule.class})
public interface MyComponent {

    // 同学们注意：这里的参数是不能用多态
    void injectMainActivity(MainActivity activity);

    void injectMainActivity2(MainActivity2 activity2);
}
