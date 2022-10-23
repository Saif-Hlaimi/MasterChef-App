package com.example.projetdevmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resRiz extends AppCompatActivity {
    private TextView textViewriz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_riz);
        textViewriz=findViewById(R.id.textViewriz);

        textViewriz.setText("Ingredients :\n" +
                "\n" +
                "*500 gr de riz\n" +
                "*6 morceaux de poulet\n" +
                "* de pois chiches trempés dans l'eau\n" +
                "*1 c. à soupe de concentré de tomate\n" +
                "*1 - oignon\n" +
                "*1/2 verre(s) d'huile d'olive\n" +
                "*1 c. à café Piment rouge en poudre\n" +
                "*1 c. à café de coriandre\n" +
                "*1 c. à café de sel\n" +
                "*1 c. à café de curcuma\n" +
                "*1/2 c. à café de harissa\n" +
                "    \n" +
                "Instructions\n" +
                "\n" +
                "Faire bouillir une casserole d'eau.\n" +
                " - Lorsque l'eau bouillit, la verser sur le riz, " +
                "enlever le surplus d'eau et laisser refroidir.\n" +
                " - Prendre la partie basse du couscoussier (makfoul), " +
                "y mettre l'huile et les pois chiches, y couper l'oignon " +
                "et mettre sur le feu.\n" +
                " - Frire pendant 5 minutes à feu doux en mélangeant.\n" +
                " - Ajouter les tomates en conserves, l'harissa et les épices\n" +
                " - Rajouter les morceaux de poulet nettoyés.\n" +
                " - Laisser frire encore pendant 5 mn, ajouter un " +
                "verre d'eau et laisser mijoter.\n" +
                " - Quand la sauce est presque prête, rajouter 2 " +
                "verres d'eau, mettre le riz dans le haut du " +
                "couscoussier (keskès)et laisser cuire pendant 20 minutes.\n" +
                " - Retirer le tout du feu. Prendre un grand" +
                " plat de four, y verser le riz et le recouvrir de" +
                "sauce qui doit être assez liquide pour recouvrir tout le riz.\n" +
                " - Mettre le tout dans le four pendant 15 à 25 minutes" +
                " jusqu'à ce que le riz soit sec et cuit.");

    }
}