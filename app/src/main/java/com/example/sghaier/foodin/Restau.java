package com.example.sghaier.foodin;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class Restau extends AppCompatActivity {

    ArrayList<RestauItem> listresto = null;
    public restoadaptateur adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restau);

        listresto = RestauItem.getAListOfContact();
        adapter = new restoadaptateur(this, listresto);
        final ListView list = (ListView)findViewById(R.id.listresto);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(Restau.this, Resto_detaille.class);
                startActivity(i);
                //finish();
            }
        });
    }
}
