package com.example.github;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Toast.makeText(this, "Datos recibidos \uD83D\uDC4D", Toast.LENGTH_SHORT).show();

        TextView textView2 = findViewById(R.id.textView2);
        String datoRecibido = getIntent().getStringExtra("datoEnviado");
        textView2.setText("Hola " + datoRecibido + "!");
//holaaa
    }
    public void back(View view){
        Intent volverMain = new Intent(this, MainActivity.class);
        startActivity(volverMain);
    }
}