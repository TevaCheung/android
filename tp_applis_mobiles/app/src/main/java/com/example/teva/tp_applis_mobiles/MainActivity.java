package com.example.teva.tp_applis_mobiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button bouton1=(Button)findViewById(R.id.button2);

        bouton1.setOnClickListener(new View.OnClickListener(){
            public void OnClick(View view){
                Intent infos = new Intent(MainActivity.this,Authentification.class);
                startActivity(infos);
            }
        });
    }
}
