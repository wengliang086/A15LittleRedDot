package com.lyx.test.littlereddot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.carlos.notificatoinbutton.library.NotificationButton;

public class ThreeActivity extends AppCompatActivity {
    private NotificationButton button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);
        button2 = (NotificationButton) findViewById(R.id.button2);
        button3 = (NotificationButton) findViewById(R.id.button3);
        button4 = (NotificationButton) findViewById(R.id.button4);
        button5 = (NotificationButton) findViewById(R.id.button5);
        button2.setNotificationNumber(120);
        button3.setNotificationNumber(85);
        button4.setNotificationNumber(9);
        button5.setNotificationNumber(0);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button5.setNotificationNumber(88);
            }
        });
    }
}
