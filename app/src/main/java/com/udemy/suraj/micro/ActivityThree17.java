package com.udemy.suraj.micro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityThree17 extends AppCompatActivity {
    TextView text;
    String s=" \n\nDosseg \n\n" +
            " .model small \n\n" +
            " .stack 100h \n\n" +
            " .data \n\n" +
            " List db 80, 81, 78, 65, 23, 45, 89, 90, 10, 99 \n\n" +
            " Result db ? \n\n" +
            " .code \n\n" +
            " Main proc \n\n" +
            " MOV AX, @data \n\n" +
            " MOV DS, AX \n\n" +
            " MOV SI, offset List \n\n" +
            " MOV AL, 00H \n\n" +
            " MOV CX, 0AH \n\n" +
            "Back: CMP AL, [SI] \n\n" +
            " JNC Ahead \n\n" +
            " MOV AL, [SI] \n\n" +
            "Ahead: INC SI \n\n" +
            " LOOP Back \n\n" +
            " MOV Result, AL \n\n" +
            " MOV AH, 4CH \n\n" +
            " INT 21H \n\n" +
            " Main endp \n\n" +
            " End Main";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three17);
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
