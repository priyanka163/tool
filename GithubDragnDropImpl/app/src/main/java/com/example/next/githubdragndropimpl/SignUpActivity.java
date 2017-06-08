package com.example.next.githubdragndropimpl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getActionBar().hide();

        findViewById(R.id.sign_up_proceed_sign_in_btn)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
                        finish();
                    }
                });

        findViewById(R.id.sign_up_procced_btn)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(SignUpActivity.this, MainActivity.class));
                        finish();
                    }
                });
    }
}