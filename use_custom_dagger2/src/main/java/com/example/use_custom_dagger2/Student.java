package com.example.use_custom_dagger2;

import com.example.custom_dagger2.annation.Inject;

// 第一个注解
// 电脑
public class Student {

    @Inject // 标记 代表此对象Student 是被注入的来源Student   ---> MainActivity目标
    public Student() {

    }

}
