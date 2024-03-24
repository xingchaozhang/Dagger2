package com.example.use_custom_dagger2;

import com.example.custom_dagger2.annation.Module;
import com.example.custom_dagger2.annation.Provides;

// 第二个注解
@Module
public class StudentModule {

    @Provides
    public Student providerStudent() {
        return new Student();
    }
}
