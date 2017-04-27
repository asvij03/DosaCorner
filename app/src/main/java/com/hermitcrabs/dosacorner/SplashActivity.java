package com.hermitcrabs.dosacorner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hermitcrabs.dosacorner.View.OpeningScreenActivity;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


      final Thread  MyThread = new Thread(){

          public void run()
          {
              try {
                  sleep(3000);
                  Intent intent = new Intent(getApplicationContext(),OpeningScreenActivity.class);
                  startActivity(intent);
                  finish();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }

          }
      };

        MyThread.start();

        }












}
