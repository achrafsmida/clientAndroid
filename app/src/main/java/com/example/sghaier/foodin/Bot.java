package com.example.sghaier.foodin;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Bot extends AppCompatActivity {
    Typeface tf1,tf2,tf3;
    LinearLayout linearreponse1;
    boolean status =false;
    TextView bot_tv_bonjour,bot_tv_asiatique,bot_tv_burger,bot_tv_riz,bot_tv_oriental,bot_tv_plus,bot_tv_reponse1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bot);

        bot_tv_bonjour = (TextView) this.findViewById(R.id.bot_tv_bonjour);
        bot_tv_asiatique = (TextView) this.findViewById(R.id.bot_tv_asiatique);
        bot_tv_burger = (TextView) this.findViewById(R.id.bot_tv_burger);
        bot_tv_riz = (TextView) this.findViewById(R.id.bot_tv_riz);
        bot_tv_oriental = (TextView) this.findViewById(R.id.bot_tv_oriental);
        bot_tv_plus = (TextView) this.findViewById(R.id.bot_tv_plus);

        linearreponse1 = (LinearLayout) this.findViewById(R.id.linearreponse1);
        bot_tv_reponse1 = (TextView) this.findViewById(R.id.bot_tv_reponse1);

        tf1 = Typeface.createFromAsset(getAssets(), "fonts/GothamRounded-Bold.otf");
        tf2 = Typeface.createFromAsset(getAssets(), "fonts/GothamRounded-Medium.otf");
        tf3 = Typeface.createFromAsset(getAssets(), "fonts/GothamRounded-Light.otf");

        bot_tv_bonjour.setTypeface(tf3);
        bot_tv_asiatique.setTypeface(tf3);
        bot_tv_burger.setTypeface(tf3);
        bot_tv_riz.setTypeface(tf3);
        bot_tv_oriental.setTypeface(tf3);
        bot_tv_plus.setTypeface(tf3);
        bot_tv_reponse1.setTypeface(tf3);

        bot_tv_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status) {
                    bot_tv_riz.setVisibility(View.VISIBLE);
                    bot_tv_oriental.setVisibility(View.VISIBLE);
                    status = false;
                } else {
                    bot_tv_riz.setVisibility(View.GONE);
                    bot_tv_oriental.setVisibility(View.GONE);
                    status = true;
                }
            }
        });

        bot_tv_asiatique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearreponse1.setVisibility(View.VISIBLE);
                bot_tv_reponse1.setText(" Asiatique ");
            }
        });

        bot_tv_burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearreponse1.setVisibility(View.VISIBLE);
                bot_tv_reponse1.setText(" Burger ");
            }
        });

        bot_tv_riz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearreponse1.setVisibility(View.VISIBLE);
                bot_tv_reponse1.setText(" RIZ ");
            }
        });

        bot_tv_oriental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearreponse1.setVisibility(View.VISIBLE);
                bot_tv_reponse1.setText(" Oriental ");
            }
        });

    }
}
