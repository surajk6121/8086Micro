package com.udemy.suraj.micro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityThree15 extends AppCompatActivity {
    TextView text;
    String s=" \n\nDosseg \n\n" +
            " .model small \n\n" +
            " .stack 100h \n\n" +
            " .data \n\n" +
            " List db 12,34,56,78,98,01,13,78,18,36 \n\n" +
            " Total dw ? \n\n" +
            " .code \n\n" +
            " Main proc \n\n" +
            " MOV AX, @data \n\n" +
            " MOV DS, AX \n\n" +
            " MOV AX, 0000H \n\n" +

            " MOV CX, 0AH ; counter \n\n" +
            " MOV BL, 00H ; to count carry \n\n" +
            " MOV SI, offset List \n\n" +
            "Back: ADD AL, [SI] \n\n" +
            " JC Label \n\n" +
            "Back1: INC SI \n\n" +
            " LOOP Back \n\n" +
            "MOV Total, AX \n\n" +
            "MOV Total+2, BL \n\n" +
            "MOV AH, 4CH \n\n" +
            "INT 21H \n\n" +
            "Label: INC BL \n\n" +
            " JMP Back1 \n\n" +
            "Main endp \n\n" +
            "End Main";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three15);
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
