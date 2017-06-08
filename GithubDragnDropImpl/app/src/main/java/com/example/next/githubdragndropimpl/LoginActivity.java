package com.example.next.githubdragndropimpl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getActionBar().hide();

        findViewById(R.id.sign_in_procced_login_btn)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                        finish();
                    }
                });

        findViewById(R.id.sign_in_proceed_sign_up_btn)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
                        finish();
                    }
                });
    }
}
