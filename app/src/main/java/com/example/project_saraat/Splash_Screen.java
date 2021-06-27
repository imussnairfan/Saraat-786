package com.example.project_saraat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs",MODE_PRIVATE);
        String FirstTime = sharedPreferences.getString("FirstTimeInstall","Yes");

        if(FirstTime.equals("Yes")){

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Splash_Screen.this, onboarding.class);
                    startActivity(intent);
                    finish();
                }
            },2000);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("FirstTimeInstall","No");
            editor.apply();
        }
        if(FirstTime.equals("No")){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Splash_Screen.this,MainActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                }
            },2000);
        }
    }
}