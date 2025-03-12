package com.example.project_;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registration extends AppCompatActivity {
    ImageButton back, cheackPassword;
    TextView perehod;
    Button but;

    boolean vis = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration.this, S1_SignIn.class);
                startActivity(intent);

            }
        });

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validation()){
                    SendData();
                    Intent intent = new Intent(Registration.this, S1_SignIn.class);
                    startActivity(intent);
                }
            }
        });

        perehod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration.this, S1_SignIn.class);
                startActivity(intent);
            }
        });

        cheackPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editPassword = findViewById(R.id.editTextTextPassword);
                // Логика видимости пароля
                if (vis){
                    vis = !vis;
                    editPassword.setInputType(InputType.TYPE_NUMBER_VARIATION_PASSWORD);
                    cheackPassword.setImageResource(R.drawable.img2);
                }else{
                    vis = !vis;
                    editPassword.setInputType(129);
                    cheackPassword.setImageResource(R.drawable.img1);
                }
            }
        });
    }

    private boolean validation() {
        return false;
    }

    private void SendData(){

    }
}