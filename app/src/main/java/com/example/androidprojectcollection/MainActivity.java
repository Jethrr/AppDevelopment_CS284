package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnExer = findViewById(R.id.btnExercise);
        btnExer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,openactivity.class);
                startActivity(intent);
            }
        });






        Button buttonmain = findViewById(R.id.btnMain);
        buttonmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LayoutExercise.class);
                startActivity(intent);
            }
        });

        Button calculator = findViewById(R.id.btnCalculator);
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CalculatorExercise.class);
                startActivity(intent);
            }
        });

    }
}