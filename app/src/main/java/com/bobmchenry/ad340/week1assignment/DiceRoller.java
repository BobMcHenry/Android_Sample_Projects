package com.bobmchenry.ad340.week1assignment;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.Random;

public class DiceRoller extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_roller);

        NumberPicker np = (NumberPicker) findViewById(R.id.diceCount);
        np.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        np.setMinValue(1);
        np.setMaxValue(10);
        np.setValue(1);

        TextView tv = (TextView) findViewById(R.id.result);
        tv.setTextColor(Color.parseColor("Black"));
    }

    public void goToMenu(View view){
        Intent intent = new Intent(this, FullScreenMenu.class);
        startActivity(intent);
    }

    public void d4(View view){
        NumberPicker np = (NumberPicker) findViewById(R.id.diceCount);
        int count = np.getValue();
        TextView tv = (TextView) findViewById(R.id.result);
        tv.setText(""+roll(4, count));
    }
    public void d6(View view){
        NumberPicker np = (NumberPicker) findViewById(R.id.diceCount);
        int count = np.getValue();
        TextView tv = (TextView) findViewById(R.id.result);
        tv.setText(""+roll(6, count));
    }
    public void d8(View view){
        NumberPicker np = (NumberPicker) findViewById(R.id.diceCount);
        int count = np.getValue();
        TextView tv = (TextView) findViewById(R.id.result);
        tv.setText(""+roll(8, count));
    }
    public void d10(View view){
        NumberPicker np = (NumberPicker) findViewById(R.id.diceCount);
        int count = np.getValue();
        TextView tv = (TextView) findViewById(R.id.result);
        tv.setText(""+roll(10, count));
    }
    public void d12(View view){
        NumberPicker np = (NumberPicker) findViewById(R.id.diceCount);
        int count = np.getValue();
        TextView tv = (TextView) findViewById(R.id.result);
        tv.setText(""+roll(12, count));
    }
    public void d20(View view){
        NumberPicker np = (NumberPicker) findViewById(R.id.diceCount);
        int count = np.getValue();
        TextView tv = (TextView) findViewById(R.id.result);
        tv.setText(""+roll(20, count));
    }
    public void d100(View view){
        NumberPicker np = (NumberPicker) findViewById(R.id.diceCount);
        int count = np.getValue();
        TextView tv = (TextView) findViewById(R.id.result);
        tv.setText(""+roll(100, count));
    }


    private int roll(int sides, int totalDie){
        Random r = new Random();
        int rollValue = 0;
        for (int i = 0; i < totalDie; i++){
            rollValue += r.nextInt(sides)+1;
        }

        TextView tv = (TextView) findViewById(R.id.result);
        if (rollValue == sides * totalDie || rollValue == totalDie){
            tv.setTextColor(Color.parseColor("RED"));
        } else {
            tv.setTextColor(Color.parseColor("Black"));
        }
        return rollValue;
    }
}
