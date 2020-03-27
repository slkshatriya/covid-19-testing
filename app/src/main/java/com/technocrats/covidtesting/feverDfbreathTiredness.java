package com.technocrats.covidtesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class feverDfbreathTiredness extends AppCompatActivity {
    Button btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fever_dfbreath_tiredness);

        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn8 = new Intent(feverDfbreathTiredness.this, MainActivity.class);
                startActivity(btn8);
            }
        });
    }
}
