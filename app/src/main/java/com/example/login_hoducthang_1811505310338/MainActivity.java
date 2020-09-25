package com.example.login_hoducthang_1811505310338;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("HoDucThang_1811505310338");
    }
    public void btn_Register_Form(View view) {
        startActivity(new Intent(getApplicationContext(),Register_HoDucThang_1811505310338.class));
    }
}