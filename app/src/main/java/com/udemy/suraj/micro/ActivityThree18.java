package com.udemy.suraj.micro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityThree18 extends AppCompatActivity {
    TextView text;
    String s=" \n\n\n Dosseg \n\n" +
            " .model small \n\n" +
            " .stack 100h \n\n" +
            " .code \n\n" +
            " Main proc \n\n" +
            " MOV AX, @data \n\n" +
            " MOV DS, AX \n\n" +
            " MOV SI, offset String  ;initialize p \n\n" +
            " MOV CX, Len  ;length in CX register \n\n" +
            " MOV BL, 00   ;vowel count=0 \n\n" +

            "Back: MOV AL, [SI] \n\n" +
            " CMP AL, a \n\n" +
            " JB VOW \n\n" +
            " CMP AL, z  ;Convert the character to upper case \n\n" +
            " JA VOW \n\n" +
            " SUB AL, 20H \n\n" +
            "VOW: CMP AL, A \n\n" +
            " JNZ a3 \n\n" +
            " INC BL \n\n" +
            " JMP a2 \n\n" +
            "a3: CMP AL, E \n\n" +
            " JNZ a4 \n\n" +
            " INC BL \n\n" +
            " JMP a2 \n\n" +
            "a4: CMP AL, I \n\n" +
            " JNZ a5 \n\n" +
            " INC BL \n\n" +
            " JMP a2 \n\n" +
            "a5: CMP AL, O \n\n" +
            " JNZ a6 \n\n" +
            " INC BL \n\n" +
            " JMP a2 \n\n" +
            "a6: CMP AL, U \n\n" +
            " JNZ a2 \n\n" +
            " INC BL \n\n" +

            "a2: INC SI \n\n" +
            " LOOP Back \n\n" +
            " MOV Vowel,  BL \n\n" +
            " MOV AX, 4C00H \n\n" +
            " INT 21H \n\n" +
            " Main endp \n\n" +
            " .data \n\n" +
            " String db The quick brown fox jumped over lazy sleeping dog, $ \n\n" +
            " Len dw $-string \n\n" +
            " Vowel db ? \n\n" +
            " End Main";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three18);
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
