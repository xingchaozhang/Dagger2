package com.example.dagger2_demo_01.simple1;

import dagger.Module;
import dagger.Provides;

// 电脑的包裹
@Module
public class StudentModule {

    @Provides // 暴露我们的物品 电脑
    public Student getStudent() {
        return new Student(); // 我只需要改一处地方
    }
}

// XUtils 反射实现的
// 还是APT技术，ARouter，DataBinding，Room，Butterknife, 基本上 都是APT(主接处理器)编译期生成代码
// kapt   apt
