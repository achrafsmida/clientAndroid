package com.example.sghaier.foodin;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Editinfos extends AppCompatActivity {
    Button btnvalider;
    Typeface tf1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__infos);

        btnvalider = (Button)findViewById(R.id.btn_subscribe_validate);

        tf1 = Typeface.createFromAsset(getAssets(), "fonts/GothamRounded-Bold.otf");
        btnvalider.setTypeface(tf1);
    }
}
