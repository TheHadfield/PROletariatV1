package com.example.proletariatv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {
//AppCombat facilitates backwards compatability

    private Button loginbutton, guestbutton, signupbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Intents to push the user to the desired activity
    //Views might need different names
    //Check with emulator

    private void initviews() {
        loginbutton = findViewById(R.id.loginbutton);
        guestbutton = findViewById(R.id.guestbutton);
        signupbutton = findViewById(R.id.signupbutton);

    }


    public void launchLogin(View view) {

        Intent i = new Intent(this, SignActivity.class);
        startActivity(i);
    }//Working

    public void launchGuest(View view) {
        Intent j = new Intent(this, GuestActivity2.class);
        startActivity(j);
    }//Working

    public void launchSignUp(View view) {
        Intent k = new Intent(MainActivity.this, CreateActivity2.class);
        //try catch block used to debug error
        try {
            startActivity(k);
        }
        catch (Exception ex){
            Log.e("Error on intent",ex.getMessage());
        }
    }//Causing crash. debug or test on phone



    //Following needed to ensure app functionality in the event of notifaction or change of apps
    @Override
    protected void onStart(){
        Log.d(TAG, "onStart:started");
        super.onStart();
    }

    @Override
    protected void onResume(){
        Log.d(TAG, "onResume: started");
        super.onResume();
    }

    @Override
    protected void onPause(){
        Log.d(TAG,"onResume: started");
        super.onPause();
    }

    @Override
    protected void onStop(){
        Log.d(TAG, "onStop: Started");
        super.onStop();
    }

    @Override
    protected void onRestart(){
        Log.d(TAG,"onRestart: started");
        super.onRestart();
    }

    @Override
    protected void onDestroy(){
        Log.d(TAG,"onDestroy:Activated");
        super.onDestroy();
    }

}
