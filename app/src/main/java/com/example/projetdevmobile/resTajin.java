package com.example.projetdevmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resTajin extends AppCompatActivity {
    private TextView textViewtaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_tajin);
        textViewtaj=findViewById(R.id.textViewtaj);

        textViewtaj.setText("Ingredients : \n" +
                "\n" +
                "*400 g d'escalope de poulet\n" +
                "*10 œufs\n" +
                "*3 pommes de terre\n" +
                "*200 g de fromage râpé\n" +
                "*1 botte de persil\n" +
                "*coriandre\n" +
                "*huile d'olive\n" +
                "*sel, poivre, curcuma\n" +
                "*huile pour la friture" +
                "   \n" +
                "Instructions\n" +
                "\n" +
                "*Coupez les pommes de terre en dés et faites les frire. " +
                "Laissez ensuite refroidir.\n" +
                "\n" +
                "*Faites cuire 2 œufs durs.\n" +
                "\n" +
                "*Coupez le poulet en dés et faites-le cuire dans une poêle huilée." +
                " Salez, poivrez et ajoutez la coriandre. Laissez ensuite refroidir.\n" +
                "\n" +
                "*Dans un saladier, versez les œufs battus et incorporez " +
                "les pommes de terre ainsi que le poulet.\n" +
                "\n" +
                "*Ajoutez le persil et fromage râpé. Salez, " +
                "poivrez et ajoutez de la coriandre de nouveau et du curcuma. Mélangez le tout.\n" +
                "\n" +
                "*Versez la préparation dans un plat beurré et " +
                "ajoutez les œufs durs en morceaux.\n" +
                "\n" +
                "* Enfournez pendant 30 minutes à 180°C.\n" +
                "\n" +
                "*Dans certaines régions, le tajine peut aussi se préparer comme un couscous, " +
                "découvrez notre recette de tajine de poulet, courgettes et " +
                "amandes ou de tajine aux pruneaux.");

    }
}