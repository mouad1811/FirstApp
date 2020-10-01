package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button bcpt ;
    private TextView cpt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bcpt = (Button) findViewById(R.id.btncpt) ;
        cpt = (TextView) findViewById(R.id.compteur) ;

        bcpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nb = Integer.parseInt(cpt.getText().toString()) ;
                nb ++ ;
                cpt.setText(String.valueOf(nb)) ;

                Random r = new Random();
                int color = Color.argb(255, r.nextInt(256), r.nextInt(256), r.nextInt(256));
                cpt.setTextColor(color);
            }
        });

    }
}