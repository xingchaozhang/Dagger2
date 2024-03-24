package com.example.custom_dagger2.annation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

// 自己写的 用户注入对象角色的注解
@Target({CONSTRUCTOR, FIELD})
@Retention(RUNTIME)
public @interface Inject {}
