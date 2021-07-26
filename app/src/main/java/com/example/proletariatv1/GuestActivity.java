package com.example.proletariatv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GuestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);
    }

    /*public void launchnextStep(View view) {
        Intent k = new Intent(this, CreateActivity2.class);
        startActivity(k);
        Validate fields have been filled in
                Validate for language etc.
        If One box is ticked go to one activity, if the other box is ticked go to the other
    }*/
}