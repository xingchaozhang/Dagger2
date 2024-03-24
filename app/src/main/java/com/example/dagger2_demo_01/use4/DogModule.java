package com.example.dagger2_demo_01.use4;


import javax.inject.Inject;
import dagger.Module;
import dagger.Provides;

@Module
public class DogModule {

    @Provides
    public Dog providerDog() {
        return new Dog();
    }

}
