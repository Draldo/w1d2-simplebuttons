package com.example.draldo.simplebuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doMagic(View view) {
        LinearLayout ll =  (LinearLayout)findViewById(R.id.a_main_layout);
        Button btn2 = (Button)findViewById(R.id.a_main_btn_2);
        Button btn3 = (Button)findViewById(R.id.a_main_btn_3);

        ll.removeView(btn2);
        ll.removeView(btn3);
    }
}
