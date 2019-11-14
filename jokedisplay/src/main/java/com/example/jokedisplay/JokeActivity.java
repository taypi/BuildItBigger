package com.example.jokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView textview = findViewById(R.id.tv_joke);

        String joke = getIntent().getStringExtra(Intent.EXTRA_TEXT);

        if (joke == null) {
            joke = "No jokes for you!";
        }
        textview.setText(joke);
    }
}
