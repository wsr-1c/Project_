package com.example.project_;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Homes extends AppCompatActivity {
    // Новацкий Егор Сергеевич 12.03.2025

    // кнопки для переходов
    public ImageButton like, shop;
    // при нажатии на область перхеход на активити поиска
    View search;


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        like = findViewById(R.id.like);
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Переход к активити Favorite
                Intent intent = new Intent(Homes.this, Favorite.class);
                startActivity(intent);
            }
        });

        shop = findViewById(R.id.shop);
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            // Переход на активити Корзины

            }
        });

        search = findViewById(R.id.block_perehod);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Переход на активити Search
                Intent intent = new Intent(Homes.this, Search.class);
                startActivity(intent);
            }
        });
    }
}