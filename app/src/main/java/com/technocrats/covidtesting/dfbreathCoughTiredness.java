package com.technocrats.covidtesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dfbreathCoughTiredness extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dfbreath_cough_tiredness);

        btn = findViewById(R.id.bct);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bct = new Intent(dfbreathCoughTiredness.this, MainActivity.class);
                startActivity(bct);
            }
        });
    }
}
