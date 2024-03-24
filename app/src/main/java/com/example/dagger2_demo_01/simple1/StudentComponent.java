package com.example.dagger2_demo_01.simple1;

import dagger.Component;

// 快递员
@Component(modules = StudentModule.class)
public interface StudentComponent {

    // 收货地址 用户的地址 注入进来 MainActivity
    void injectMainActivity(MainActivity mainActivity);

}
