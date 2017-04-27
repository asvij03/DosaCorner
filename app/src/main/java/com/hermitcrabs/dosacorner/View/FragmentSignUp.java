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


public class FragmentSignUp extends Fragment {

    EditText mSignup_name_text, mSignup_mobile_text, mSignup_email_text, mSignup_pwd_text;
    TextView mSignup_button, mSignup_later_button;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_signup, container, false);

        mSignup_name_text = (EditText) rootview.findViewById(R.id.signup_name_text);

        mSignup_mobile_text = (EditText) rootview.findViewById(R.id.signup_mobile_text);

        mSignup_email_text = (EditText) rootview.findViewById(R.id.signup_email_text);

        mSignup_pwd_text = (EditText) rootview.findViewById(R.id.signup_pwd_text);

        mSignup_button = (TextView) rootview.findViewById(R.id.signup_button);

        mSignup_later_button = (TextView) rootview.findViewById(R.id.signup_later_button);


        mSignup_later_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),HomeActivity.class));
            }
        });


        return rootview;

    }

}