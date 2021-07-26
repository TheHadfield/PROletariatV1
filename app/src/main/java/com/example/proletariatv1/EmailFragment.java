package com.example.proletariatv1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;

import org.jetbrains.annotations.NotNull;

public class EmailFragment extends Fragment {
    //Interface needs to be created to pass data from Fragment to Activity
    //Implement interface and methods in parent activity

    EmailCreated activity;
    //Current error
    //    java.lang.IllegalStateException: Could not find method storeEmail(View) in a parent or ancestor Context for android:onClick attribute defined on view class com.google.android.material.button.MaterialButton with id 'confirmFra

    public interface EmailCreated {
        String onEmailCreated(Bundle emailBundle);
    }


    /*private EditText subjectLineFrag, emailFrag;
    private String emails, subject;
    private Button confirmFrag;*/
    public EditText subjectLineFrag, emailFrag;
    public String emails, subject;
    public Button confirmFrag;
    public Bundle emailBundle;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.email_fragment, container, false);
        emailFrag = view.findViewById(R.id.emailFrag);
        subjectLineFrag = view.findViewById(R.id.subjectLineFrag);
        confirmFrag = view.findViewById(R.id.confirmFrag);





        /*Bundle emailBundle = getArguments();*/
        /*if (null != emailBundle){
            String email = emailBundle.getString(emails);

        }
        subjectLineFrag = view.findViewById(R.id.subjectLineFrag);*/
        return view;
        //Instead of returning super statement I will return the view initialized above
    }

    public Bundle storeEmail(View v, EditText subjectLineFrag, EditText emailFrag) {
        //Convert user input to string and then send in a bundle down to either parent activity
        String emails = emailFrag.getText().toString();
        String subject = subjectLineFrag.getText().toString();

        //Bundle emailBundle = new Bundle();
        emailBundle.putString("message", emails);
        emailBundle.putString("subject", subject);
        return emailBundle;
    }

    @Override
    public void onAttach(@NonNull @NotNull Context context) {
        //context will refer to the attached activity
        super.onAttach(context);
        activity = (EmailCreated) context;
    }

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    //Implement Fragment Lifecycle
    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onAttach(@NonNull @NotNull Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}

