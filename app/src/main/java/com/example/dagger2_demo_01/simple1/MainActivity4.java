package com.example.dagger2_demo_01.simple1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2_demo_01.R;

// 微博：开放原则(对扩展开放，对修改关闭)
public class MainActivity4 extends AppCompatActivity {

    private final String TAG = MainActivity4.class.getSimpleName();

    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // student = new Student();
    }
}
