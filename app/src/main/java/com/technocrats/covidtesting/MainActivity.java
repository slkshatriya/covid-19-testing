package com.technocrats.covidtesting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CheckBox cough, fever, Tiredness, difficultybreathing, TravelHistory;
    Button button, button2, button3, exit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.text);
        txt.setSelected(true);
        cough = findViewById(R.id.checkBox);
        fever = findViewById(R.id.checkBox2);
        Tiredness = findViewById(R.id.checkBox3);
        difficultybreathing = findViewById(R.id.checkBox4);
        TravelHistory = findViewById(R.id.checkBox5);
        exit = findViewById(R.id.exit);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("are you sure you want to exit");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        finishAffinity();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();

                    }
                });
                AlertDialog alert=builder.create();
                alert.show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openCountry = new Intent(MainActivity.this, Country.class);
                startActivity(openCountry);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openTrack = new Intent(MainActivity.this, TrackWorldwide.class);
                startActivity(openTrack);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cough.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, coughActivity.class);
                    startActivity(intent);
                }
                if (fever.isChecked()) {
                    Intent intent1 = new Intent(MainActivity.this, feverActivity.class);
                    startActivity(intent1);
                }
                if (Tiredness.isChecked()) {
                    Intent intent2 = new Intent(MainActivity.this, TirednessActivity.class);
                    startActivity(intent2);
                }
                if (difficultybreathing.isChecked()) {
                    Intent intent3 = new Intent(MainActivity.this, DifficultyBreathing.class);
                    startActivity(intent3);
                }
                if (TravelHistory.isChecked()) {
                    Intent intent4 = new Intent(MainActivity.this, TravelHistory.class);
                    startActivity(intent4);
                }
                if (difficultybreathing.isChecked() && cough.isChecked()) {
                    Intent intent5 = new Intent(MainActivity.this, dfbreathingCough.class);
                    startActivity(intent5);
                }
                if (difficultybreathing.isChecked() && TravelHistory.isChecked()) {
                    Intent intent18 = new Intent(MainActivity.this, dfbreathTravel.class);
                    startActivity(intent18);
                }

                if (fever.isChecked() && Tiredness.isChecked()) {
                    Intent intent6 = new Intent(MainActivity.this, feverTiredness.class);
                    startActivity(intent6);
                }
                if (TravelHistory.isChecked() && Tiredness.isChecked()) {
                    Intent intent16 = new Intent(MainActivity.this, TirednessTravel.class);
                    startActivity(intent16);
                }
                if (TravelHistory.isChecked() && cough.isChecked()) {
                    Intent intent19 = new Intent(MainActivity.this, TravelCough.class);
                    startActivity(intent19);
                }
                if (TravelHistory.isChecked() && fever.isChecked()) {
                    Intent intent15 = new Intent(MainActivity.this, TravelFever.class);
                    startActivity(intent15);
                }
                if (difficultybreathing.isChecked() && fever.isChecked()) {
                    Intent intent7 = new Intent(MainActivity.this, dfbreathFever.class);
                    startActivity(intent7);
                }
                if (difficultybreathing.isChecked() && Tiredness.isChecked()) {
                    Intent intent8 = new Intent(MainActivity.this, dfbreathTiredness.class);
                    startActivity(intent8);
                }
                if (fever.isChecked() && cough.isChecked()) {
                    Intent intent2 = new Intent(MainActivity.this, coughFeverActivity.class);
                    startActivity(intent2);
                }
                if (Tiredness.isChecked() && cough.isChecked()) {
                    Intent intent9 = new Intent(MainActivity.this, tirednessCough.class);
                    startActivity(intent9);
                }
                if (fever.isChecked() && cough.isChecked() && Tiredness.isChecked()) {
                    Intent intent10 = new Intent(MainActivity.this, feverCoughTiredness.class);
                    startActivity(intent10);
                }
                if (fever.isChecked() && difficultybreathing.isChecked() && Tiredness.isChecked()) {
                    Intent intent11 = new Intent(MainActivity.this, feverDfbreathTiredness.class);
                    startActivity(intent11);
                }
                if (fever.isChecked() && cough.isChecked() && difficultybreathing.isChecked()) {
                    Intent intent12 = new Intent(MainActivity.this, feverCoughDfbreath.class);
                    startActivity(intent12);
                }
                if (difficultybreathing.isChecked() && cough.isChecked() && Tiredness.isChecked()) {
                    Intent intent13 = new Intent(MainActivity.this, dfbreathCoughTiredness.class);
                    startActivity(intent13);
                }
                if (fever.isChecked() && cough.isChecked() && Tiredness.isChecked() && difficultybreathing.isChecked()) {
                    Intent intent14 = new Intent(MainActivity.this, feverCoughTirednessDfbreath.class);
                    startActivity(intent14);
                }
                if (fever.isChecked() && cough.isChecked() && Tiredness.isChecked() && difficultybreathing.isChecked() && TravelHistory.isChecked()) {
                    Intent intent15 = new Intent(MainActivity.this, feverCoughDfbreathTirednessTravel.class);
                    startActivity(intent15);
                }


            }

        });
    }
}