package com.example.sghaier.foodin;

import android.app.AlertDialog;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HistoriqueCommande extends AppCompatActivity {
    ArrayList<RestauItem> listresto = null;
    public Historiqueadaptateur adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historique_commande);
        Typeface tf1,tf2,tf3;

        listresto = RestauItem.getAListOfHistoriquetemp();
        adapter = new Historiqueadaptateur(this, listresto);
        final ListView list = (ListView)findViewById(R.id.listhistorique);

        list.setAdapter(adapter);

        tf1 = Typeface.createFromAsset(getAssets(), "fonts/GothamRounded-Bold.otf");
        tf2 = Typeface.createFromAsset(getAssets(), "fonts/GothamRounded-Medium.otf");
        tf3 = Typeface.createFromAsset(getAssets(), "fonts/GothamRounded-Light.otf");

        LayoutInflater factory = LayoutInflater.from(HistoriqueCommande.this);
        final View alertDialogView = factory.inflate(R.layout.alerthistorique, null);

        //Création de l'AlertDialog
        AlertDialog.Builder adb = new AlertDialog.Builder(HistoriqueCommande.this);

        //On affecte la vue personnalisé que l'on a crée à notre AlertDialog
        adb.setView(alertDialogView);
        adb.show();



        TextView tv_total = (TextView)alertDialogView.findViewById(R.id.alerthistorique_total);
        TextView tv_date = (TextView)alertDialogView.findViewById(R.id.tv_historique_date);
        TextView tv_historique_fermer = (TextView)alertDialogView.findViewById(R.id.tv_historique_fermer);
        TextView tv_sous_total = (TextView)alertDialogView.findViewById(R.id.tv_sous_total);
        TextView tv_frais = (TextView)alertDialogView.findViewById(R.id.tv_frais);
        TextView tv_prix_sous = (TextView)alertDialogView.findViewById(R.id.textView66);
        TextView tv_offert = (TextView)alertDialogView.findViewById(R.id.tv_offert);
//
//
        tv_frais.setTypeface(tf2);tv_prix_sous.setTypeface(tf2);
        tv_sous_total.setTypeface(tf2);tv_offert.setTypeface(tf2);
//
        tv_date.setTypeface(tf1);
        tv_total.setTypeface(tf1);
        tv_historique_fermer.setTypeface(tf1);






    }
}
