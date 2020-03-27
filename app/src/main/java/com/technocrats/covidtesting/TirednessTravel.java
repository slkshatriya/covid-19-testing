package com.technocrats.covidtesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TirednessTravel extends AppCompatActivity {
    Button btn13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiredness_travel);

        btn13 = findViewById(R.id.btn13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn13 = new Intent(TirednessTravel.this, MainActivity.class);
                startActivity(btn13);
            }
        });
    }
}
