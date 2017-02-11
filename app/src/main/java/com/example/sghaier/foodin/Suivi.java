package com.example.sghaier.foodin;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Suivi extends AppCompatActivity {
    LinearLayout linearsuivi,idcontacter;
    ImageView imgflech;
    boolean flech =false;
    TextView suivi_tv1,suivi_tv2,suivi_tv3,suivi_tv4,suivi_tv5,suivi_tv6,suivi_tv7;
    Typeface tf1,tf2,tf3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suivi);

        linearsuivi = (LinearLayout) findViewById(R.id.linearsuivi);
        idcontacter = (LinearLayout) findViewById(R.id.idcontacter);
        imgflech = (ImageView) findViewById(R.id.imgflech);

        suivi_tv1 = (TextView) findViewById(R.id.suivi_tv1);
        suivi_tv2 = (TextView) findViewById(R.id.suivi_tv2);
        suivi_tv3 = (TextView) findViewById(R.id.suivi_tv3);
        suivi_tv4 = (TextView) findViewById(R.id.suivi_tv4);
        suivi_tv5 = (TextView) findViewById(R.id.suivi_tv5);
        suivi_tv6 = (TextView) findViewById(R.id.suivi_tv6);
        suivi_tv7 = (TextView) findViewById(R.id.suivi_tv7);

        tf1 = Typeface.createFromAsset(getAssets(), "fonts/GothamRounded-Bold.otf");
        tf2 = Typeface.createFromAsset(getAssets(), "fonts/GothamRounded-Medium.otf");
        tf3 = Typeface.createFromAsset(getAssets(), "fonts/GothamRounded-Light.otf");

        suivi_tv1.setTypeface(tf2);

        suivi_tv2.setTypeface(tf1);

        suivi_tv3.setTypeface(tf2);
        suivi_tv4.setTypeface(tf2);
        suivi_tv5.setTypeface(tf2);
        suivi_tv6.setTypeface(tf2);

        suivi_tv7.setTypeface(tf1);

        imgflech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(flech)
                {
                    linearsuivi.setVisibility(View.VISIBLE);
                    idcontacter.setVisibility(View.VISIBLE);
                    imgflech.setImageResource(R.drawable.flechehaut);
                    flech=false;
                }else{
                    linearsuivi.setVisibility(View.GONE);
                    idcontacter.setVisibility(View.GONE);
                    imgflech.setImageResource(R.drawable.flechebas);
                    flech=true;
                }
            }
        });
    }
}
