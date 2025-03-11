package com.example.project_;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class S1_SignIn extends AppCompatActivity {
    /*
    Класс S1_SignIn - класс с внутреней логикой работы на активити
     */
    TextView createUserText, restore;
    Button start;
    ImageButton visiblePassword;
    boolean vis = false;
    EditText editPassword, editEmail;
    String eng = "qwertyuiopasdfghjklzxcvbnm1234567890";


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_s1_sign_in);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        visiblePassword = findViewById(R.id.SignIn_Visible_Password);
        visiblePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Логика видимости пароля
                if (vis){
                    vis = !vis;
                    editPassword.setInputType(InputType.TYPE_NUMBER_VARIATION_PASSWORD);
                    visiblePassword.setImageResource(R.drawable.img2);
                }else{
                    vis = !vis;
                    editPassword.setInputType(129);
                    visiblePassword.setImageResource(R.drawable.img1);
                }
            }
        });


        createUserText = findViewById(R.id.SignIn_Create_New_User);
        createUserText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Переход на другую активити при нажатии
                Intent intent = new Intent(S1_SignIn.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        restore = findViewById(R.id.SignIn_Vost);
        restore.setOnClickListener(new View.OnClickListener() {
            @Override
            // Переход на другую активити при нажатии
            public void onClick(View view) {
                Intent intent = new Intent(S1_SignIn.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        start = findViewById(R.id.SignIn_Start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validation()){
                    Intent intent = new Intent(S1_SignIn.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        editPassword = findViewById(R.id.SignIn_input_Password);
        editEmail = findViewById(R.id.SignIn_input_Email);
    }

    private boolean validation(){
        String email, password;
        email = String.valueOf(editEmail.getText());
        password = String.valueOf(editPassword.getText());

        if (password.isEmpty() || email.isEmpty()){

            return false;
        }

        int numChar = 0;

        for (int i = 0; i < email.length(); i++) {
            for (int j = 0; j < eng.length(); j++) {
                if (!String.valueOf(email.charAt(i)).equals(eng.charAt(j))){
                    if (email.charAt(i) == '@' || email.charAt(i) == '.'){
                        if (numChar < 2){
                            Toast.makeText(this, "Главный домен содержит меньше 2 симолов", Toast.LENGTH_SHORT).show();
                            return false;
                        }

                        continue;
                    }

                    return false;
                }
                numChar ++;
            }
        }

        Log.d("S1_SignIn",String.valueOf(email.isEmpty()));

        return true;
    }


}
//setInputType
//Toast