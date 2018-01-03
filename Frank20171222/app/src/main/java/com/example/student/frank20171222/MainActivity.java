package com.example.student.frank20171222;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
        ed = (EditText) findViewById(R.id.editText);
        tv.setText("Hello Frank");
    }
        public void click1(View v)
        {
            String str=ed.getText().toString();
            tv.setText("Good Afternoon\n"+str);

        }
}
