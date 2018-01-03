package com.example.student.a20180103_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.imageView);

    }

    public void click1(View v)
    {
        iv.setImageResource(R.drawable.p1);
    }
    public void  click2(View v)
    {
        Picasso.with(this).load("http://www.soeasyedu.com.tw/updimg/Header_2017/banner1226_01.jpg")
            .into(iv);
    }
}
