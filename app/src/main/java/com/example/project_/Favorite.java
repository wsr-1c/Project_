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

public class Favorite extends AppCompatActivity {
    // Новацкий Егор Сергеевич 12.03.2025
    ImageButton b1,b2,b3,b4,b5,b6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_favorite);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        b1 = findViewById(R.id.imageViewq2);
        b2 = findViewById(R.id.imageVieww2);
        b3 = findViewById(R.id.imageViewe2);
        b4 = findViewById(R.id.imageViewr2);
        b5 = findViewById(R.id.imageView7);
        b6 = findViewById(R.id.imageView8);

        b1.setOnClickListener(Details());
        b2.setOnClickListener(Details());
        b3.setOnClickListener(Details());
        b4.setOnClickListener(Details());
        b5.setOnClickListener(Details());
        b6.setOnClickListener(Details());


    }

    public View.OnClickListener Details(){
        //Переход к описанию продукта
        Intent intent = new Intent(Favorite.this, Details.class);
        startActivity(intent);
        return null;
    }


}