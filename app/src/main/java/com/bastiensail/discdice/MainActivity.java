package com.bastiensail.discdice;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private ImageView discTypeDice, throwTypeDice;
    private Button rollButton;
    private Random randomDiceGenerator = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discTypeDice = findViewById(R.id.imageView01);
        throwTypeDice = findViewById(R.id.imageView02);

        rollButton = findViewById(R.id.button);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDiscType(discTypeDice);
                rollThrowType(throwTypeDice);
            }
        });
    }

    private void rollDiscType(ImageView imgView)
    {
        int rdg = randomDiceGenerator.nextInt(6) + 1;
        getRandomDiscType(imgView, rdg, R.drawable.dice_disc_type_putter, R.drawable.dice_disc_type_driver, R.drawable.dice_disc_type_mid, R.drawable.dice_disc_type_overstable, R.drawable.dice_disc_type_understable);
    }

    private void getRandomDiscType(ImageView imgView, int rdg, int p, int p2, int p3, int p4, int p5) {
        switch (rdg) {
            case 1:
                imgView.setImageResource(p);
                break;
            case 2:
                imgView.setImageResource(p2);
                break;
            case 3:
                imgView.setImageResource(p3);
                break;
            case 4:
                imgView.setImageResource(p4);
                break;
            case 5:
                imgView.setImageResource(p5);
                break;
            case 6:
                imgView.setImageResource(R.drawable.dice_joker);
                break;

        }
    }

    private void rollThrowType(ImageView imgView)
    {
        int rdg = randomDiceGenerator.nextInt(6) + 1;
        getRandomDiscType(imgView, rdg, R.drawable.dice_throw_type_anhyzer, R.drawable.dice_throw_type_backhand, R.drawable.dice_throw_type_forehand, R.drawable.dice_throw_type_hyzer, R.drawable.dice_throw_type_roller);
    }
}
