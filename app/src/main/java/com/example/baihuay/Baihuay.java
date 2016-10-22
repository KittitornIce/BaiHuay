package com.example.baihuay;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Baihuay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baihuay);

        Intent intent = getIntent();
        String typeHuay = intent.getStringExtra("t_huay");
        int Number = intent.getIntExtra("n_huay", 0);
        int typeNumber = intent.getIntExtra("d_huay", 1);

        if (typeNumber == 1) {
            TextView typeHuayTextView = (TextView) findViewById(R.id.typehuayText);
            typeHuayTextView.setText(typeHuay);

            if (Number < 10) {
                String showNumber = "0" + Number + "";
                TextView numberTextView = (TextView) findViewById(R.id.NumberText);
                numberTextView.setText(showNumber);
            } else {
                String showNumber = Number + "";
                TextView numberTextView = (TextView) findViewById(R.id.NumberText);
                numberTextView.setText(showNumber);

            }
        } else if (typeNumber == 2) {
            TextView typeHuayTextView = (TextView) findViewById(R.id.typehuayText);
            typeHuayTextView.setText(typeHuay);

            if (Number < 10) {
                String showNumber = "00" + Number + "";
                TextView numberTextView = (TextView) findViewById(R.id.NumberText);
                numberTextView.setText(showNumber);
            } else if (Number < 100) {
                String showNumber = "0" + Number + "";
                TextView numberTextView = (TextView) findViewById(R.id.NumberText);
                numberTextView.setText(showNumber);
            } else {
                String showNumber = Number + "";
                TextView numberTextView = (TextView) findViewById(R.id.NumberText);
                numberTextView.setText(showNumber);

            }
        }

    }

}
