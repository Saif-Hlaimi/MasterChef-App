package com.example.projetdevmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resCous extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_cous);
        textView=findViewById(R.id.textView);

        textView.setText("Ingredient \n" +
                "\n" +
                "350 g de couscous fin ou moyen\n" +
                "4 à 5 morceaux de viande d’agneau\n" +
                "80 g de pois chiches\n" +
                "Un oignon émincé\n" +
                "2 gousses d’ail\n" +
                "1/2 tasse d’huile\n" +
                "3 à 4 cuillères à soupe de concentré de tomate\n" +
                "½ cuillère à soupe de paprika, 1 cuillère à café sel, " +
                "1 cuillère à café de poivre, ½ cuillère à soupe de " +
                "coriandre (Tabel), 1 cuillère à café de curcuma\n" +
                "½ cuillère à soupe de Harissa\n" +
                "3 carottes\n" +
                "2 courgettes\n" +
                "2 pommes de terre\n" +
                "2 piments\n" +
                "4 tomates fraîches pelées \n" +
                "\n" +
                "Preparation :\n " +
                "\n" +
                "Mettre un peu d’huile et l’oignon haché dans le bas d’un " +
                "couscoussier à feu moyen\n" +
                "Ajouter la viande coupée en morceaux et les épices\n" +
                "Ajouter les tomates, l’ail ainsi que la Harissa puis bien " +
                "mélanger le tout\n" +
                "Ajouter les pois chiche et les carottes\n" +
                "Verser 600 ml d’eau et laisser mijoter pendant 30 minutes\n" +
                "En cours de cuisson de la sauce, verser 400 ml" +
                " d’eau puis ajouter " +
                "le reste des légumes (les pommes de terre, les piments " +
                "et les courgettes)" +
                " et laisser cuire 25 minutes\n" +
                "Mettre la semoule (le couscous)  dans un " +
                "grand saladier, ajouter" +
                " une demi-cuillère à café de sel et 5 cuillères à soupe d’huile. " +
                "Frotter le couscous entre les mains jusqu’à " +
                "ce qu’il n’y ait plus de " +
                "graines collées. Déposer dans le couscoussier (keskés)\n" +
                "Couvrir et laisser cuire à la vapeur 30 minutes " +
                "en veillant à remuer " +
                "de temps à autre.\n" +
                "Verser les 2/3 de la sauce sur le couscous et laisser reposer" +
                " pendant 5 mn puis mélanger délicatement.\n" +
                "Dresser un beau plat");

    }
}