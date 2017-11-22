package com.example.teva.tp_applis_mobiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class Authentification extends AppCompatActivity {

    private final String NOM="nom";
    private final String PRENOM="prenom";
    private final String DDN="date";
    private final String EMAIL="mail@mail.com";
    private final String AP="adresse";
    private final String COM="commentaires";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Button bouton1=(Button)findViewById(R.id.choixbtn);
        final EditText nom=(EditText)findViewById(R.id.nom);
        final EditText prenom=(EditText)findViewById(R.id.prenom);
        final EditText ddn=(EditText)findViewById(R.id.ddn);
        final EditText mail=(EditText)findViewById(R.id.mail);
        final EditText ap=(EditText)findViewById(R.id.ap);
        final EditText com=(EditText)findViewById(R.id.com);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);

        bouton1.setOnClickListener(new View.OnClickListener(){
            public void OnClick(View view){
                Intent infos = new Intent(Authentification.this,Affichage.class);
                infos.putExtra(NOM,nom.getText().toString());
                infos.putExtra(PRENOM,prenom.getText().toString());
                infos.putExtra(DDN,ddn.getText().toString());
                infos.putExtra(EMAIL,mail.getText().toString());
                infos.putExtra(AP,ap.getText().toString());
                infos.putExtra(COM,com.getText().toString());
                startActivity(infos);
            }
        });
    }
}
