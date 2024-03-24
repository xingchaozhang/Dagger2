package com.example.dagger2_demo_01.use3.ui;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2_demo_01.R;
import com.example.dagger2_demo_01.use3.app.MyApplication;
import com.example.dagger2_demo_01.use3.obj.NetWorkObject;

import javax.inject.Inject;

public class MainActivity2 extends AppCompatActivity {

    @Inject
    NetWorkObject netWorkObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 方式三 用MyApplication  == 全局单例
        ((MyApplication)getApplication())
                .getAppComponent()
                .injectMainActivity2(this);

        Log.i("derry", netWorkObject.hashCode() + " MainActivity2");
        Toast.makeText(this, netWorkObject.hashCode() + " MainActivity2", Toast.LENGTH_SHORT).show();
    }
}