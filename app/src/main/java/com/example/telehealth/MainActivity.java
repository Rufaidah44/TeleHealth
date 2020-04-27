package com.example.telehealth;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Code to start timer and take action after the timer ends


    }

    public void startcall(View view) {
            Intent intent = new Intent(MainActivity.this, VideoCall.class);
            startActivity(intent);
    }

    public void myapointment(View view) {
        Intent intent = new Intent(MainActivity.this, MyApintments.class);
        startActivity(intent);
    }

    public void newapontment(View view) {
        Intent intent = new Intent(MainActivity.this, NewApointment.class);
        startActivity(intent);
    }

    public void medecalrecord(View view) {
        Intent intent = new Intent(MainActivity.this, Medicalrecord2.class);
        startActivity(intent);
    }

    public void chatbot(View view) {
        Intent intent = new Intent(MainActivity.this, Chatbot.class);
        startActivity(intent);
    }

    public void about(View view) {
        Intent intent = new Intent(MainActivity.this, About.class);
        startActivity(intent);
    }

    public void blog(View view) {
        Intent intent = new Intent(MainActivity.this, Blog.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
