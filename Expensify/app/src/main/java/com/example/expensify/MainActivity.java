package com.example.expensify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
     EditText email_login;
    EditText password_login;
    Button btn_login;
    boolean isUsernameValid, isPasswordValid;
    TextInputLayout usernameError, passError;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email_login= (EditText) findViewById(R.id.email_login);
        password_login= (EditText) findViewById(R.id.password_login);
        btn_login= (Button) findViewById(R.id.btn_login);
        usernameError = (TextInputLayout) findViewById(R.id.usernameError);
        passError = (TextInputLayout) findViewById(R.id.passError);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetValidation();
            }
        });
    }
    public void SetValidation() {
        // Check for a valid  Username.
        if (email_login.getText().toString().isEmpty()) {
            usernameError.setError(getResources().getString(R.string.username_error));
            isUsernameValid = false;
        } else if  (email_login.getText().length() >= 11) {
            usernameError.setError(getResources().getString(R.string.error_invalid_Userame));
            isUsernameValid = false;

        } else  {
            isUsernameValid= true;
            usernameError.setErrorEnabled(false);
        }

        // Check for a valid password.
        if (password_login.getText().toString().isEmpty()) {
            passError.setError(getResources().getString(R.string.password_error));
            isPasswordValid = false;
        } else if (password_login.getText().length() > 8) {
            passError.setError(getResources().getString(R.string.error_invalid_password));
            isPasswordValid = false;

        } else  {
            isPasswordValid = true;
            passError.setErrorEnabled(false);
        }

        if (isUsernameValid && isPasswordValid) {
            Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
        }
        else{
            counter++;
            Toast.makeText(getApplicationContext(), "Login UnSuccessful Attempts="+counter, Toast.LENGTH_SHORT).show();
        }

    }

    public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(),RegistrationActivity.class));
    }

    public void onClick1(View view) {
        startActivity(new Intent(getApplicationContext(),ResetActivity.class));
    }


}