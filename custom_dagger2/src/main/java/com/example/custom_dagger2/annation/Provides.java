package com.example.custom_dagger2.annation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

// 自己写的 包裹的暴露的注解
@Target(METHOD)
@Retention(RUNTIME)
public @interface Provides {}
