package com.example.android.assignment_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            if (bundle.getString("username") != null) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Welcome" + " " + bundle.getString("username") + "!");
            }
        }
    }
}
