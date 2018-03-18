package com.udemy.suraj.micro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityFour extends AppCompatActivity {
    TextView text;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;
    String s="These instructions are used to transfer the data from the source operand to the destination operand";
    String s2="These instructions are used to perform arithmetic operations like addition, subtraction, multiplication, division, etc.";
    String s3="These instructions are used to perform operations where data bits are involved, i.e. operations like logical, shift, etc.";
    String s4="String is a group of bytes/words and their memory is always allocated in a sequential order.";
    String s5="These instructions are used to transfer/branch the instructions during an execution.";
    String s6="These instructions are used to control the processor action by setting/resetting the flag values.";
    String s7="These instructions are used to execute the given instructions for number of times.";
    String s8="These instructions are used to call the interrupt during program execution.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        text=(TextView)findViewById(R.id.text);
        text.setText(s);
        text2=(TextView)findViewById(R.id.text2);
        text2.setText(s2);
        text3=(TextView)findViewById(R.id.text3);
        text3.setText(s3);
        text4=(TextView)findViewById(R.id.text4);
        text4.setText(s4);
        text5=(TextView)findViewById(R.id.text5);
        text5.setText(s5);
        text6=(TextView)findViewById(R.id.text6);
        text6.setText(s6);
        text7=(TextView)findViewById(R.id.text7);
        text7.setText(s7);
        text8=(TextView)findViewById(R.id.text8);
        text8.setText(s8);

    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }
}
