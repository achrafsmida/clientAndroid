package com.example.sghaier.foodin;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.google.android.gms.common.api.GoogleApiClient;

import java.util.logging.Handler;


public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent openMainActivity =  new Intent(Splash.this,Temp.class);
                    startActivity(openMainActivity);
                }
            }
        };
        timer.start();


    }


}
