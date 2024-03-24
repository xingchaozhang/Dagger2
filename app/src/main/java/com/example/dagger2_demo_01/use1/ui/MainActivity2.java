package com.example.dagger2_demo_01.use1.ui;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2_demo_01.R;
import com.example.dagger2_demo_01.use1.component.DaggerMyComponent;
import com.example.dagger2_demo_01.use1.object.NetworkObject;

import javax.inject.Inject;

public class MainActivity2 extends AppCompatActivity {

    @Inject
    NetworkObject networkObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 方式一
        DaggerMyComponent.create().injectMainActivity2(this);

        Log.i("derry", networkObject.hashCode() + " MainActivity2");
    }
}