package com.example.use_custom_dagger2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.derry.use_custom_dagger2.R;
import com.example.custom_dagger2.annation.Inject;
import com.example.use_custom_dagger2.apt_create_dagger2.DaggerStudentComponent;

// 第四步 注入目标
public class MainActivity extends AppCompatActivity {

    @Inject // 第四个注解
    public Student student;

    @Inject // 第四个注解
    public Student student2;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 方法进栈
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 第三个注解生成的类
        DaggerStudentComponent.create().inject(this);

        Toast.makeText(this, "student:" + student.hashCode(), Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "student:" + student2.hashCode(), Toast.LENGTH_SHORT).show();
    }
}
