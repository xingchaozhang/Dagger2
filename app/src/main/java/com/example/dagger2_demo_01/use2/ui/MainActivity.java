package com.example.dagger2_demo_01.use2.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2_demo_01.R;
import com.example.dagger2_demo_01.use2.component.DaggerMyComponent;
import com.example.dagger2_demo_01.use2.module.DatabaseModule;
import com.example.dagger2_demo_01.use2.module.NetworkModule;
import com.example.dagger2_demo_01.use2.obj.NetworkObject;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkObject networkObject; // = new HttpObject()

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
                .httpModule(new NetworkModule())
                .databaseModule(new DatabaseModule())
                .build()
                // 到这里，初始化了module和component
                .injectMainActivity(this);

        // hashCode 两个一样的   答：局部单例
        Log.i("derry", networkObject.hashCode() + " MainActivity");
        Log.i("derry", networkObject2.hashCode() + " MainActivity");
    }

    public void click(View view) {
        startActivity(new Intent(this, MainActivity2.class));
    }
}








