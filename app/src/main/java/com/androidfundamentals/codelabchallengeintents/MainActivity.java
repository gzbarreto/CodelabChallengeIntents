package com.androidfundamentals.codelabchallengeintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = findViewById(R.id.btn1);
        buttonTwo = findViewById(R.id.btn2);
        buttonThree = findViewById(R.id.btn3);
    }
    //when any button is clicked, launch second activity
    public void launchSecond(View view) {
        Intent intent = new Intent(this, TextActivity.class);
        String buttonId = view.getResources().getResourceName(view.getId());
        //checking if i got the right ID from the buttons
        Log.d(LOG_TAG, buttonId + " clicked");

    }
}