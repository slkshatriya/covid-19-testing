package com.technocrats.covidtesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class feverCoughTirednessDfbreath extends AppCompatActivity {
    Button btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fever_cough_tiredness_dfbreath);

        btn7 = findViewById(R.id.btn7);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn7 = new Intent(feverCoughTirednessDfbreath.this, MainActivity.class);
                startActivity(btn7);
            }
        });
    }
}
