package com.example.administrator.myndkceshi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HelloJni helloJni = new HelloJni();
        helloJni.HelloWord(2000);
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(helloJni.HelloWord(220)+"");
//        helloJni.sayHello();
    }
}
