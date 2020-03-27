package com.technocrats.covidtesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class dfbreathTravel extends AppCompatActivity {
    Button btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dfbreath_travel);

        btn12 = findViewById(R.id.dfbreathTravel);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn12 = new Intent(dfbreathTravel.this, MainActivity.class);
                startActivity(btn12);
            }
        });
    }
}
