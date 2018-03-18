package com.udemy.suraj.micro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityThree13 extends AppCompatActivity {
    TextView text;
    String s="<br><br>Dosseg <br>" +

            " .model small <br>" +
            " .stack 100h <br>" +
            " .data <br>" +
            " String1 db Hello World, $ <br>" +
            " .code <br>" +
            " Main proc <br>" +
            " MOV AX, @data <br>" +
            " MOV DS, AX <br>" +
            "MOV AH, 09H <br>" +
            " MOV DX, offset String1 <br>" +
            " INT 21H <br>" +
            " MOV AH, 4CH <br>" +
            " INT 21H <br>" +
            " Main endp <br>" +
            " End Main";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three13);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        text=(TextView)findViewById(R.id.text);
        text.setText(Html.fromHtml(s));
    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), ActivityThree.class);
        startActivityForResult(myIntent, 0);
        return true;

    }
}
