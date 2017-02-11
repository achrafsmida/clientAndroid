package com.example.sghaier.foodin;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Subscribe extends AppCompatActivity {
    Button btn_subscribe;
    EditText edit_email,edit_nom,edit_prenom,passwd,confirm_passwd,adresse,adresse_complement,phone,datenaissance;
    Typeface tf1,tf2,tf3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe);

        tf1 = Typeface.createFromAsset(getAssets(), "fonts/GothamRounded-Bold.otf");
        tf2 = Typeface.createFromAsset(getAssets(), "fonts/GothamRounded-Medium.otf");
        tf3 = Typeface.createFromAsset(getAssets(), "fonts/GothamRounded-Light.otf");

        btn_subscribe = (Button) this.findViewById(R.id.btn_subscribe_validate);
        edit_email = (EditText) this.findViewById(R.id.edit_info_email_subscribe);
        edit_nom = (EditText) this.findViewById(R.id.edit_info_nom);
        edit_prenom = (EditText) this.findViewById(R.id.edit_info_prenom);
        passwd = (EditText) this.findViewById(R.id.edit_info_passwd_edit);
        confirm_passwd = (EditText) this.findViewById(R.id.confirm_passwd_subscribe);
        adresse = (EditText) this.findViewById(R.id.edit_adresse_subscribe);
        adresse_complement = (EditText) this.findViewById(R.id.edit_adresse2_subscribe);
        phone = (EditText) this.findViewById(R.id.phone_subscribe);
        datenaissance = (EditText) this.findViewById(R.id.subscribe_dtn);

        btn_subscribe.setTypeface(tf2);
        edit_email.setTypeface(tf2);edit_prenom.setTypeface(tf2);edit_nom.setTypeface(tf2);
        passwd.setTypeface(tf2);confirm_passwd.setTypeface(tf2);adresse.setTypeface(tf2);
        adresse_complement.setTypeface(tf2);phone.setTypeface(tf2);datenaissance.setTypeface(tf2);
    }
}
