package com.example.telehealth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Chatbot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

    }
        public void chatbot( View view) {
            Intent intent = new Intent(Chatbot.this, Chatbot.class);
            startActivity(intent);
        }

        public void about(View view) {
            Intent intent = new Intent(Chatbot.this, About.class);
            startActivity(intent);
        }

        public void blog(View view) {
            Intent intent = new Intent(Chatbot.this, Blog.class);
            startActivity(intent);
        }

        public void home(View view) {
            Intent intent = new Intent(Chatbot.this, MainActivity.class);
            startActivity(intent);
        }
    }
