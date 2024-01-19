package com.example.myapplication;

import static android.os.Build.VERSION_CODES.R;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class OTP extends AppCompatActivity {
    String phonenumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        //printing the phone number that we have passed from login page
        phonenumber = getIntent().getExtras().getString("phone");
        Toast.makeText(getApplicationContext(),phonenumber,Toast.LENGTH_LONG).show();
        Map<String,String> data = new HashMap<>();


    }
}