package com.example.expensify;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class RegistrationActivity extends Activity {

    public void onClick3(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
}
