package com.example.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Huay extends AppCompatActivity {

    Random iRandom = new Random();

    public int getRandomTwoDigits() {

        int twoNumber = iRandom.nextInt(100);
        return twoNumber;
    }

    public int getRandomThreeDigits() {

        int threeNumber = iRandom.nextInt(1000);
        return threeNumber;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huay);

        final Huay item = new Huay();
        Button twoButton = (Button) findViewById(R.id.TwoButton);
        Button threeButton = (Button) findViewById(R.id.ThreeButton);
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name = "เลขท้าย 2 ตัว";
                Intent intent = new Intent(Huay.this, Baihuay.class);
                intent.putExtra("t_huay", Name);
                intent.putExtra("n_huay", item.getRandomTwoDigits());
                intent.putExtra("d_huay", 1);
                startActivity(intent);
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name = "เลขท้าย 3 ตัว";
                Intent intent = new Intent(Huay.this, Baihuay.class);
                intent.putExtra("t_huay", Name);
                intent.putExtra("n_huay", item.getRandomThreeDigits());
                intent.putExtra("d_huay", 2);
                startActivity(intent);
            }
        });

    }
}
