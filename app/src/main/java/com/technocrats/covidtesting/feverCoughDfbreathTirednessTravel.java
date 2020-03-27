package com.technocrats.covidtesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class feverCoughDfbreathTirednessTravel extends AppCompatActivity {
    Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fever_cough_dfbreath_tiredness_travel);

        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn5 = new Intent(feverCoughDfbreathTirednessTravel.this, MainActivity.class);
                startActivity(btn5);
            }
        });
    }
}
