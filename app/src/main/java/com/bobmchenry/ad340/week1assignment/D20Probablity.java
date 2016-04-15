package com.bobmchenry.ad340.week1assignment;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class D20Probablity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d20_probablity);

    }

    public void goToMenu(View view){
        Intent intent = new Intent(this, FullScreenMenu.class);
        startActivity(intent);
    }

    public void calcProb(View view){
        EditText target = (EditText) findViewById(R.id.targetNumber);
        EditText mod = (EditText) findViewById(R.id.modNumber);
        TextView success = (TextView) findViewById(R.id.probResult);

        if (target.getText().toString().equals("") || mod.getText().toString().equals("")){
            Toast.makeText(this, "Enter a target and modifier", Toast.LENGTH_SHORT).show();
            return;
        }
        int targetInt = Integer.parseInt(target.getText().toString());
        int modInt = Integer.parseInt(mod.getText().toString());

        double percentSuccess = 0.0;
        // 1 is automatic failure, 20 is automatic success
        if (19 + modInt < targetInt){
            percentSuccess = 5;
        } else if(2+modInt > targetInt){
            percentSuccess = 95;
        } else {
            percentSuccess = ( ( (20.0 - targetInt + modInt +1) / 20) * 100 );
        }

        NumberFormat formatter = new DecimalFormat("#0.00");

        success.setText(""+ formatter.format(percentSuccess) + "% Success");

    }
}
