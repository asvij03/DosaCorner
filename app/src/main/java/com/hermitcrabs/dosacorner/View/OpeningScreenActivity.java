package com.hermitcrabs.dosacorner.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hermitcrabs.dosacorner.HomeActivity;
import com.hermitcrabs.dosacorner.R;

public class OpeningScreenActivity extends AppCompatActivity {


    LinearLayout mEmailSignUp;
    TextView mAlreadyReg, mMaybeLater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opening_screen);

        mEmailSignUp=(LinearLayout)findViewById(R.id.email_signup);

                mAlreadyReg = (TextView)findViewById(R.id.already_reg)    ;

        mMaybeLater= (TextView)findViewById(R.id.may_be_later)    ;



        mEmailSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OpeningScreenActivity.this,SignInActivity.class));
            }
        });


        mAlreadyReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OpeningScreenActivity.this,SignInActivity.class));
            }
        });


        mMaybeLater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OpeningScreenActivity.this,HomeActivity.class));
            }
        });


    }

}
