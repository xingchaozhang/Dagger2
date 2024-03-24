package com.example.custom_dagger2;

/**
 * 就相当于是工具类，用于监测的
 */
public class Preconditions {

    public static <T> T checkNotNull(T value) {
        if (null == value) {
            throw new NullPointerException("value is null exception..");
        }
        return value;
    }

    public static <T> T checkNotNull(T value, String errorMessage) {
        if (null == value) {
            throw  new IllegalArgumentException(errorMessage);
        }
        return value;
    }
}
