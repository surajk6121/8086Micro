package com.udemy.suraj.micro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityThree19 extends AppCompatActivity {
    TextView text;
    String s=" \n\n\n\nDosseg \n\n" +
            " .model small \n\n" +
            " .stack 100h \n\n" +
            " .data \n\n" +

            " String db exercise, $ \n\n" +
            " Ans db ? \n\n" +
            " Length db $-String \n\n" +
            " .code \n\n" +
            " Main proc \n\n" +
            " MOV AX, @data \n\n" +
            " MOV DS, AX \n\n" +
            " MOV AL,00H \n\n" +
            " MOV SI, offset String \n\n" +
            " MOV CX, Length \n\n" +
            "Back: MOV BH, [SI] \n\n" +
            "CMP BH, e \n\n" +
            " JNZ Label \n\n" +
            " INC AL \n\n" +
            "Label: INC SI \n\n" +
            " LOOP Back \n\n" +
            " MOV Ans, AL \n\n" +
            " MOV AH, 4CH \n\n" +
            " INT 21H \n\n" +
            " Main endp \n\n" +
            " End Main";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three19);
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
