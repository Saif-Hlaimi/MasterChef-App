package com.example.projetdevmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import java.io.DataOutputStream;

public class rate extends AppCompatActivity {
    private RatingBar ratingBar;
    private Button rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        ratingBar=findViewById(R.id.ratingBar);
        rating=findViewById(R.id.rating);
  rating.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Toast.makeText(rate.this, "Merci pour votre evaluation", Toast.LENGTH_SHORT).show();
          Intent intent = new Intent(rate.this,MainActivity.class);
          startActivity(intent);
      }
  });

    }
}