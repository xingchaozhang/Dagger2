package com.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) // 此注解能够在属性上注解
@Retention(RetentionPolicy.CLASS)
public @interface BindView {
    int value();
}
