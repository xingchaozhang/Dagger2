package com.example.use_custom_dagger2;

import com.example.custom_dagger2.annation.Component;

// 第三个注解
@Component(modules = StudentModule.class)
public interface StudentComponent { // 快递员

    // 写注入目标  MainActivity的this
    void inject(MainActivity mainActivity);
}
