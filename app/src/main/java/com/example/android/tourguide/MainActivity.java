package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView entertainmentTextView = findViewById(R.id.entertainment);
        entertainmentTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent entertainmentIntent = new Intent(MainActivity.this, Entertainment.class);
                startActivity(entertainmentIntent);
            }
        });

        TextView museumsTextView = findViewById(R.id.museums);
        museumsTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent museumsIntent = new Intent(MainActivity.this, Museums.class);
                startActivity(museumsIntent);
            }
        });

        TextView parksTextView = findViewById(R.id.parks);
        parksTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent parksIntent = new Intent(MainActivity.this, Parks.class);
                startActivity(parksIntent);
            }
        });

        TextView shoppingTextView = findViewById(R.id.shopping);
        shoppingTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent shoppingIntent = new Intent(MainActivity.this, Shopping.class);
                startActivity(shoppingIntent);
            }
        });
    }
}
