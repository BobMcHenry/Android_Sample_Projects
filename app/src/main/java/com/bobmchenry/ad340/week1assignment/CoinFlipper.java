package com.bobmchenry.ad340.week1assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class CoinFlipper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_flipper);
    }

    public void flip(View view){
        TextView tv = (TextView) findViewById(R.id.flipResult);
        Random r = new Random();
        if (r.nextInt(2) == 0){
            tv.setText("H");
        } else {
            tv.setText("T");
        }
    }

    public void goToMenu(View view){
        Intent intent = new Intent(this, FullScreenMenu.class);
        startActivity(intent);
    }
}
