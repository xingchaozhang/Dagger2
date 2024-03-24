package com.example.dagger2_demo_01.use4;

import dagger.Component;

// 第三个注解
@Component(modules = DogModule.class)
public interface DogComponent { // 快递员

    // 写注入目标
    void inject(MainActivity mainActivity);
}
