package com.example.proletariatv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class GuestActivity2 extends AppCompatActivity implements EmailFragment.EmailCreated {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest2);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, new EmailFragment());
        transaction.commit();//Needs to be applied at end of transaction
    }

    @Override
    public String onEmailCreated(Bundle emailBundle) {

        return null;
    }
}