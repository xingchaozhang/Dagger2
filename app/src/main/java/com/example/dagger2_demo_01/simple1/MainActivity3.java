package com.example.dagger2_demo_01.simple1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2_demo_01.R;

public class MainActivity3 extends AppCompatActivity {

    private final String TAG = MainActivity3.class.getSimpleName();

    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // student = new Student();
    }
}
