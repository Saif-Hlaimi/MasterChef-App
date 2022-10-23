package com.example.projetdevmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resLoubia extends AppCompatActivity {
    private TextView textViewloubia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_loubia);
        textViewloubia=findViewById(R.id.textViewloubia);
        textViewloubia.setText("Ingredient\n" +
                        "\n"+
                        "*Oignon\n"+
                "*1/2 verre Huile d'olive\n"+
        "*1 + 1/2 cuillère à soupe Tomates en conserve\n"+
        "*1/2 cuillère à soupe Harissa\n"+
        "*6 morceaux Viande de mouton\n"+
        "*300 grammes Haricots blancs\n"+
        "*1 cuillère à café Coriandre\n"+
        "*1/2 cuillère à café Curcuma\n"+
        "*1/2 cuillère à café Piment rouge en poudre\n"+
                "    \n"+

                "Instructions\n" +
                        "\n"+
                "Prendre votre cocotte-minute, y couper l'oignon et y " +
                        "mettre l'huile, la tomate, l'harissa, la viande et " +
                        "les épices (coriandre et curcuma). Saler et poivrer."+
        "Mettre la cocotte minute sur le feu, faire frire le tout en" +
                        " mélangeant pendant 5 mn."+
        "Rajouter un verre d'eau. Quand la sauce bouillit, " +
                        "mettre les haricots blancs. Surbaigner d'eau (environ 75 cL)."+
        "Lorsque la sauce bouillit, refermer la " +
                        "cocotte minute et laisser cuire pendant 25 minutes."+
        "Une fois ce temps écoulé, ouvrir la " +
                        "cocotte minute, y jeter deux piments verts et laisser mijoter " +
                        "jusqu'à ce que la sauce devienne concentrée."+
        "Servir chaud et Chahia tayba :)"


        );
    }
}