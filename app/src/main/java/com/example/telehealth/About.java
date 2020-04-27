package com.example.telehealth;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void send(View view) {
        Toast.makeText(getApplicationContext(),"تم ارسال رسالتك",Toast.LENGTH_SHORT).show();

    }
}
