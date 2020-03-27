package com.technocrats.covidtesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class coughFeverActivity extends AppCompatActivity {
    Button coughButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cough_fever);
        coughButton = findViewById(R.id.coughButton);

        coughButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoHome();
            }
        });
    }
    public void gotoHome(){
        Intent gotoHome = new Intent(coughFeverActivity.this, MainActivity.class);
        startActivity(gotoHome);
    }
}
