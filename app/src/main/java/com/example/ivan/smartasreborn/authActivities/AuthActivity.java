package com.example.ivan.smartasreborn.authActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ivan.smartasreborn.R;

public class AuthActivity extends AppCompatActivity implements View.OnClickListener{

    TextView recoverPassText;
    TextView registerLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        recoverPassText = (TextView) findViewById(R.id.activity_auth_recover_password_label);
        registerLabel = (TextView) findViewById(R.id.activity_auth_register_label);

        recoverPassText.setOnClickListener(this);
        registerLabel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.activity_auth_recover_password_label:
                startActivity(new Intent(getApplicationContext(), RecoverPassActivity.class));
                break;
            case R.id.activity_auth_register_label:
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
                break;
            default:
                break;
        }
    }
}
