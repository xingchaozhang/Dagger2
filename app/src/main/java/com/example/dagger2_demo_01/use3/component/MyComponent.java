package com.example.dagger2_demo_01.use3.component;

import com.example.dagger2_demo_01.use3.module.DataModule;
import com.example.dagger2_demo_01.use3.module.NetworkModule;
import com.example.dagger2_demo_01.use3.ui.MainActivity;
import com.example.dagger2_demo_01.use3.ui.MainActivity2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 组件
 */
// 快递员是不是可以 有多个包裹
@Singleton // 三处地方增加  @Singleton  就是局部单例 +  MyApplication  =  全局单例
@Component(modules = {NetworkModule.class, DataModule.class})
public interface MyComponent {

    // 同学们注意：这里的参数是不能用多态
    void injectMainActivity(MainActivity activity);

    void injectMainActivity2(MainActivity2 activity2);
}
