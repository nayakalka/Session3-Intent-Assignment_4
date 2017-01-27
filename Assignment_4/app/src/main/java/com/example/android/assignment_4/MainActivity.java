package com.example.android.assignment_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        final EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(editTextUsername.getText().toString().trim()) && !TextUtils.isEmpty(editTextPassword.getText().toString().trim())) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("username", editTextUsername.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Username or Password not entered.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
