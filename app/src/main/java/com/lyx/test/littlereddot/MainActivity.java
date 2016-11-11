package com.lyx.test.littlereddot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void second(View view) {
        startActivity(new Intent(this, DemoActivity.class));
    }

    public void three(View view) {
        startActivity(new Intent(this, ThreeActivity.class));
    }
}
