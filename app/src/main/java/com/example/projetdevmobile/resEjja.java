package com.example.projetdevmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resEjja extends AppCompatActivity {

    private TextView textViewejja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_ejja);
        textViewejja=findViewById(R.id.textViewejja);
        textViewejja.setText("Ingredients\n" +
                        "\n" +
                "*3 merguez\n" +
                "*3 tomates1 poivron rouge (ou poivron vert)\n" +
                "*1 petite pomme de terre coupée en dés\n" +
                "*2 gousses d'ail\n" +
                "*1 piment haché\n" +
                "*1 c-a-soupe de harissa\n" +
                "*1 c-a-soupe bombée de concentre de tomate\n" +
                "*3 c-a-soupe d'huile d'olive\n" +
                "* verre d'eau\n" +
                "*oeufs selon le nombre de personnes\n" +
                "*sel et poivre du moulin"+
        "      \n"+
        "Instruction: \n" +
                        "\n"+
                "Commencer par précuire les merguez dans une poêle quelques minutes et " +
                        "les couper en petits morceaux. Réserver.\n" +
                        "Rincer les tomates et le poivrons et couper en dés.\n" +
                        "Chauffer l'huile d'olive dans une poêle profonde ou comme moi dans un tajine.\n" +
                        "Ajouter l'ail et le piment émincé finement et faire revenir 2 minutes a feu doux ou " +
                        "jusqu’à ce qu'il devienne translucide.\n" +
                        "Ajouter le poivron coupé en dés et les faire suer a feu doux environ 5 minutes.\n" +
                        "Ajouter les tomates et les épices et laisser revenir quelques minutes avant d'ajouter " +
                        "le concentré de tomate dilué dans ½ verre d'eau.\n" +
                        "Ajouter les cubes de pomme de terre à la sauce ainsi que les morceaux de merguez.\n" +
                        "Mélanger le tout et laisser cuire environ 15 minutes.\n" +
                        "En fin de cuisson, à l'aide d'une cuillère en bois faire des creux dans la " +
                        "sauce et casser les oeufs. Laisser cuire à feu doux afin jusqu’à ce que les blancs coagulent.\n" +
                        "Servir chaud accompagné de pain maison."



        );
    }
}