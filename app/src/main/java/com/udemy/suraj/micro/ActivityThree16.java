package com.udemy.suraj.micro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityThree16 extends AppCompatActivity {
    TextView text;
    String s="\n\nDosseg \n" +
            " .model small \n" +
            " .stack 100h \n" +
            " .data \n" +
            " Multiplier dw 1234H \n" +
            " Multiplicant dw 3456H \n" +
            " Product dw ? \n" +

            " .code \n" +
            " MULT proc \n" +
            " MOV AX, @data \n" +
            " MOV DS, AX \n" +
            " MOV AX, Multiplicant \n" +
            " MUL Multiplier \n" +
            " MOV Product, AX \n" +
            " MOV Product+2, DX \n" +
            " MOV AH, 4CH \n" +
            " INT 21H \n" +
            " MULT endp \n" +
            " End MULT ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three16);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        text=(TextView)findViewById(R.id.text);
        text.setText(s);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), ActivityThree.class);
        startActivityForResult(myIntent, 0);
        return true;

    }
}
