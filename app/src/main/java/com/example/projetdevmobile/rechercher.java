package com.example.projetdevmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class rechercher extends AppCompatActivity {
    private EditText chercher;
    private Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rechercher);
        chercher=findViewById(R.id.chercher);
        b2=findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
String mot_cle = chercher.getText().toString();
if (!mot_cle.equals(""))
{
searchonline(mot_cle);
}
            }
        });
    }
    private void searchonline (String mot)

    {
        try {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY,mot);
            startActivity(intent);
        } catch (ActivityNotFoundException e){
            e.printStackTrace();
            searchonline(mot);
        }

    }

}