package com.example.dagger2_demo_01.simple1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.dagger2_demo_01.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    @Inject
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // student = new Student(); // 用户的责任

        DaggerStudentComponent.create().injectMainActivity(this); // Dagger的责任

        Toast.makeText(this, "student:" + student.hashCode(), Toast.LENGTH_SHORT).show();
    } // 函数弹栈

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
