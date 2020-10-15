package com.example.splashscren;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import gr.net.maroulis.library.EasySplashScreen;

public class MainActivity extends AppCompatActivity {


    private static final String MY_PREFS_NAME = "IntroScreen";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        //code for splash screen
       // splashScreen();

        //code for intro screen
        introScreen();




      

    }


    void splashScreen(){

        View easySplashScreenView = new EasySplashScreen(MainActivity.this)
                .withFullScreen()
                .withSplashTimeOut(4000)
                .withBackgroundResource(android.R.color.holo_red_light)
                .withHeaderText("Header")
                .withFooterText("Copyright 2016")
                .withBeforeLogoText("My cool company")
                .withLogo(R.drawable.image)
                .withAfterLogoText("Some more details")
                .create();

        setContentView(easySplashScreenView);

    }


    void introScreen(){

        //thi
        //sharedpreference used to check whether the intro screen was opened or not
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        boolean isOpen = prefs.getBoolean("name", true);//"No name defined" is the default value.

        //if intro screen was not opened when app was installed the code will open it
        if(isOpen){
            Intent intent=new Intent(this,MyAppIntroActivity.class);
            startActivity(intent);


            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
            editor.putBoolean("name", false);
            editor.apply();


        }


    }

 /*   boolean openIntro(){
        // MY_PREFS_NAME - a static String variable like:
       //public static final String MY_PREFS_NAME = "MyPrefsFile";



        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        boolean isOpen = prefs.getBoolean("name", false);//"No name defined" is the default value.


        return  isOpen;

    }*/


}
