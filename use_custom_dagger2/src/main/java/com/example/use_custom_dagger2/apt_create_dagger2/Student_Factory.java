package com.example.use_custom_dagger2.apt_create_dagger2;

import com.example.custom_dagger2.Factory;
import com.example.use_custom_dagger2.Student;

// TODO 模拟 这个是编译期 APT 自动生成的  // 第一个注解
public enum Student_Factory  implements Factory<Student> {

    INSTANCE;

    @Override
    public Student get() {
        return new Student();
    }

    public static Factory<Student> create() {
        return INSTANCE;
    }
}
