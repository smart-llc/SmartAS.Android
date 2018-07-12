package com.example.ivan.smartasreborn.authActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ivan.smartasreborn.R;

public class AuthActivity extends AppCompatActivity {

    TextView recoverPassText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        recoverPassText = (TextView) findViewById(R.id.activity_auth_recover_password_label);
        recoverPassText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RecoverPassActivity.class));
            }
        });
    }
}
