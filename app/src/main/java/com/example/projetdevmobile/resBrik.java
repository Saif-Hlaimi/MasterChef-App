package com.example.projetdevmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class resBrik extends AppCompatActivity {
    private TextView textViewbrik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_brik);

        textViewbrik=findViewById(R.id.textViewbrik);
    textViewbrik.setText("Ingredients\n:" +
            "\n" +
            "*5 Feuilles de brick ou selon le nombre de personne\n" +
            "*5 Oeufs\n" +
            "*Une poignée de câpres\n" +
            "*Une boîte de thon à l'huile égouttée de son huile.\n" +
            "*Un oignon émincé\n" +
            "*Fromage râpé\n" +
            "*4 pommes de terre moyenne\n" +
            "*du persil haché\n" +
            "*Sel et poivre noir\n" +
            "*harissa\n" +
            "       \n" +
            "Instructions\n" +
            "\n" +
            "*faites bouillir les pommes de terre nettoyées et coupées en cube" +
            " , et faites cuire dans une eau salée\n" +
            "*égoutez bien les pommes de terre de son eau et écrasez les.\n" +
            "*chauffez l'huile, puis baissez le feu.\n" +
            "*Prenez une feuille de brick, placez la pomme de terre écrasée en cercle\n" +
            "*cassez l'oeuf au centre, salez et poivrez.\n" +
            "*ajoutez par dessus le persil, le thon émietté, quelques câpres, " +
            "*la harissa et enfin le fromage\n" +
            "*plier la feuille de brick en forme de triangle pour bien enfermer la farce.\n" +
            "*faites frire dans l'huile jusqu'à ce que la brick prenne une belle" +
            "* couleur dorée des deux cotés bricks des deux côtés.\n" +
            "*retirez et égouttez sur du papier absorbant");

    }
}