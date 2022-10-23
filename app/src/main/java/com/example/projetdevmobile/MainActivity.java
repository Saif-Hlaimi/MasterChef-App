package com.example.projetdevmobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button commencer;
    private TextView textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        commencer = findViewById(R.id.commencer);
        textView1=findViewById(R.id.textView1);

        textView1.setText("Bienvenue dans l'application -Master Chef- dans cette application vous pouvez trouver des délicieux plats"+
                " avec ses recettes, il suffit de chercher votre préférable plat et suivre la recette, appuyer sur commencer" +
                        " et bon appétit ! ");

commencer.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
});

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.Evaluer:
                Intent intent = new Intent(MainActivity.this,rate.class);
                startActivity(intent);

        }


        return super.onOptionsItemSelected(item);
    }
}