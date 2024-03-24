package com.example.custom_dagger2;

// T 就是变化用户注入的对象
public interface Provider<T> {
    T get();
}
