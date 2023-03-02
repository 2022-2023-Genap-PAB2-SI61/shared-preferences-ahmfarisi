package com.ahmfarisi.shared_preferences_ahmfarisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvUsername;
    private Button btnLogout;
    KendaliLogin KL = new KendaliLogin(MainActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(KL.isLogin(KendaliLogin.keyPrefUsername)==true){
            setContentView(R.layout.activity_main);

            tvUsername = findViewById(R.id.tv_username);
            btnLogout = findViewById(R.id.btn_logout);
        }
        else{
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        }

    }
}