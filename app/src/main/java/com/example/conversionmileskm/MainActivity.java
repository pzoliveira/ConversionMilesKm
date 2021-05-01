package com.example.conversionmileskm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMilesToKm = (Button) findViewById(R.id.btnMiles2Km);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textMiles = (EditText) findViewById(R.id.etxtMiles);
                EditText textKm = (EditText) findViewById(R.id.etxtKm);
                double vMiles = Double.valueOf(textMiles.getText().toString());
                double vKm = vMiles / 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textKm.setText(formatVal.format(vKm));
            }
        });
        Button buttonConvKmToMiles = (Button) findViewById(R.id.btnKm2Miles);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textMiles = (EditText) findViewById(R.id.etxtMiles);
                EditText textKm = (EditText) findViewById(R.id.etxtKm);
                double vKm = Double.valueOf(textKm.getText().toString());
                double vMiles = vKm * 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textMiles.setText(formatVal.format(vMiles));
            }
        });
    }
}
