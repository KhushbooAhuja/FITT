package com.android.fitt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button asthma;
private Button nosy;
private Button cough;
private Button diabetes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        asthma = findViewById(R.id.asthma);
        asthma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(MainActivity.this, AsthmaActivity.class);
                startActivity(categoryIntent);
                finish();

            }
        });

        nosy = findViewById(R.id.nosy);
        nosy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(MainActivity.this, NosyActivity.class);
                startActivity(categoryIntent);
                finish();

            }
        });

        cough = findViewById(R.id.cough);
        cough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntentt = new Intent(MainActivity.this, CoughActivity.class);
                startActivity(categoryIntentt);
                finish();

            }
        });

        diabetes = findViewById(R.id.diabetes);
        diabetes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntentt = new Intent(MainActivity.this, DiabetesActivity.class);
                startActivity(categoryIntentt);
                finish();

            }
        });
}
}