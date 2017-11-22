package com.example.teva.tp_applis_mobiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class Affichage extends AppCompatActivity {

        private final String NOM="nom";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage);

        Intent intent = getIntent();

        final TextView commentaire=(TextView) findViewById(R.id.recap);

        commentaire.setText(intent.getStringExtra(NOM));
    }
}
