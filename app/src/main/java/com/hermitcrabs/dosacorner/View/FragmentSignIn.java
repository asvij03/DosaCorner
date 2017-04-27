package com.hermitcrabs.dosacorner.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.hermitcrabs.dosacorner.HomeActivity;
import com.hermitcrabs.dosacorner.R;

/**
 * Created by Niranjan on 4/26/2017.
 */

public class FragmentSignIn extends Fragment {

    EditText mSignin_email_text,mSignin_pwd_text;
    TextView mSignin_forgot_pwd, mSignin_button, mSignin_later_button;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootview = inflater.inflate(R.layout.fragment_signin, container, false);


        mSignin_email_text=(EditText)rootview.findViewById(R.id.signin_email_text);

        mSignin_pwd_text=(EditText)rootview.findViewById(R.id.signin_pwd_text);

        mSignin_forgot_pwd=(TextView) rootview.findViewById(R.id.signin_forgot_pwd);

        mSignin_button=(TextView)rootview.findViewById(R.id.signin_button);

        mSignin_later_button=(TextView)rootview.findViewById(R.id.signin_later_button);



        mSignin_later_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),HomeActivity.class));
            }
        });


        return rootview;


    }




}
