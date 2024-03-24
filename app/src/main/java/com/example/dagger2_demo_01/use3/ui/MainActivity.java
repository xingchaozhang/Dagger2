package com.example.dagger2_demo_01.use3.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2_demo_01.R;
import com.example.dagger2_demo_01.use3.app.MyApplication;
import com.example.dagger2_demo_01.use3.obj.NetWorkObject;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetWorkObject netWorkObject; // = new HttpObject()

    @Inject
    NetWorkObject netWorkObject2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 方式一
        // DaggerMyComponent.create().injectMainActivity(this);

        // 方式二
        /*DaggerMyComponent.builder()
                .httpModule(new HttpModule())
                .databaseModule(new DatabaseModule())
                .build()
                // 到这里，初始化了module和component
                .injectMainActivity(this);*/

        // 方式三  用MyApplication  == 全局单例
        ((MyApplication)getApplication())
                .getAppComponent()
                .injectMainActivity(this);

        Log.i("zxc", netWorkObject.hashCode() + " MainActivity");
        Log.i("zxc", netWorkObject2.hashCode() + " MainActivity");
    }

    public void click(View view) {
        startActivity(new Intent(this, MainActivity2.class));
    }
}








