package com.example.projetdevmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    private ImageButton couscous;
    private ImageButton ejja;
    private ImageButton loubia;
    private ImageButton spaguetti;
    private ImageButton tajin;
    private ImageButton brik;
    private ImageButton riz;
    private Button b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        couscous=findViewById(R.id.couscous);
        ejja=findViewById(R.id.ejja);
        loubia=findViewById(R.id.loubia);
        spaguetti=findViewById(R.id.spaguetti);
        tajin=findViewById(R.id.tajin);
        brik=findViewById(R.id.brik);
        riz=findViewById(R.id.riz);
        b3=findViewById(R.id.b3);


        couscous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,resCous.class);
                startActivity(intent);
            }
        });

        ejja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,resEjja.class);
                startActivity(intent);
            }
        });

        loubia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,resLoubia.class);
                startActivity(intent);
            }
        });
        spaguetti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,spaguetti.class);
                startActivity(intent);
            }
        });

        riz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity2.this,resRiz.class);
                startActivity(intent);
            }
        });
        tajin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,resTajin.class);
                startActivity(intent);
            }
        });

        brik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,resBrik.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,rechercher.class);
                startActivity(intent);
            }
        });

    }
}