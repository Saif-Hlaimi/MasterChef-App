package com.example.projetdevmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class spaguetti extends AppCompatActivity {
    private TextView textViewspa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spaguetti);
        textViewspa=findViewById(R.id.textViewspa);
        textViewspa.setText("Ingredient : \n" +
                        "\n" +
                "*350 g de spaghetti\n" +
                "*250 g de blanc de poulet coupé en gros cubes\n" +
                "*1 piment ou poivron long\n" +
                "*1,5 cs de tomate concentrée\n" +
                "*1/2 cs de piment moulu\n" +
                "*1 cc de sel\n" +
                "*1 cc de tabel-karouia\n" +
                "*4 gousses d’ail\n" +
                "*huile d’olive\n" +
                "*une pincée de poivre\n" +
                "    \n" +
                "Instructions : \n" +
                        "\n" +
                        "Dans un faitout, mettre un fond épais d’huile d’olive (1cm).\n " +
                        "Toujours hors feu, ajouter les morceaux de poulet, la tomate concentrée,\n " +
                        "le piment, le sel et le poivre, ainsi qu'un verre d'eau.\n" +
                        "A feu moyen, faire revenir le tout pendant 5 bonnes minutes en\n " +
                        "remuant régulièrement. Éplucher les gousses d’ail et les écraser\n" +
                        " au pilon (ça ressemble à ça) avec le tabel-karouia. Ajouter à la sauce.\n" +
                        " Laisser mijoter encore 2-3 minutes.\n" +
                        "Ajouter ensuite 50 cl d’eau bien chaude et laisser mijoter tranquillement\n" +
                        " pendant une demi-heure.\n" +
                        "min avant la fin, laver et équeuter le piment, le fendre en 2 \n" +
                        "puis le rajouter à la sauce.\n" +
                        "En fin de cuisson (soit 40 minutes), la sauce doit être devenue\n" +
                        " épaisse et parfumée.\n" +
                        "Cuire les pâtes dans de l’eau salée, égoutter et mélanger\n" +
                        " à la sauce (après avoir retiré les légumes et la viande).\n " +
                        "Mettre dans le plat de service et décorer avec la garniture restante.\n" +
                        "Servir immédiatement."
                );

    }
}