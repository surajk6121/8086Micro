package com.udemy.suraj.micro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityThree11 extends AppCompatActivity {
    TextView text;
    String s="<br><br>MOV AX, 05H <br><br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;MOV CX, AX <br><br>" +
            "Back: DEC CX<br><br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;MUL CX \n" +
            "<br><br>LOOP back \n" +
            "<br><br>&nbsp;&nbsp;&nbsp;&nbsp;; results stored in AX \n" +
            "<br><br>&nbsp;&nbsp;&nbsp;&nbsp;; to store the result at D000H \n" +
            "<br><br>&nbsp;&nbsp;&nbsp;&nbsp;MOV [D000], AX \n" +
            "<br><br>&nbsp;&nbsp;&nbsp;&nbsp;HLT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three11);
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
