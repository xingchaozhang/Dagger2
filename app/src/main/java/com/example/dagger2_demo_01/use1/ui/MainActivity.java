package com.example.dagger2_demo_01.use1.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2_demo_01.R;
import com.example.dagger2_demo_01.use1.component.DaggerMyComponent;
import com.example.dagger2_demo_01.use1.module.DataModule;
import com.example.dagger2_demo_01.use1.module.NetworkModule;
import com.example.dagger2_demo_01.use1.object.NetworkObject;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    // 下边就是普通的方式，直接通过new方式生成一个对象。
//    NetworkObject networkObject = new NetworkObject();
//    NetworkObject networkObject2 = new NetworkObject();

    // 这下边就是通过Dagger2的注入方式来实现对象的生成。
    @Inject
    NetworkObject networkObject;
    @Inject
    NetworkObject networkObject2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 方式一
        // DaggerMyComponent.create().injectMainActivity(this);

        // 方式二 使用注解处理器生成代码的细节，来完成的
        DaggerMyComponent.builder()
                .networkModule(new NetworkModule())
                .dataModule(new DataModule())
                .build()
                // 到这里，初始化了module和component
                .injectMainActivity(this);

        // 不一样的hashCode  答：非单例
        Log.i("zxc", networkObject.hashCode() + " MainActivity"); // 不一样的hashCode
        Log.i("zxc", networkObject2.hashCode() + " MainActivity");
    }

    public void click(View view) {
        startActivity(new Intent(this, MainActivity2.class));
    }
}








