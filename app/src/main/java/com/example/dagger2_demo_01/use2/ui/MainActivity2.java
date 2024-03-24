package com.example.dagger2_demo_01.use2.ui;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2_demo_01.R;
import com.example.dagger2_demo_01.use2.component.DaggerMyComponent;
import com.example.dagger2_demo_01.use2.obj.NetworkObject;

import javax.inject.Inject;

// 局部单例
public class MainActivity2 extends AppCompatActivity {

    @Inject
    NetworkObject networkObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 方式一
        DaggerMyComponent.create().injectMainActivity2(this);

        // hashCode 和 前面的那个Activity 是不一样的   答：所以局部单例
        Log.i("derry", networkObject.hashCode() + " MainActivity2");
    }
}