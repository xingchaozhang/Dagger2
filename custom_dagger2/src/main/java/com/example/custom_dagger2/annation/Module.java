package com.example.custom_dagger2.annation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

// 自己写的 包裹的注解
@Target(TYPE)
@Retention(RUNTIME)
public @interface Module {}
