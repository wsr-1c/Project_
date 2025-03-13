package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {
    View profiles,cart,favorite,item,notification,setting,exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        profiles = findViewById(R.id.constraintLayout8);
        cart = findViewById(R.id.constraintLayout9);
        favorite = findViewById(R.id.constraintLayout10);
        item = findViewById(R.id.constraintLayout11);
        notification = findViewById(R.id.constraintLayout12);
        setting = findViewById(R.id.constraintLayout13);
        exit = findViewById(R.id.constraintLayout14);

        profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Profile.class);
                startActivity(intent);
                finish();
            }
        });

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Notification.class);
                startActivity(intent);
            }
        });
    }
}