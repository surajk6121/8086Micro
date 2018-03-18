package com.udemy.suraj.micro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityThree14 extends AppCompatActivity {
    TextView text;
    String s="\n\n Dosseg \n\n" +
            " .model small \n\n" +
            " .stack 100h \n\n" +
            " .data \n\n" +
            " String1 db assembly language program, $ \n\n" +
            " Length dw $-String1-1 \n\n" +
            ".code \n\n" +
            " Main proc \n\n" +
            " MOV AX, @data \n\n" +
            " MOV DS, AX \n\n" +
            " MOV SI, offset String1 \n\n" +
            " MOV  CX, Length \n\n" +
            " ADD SI, CX \n\n" +

            "Back: MOV DL, [SI] \n\n" +
            " MOV AH, 02H \n\n" +
            " INT 21H \n\n" +
            " DEC SI \n\n" +
            " LOOP Back \n\n" +
            " MOV AH, 4CH \n\n" +
            " INT 21H \n\n" +
            " Main endp \n\n" +
            " End Main";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three14);
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
