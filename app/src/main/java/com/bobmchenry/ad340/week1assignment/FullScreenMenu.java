package com.bobmchenry.ad340.week1assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FullScreenMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_menu);
    }

    public void diceRollerStart(View view){
        Intent intent = new Intent(this, DiceRoller.class);
        startActivity(intent);
    }

    public void coinFlipperStart(View view){
        Intent intent = new Intent(this, CoinFlipper.class);
        startActivity(intent);
    }

    public void probStart(View view){
        Intent intent = new Intent(this, D20Probablity.class);
        startActivity(intent);
    }
}
