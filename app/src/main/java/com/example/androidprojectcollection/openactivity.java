package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class openactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openactivity);
        Button btnRet = findViewById(R.id.btnReturn);

        ConstraintLayout parent = findViewById(R.id.parentClass);

        Button btnChangeBg = findViewById(R.id.changeBg);
        Button btnChangeColor = findViewById(R.id.changeColor);

        btnRet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(openactivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnChangeBg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parent.setBackgroundResource(R.color.purple_200);
            }
        });

        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnChangeColor.setBackgroundColor(Color.GRAY);
            }
        });


        Button btnToast = findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(openactivity.this, "Hello Sir Godinez!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnClick = findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick.setVisibility(View.INVISIBLE);
                Toast.makeText(openactivity.this, "OPS! BYE", Toast.LENGTH_SHORT).show();

            }
        });
    }
}