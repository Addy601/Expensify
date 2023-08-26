package com.example.expensify;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class ResetActivity extends Activity {
    public void onClick2(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
}
