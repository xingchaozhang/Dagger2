package com.example.dagger2_demo_01.use4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2_demo_01.R;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Dog dog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

}








