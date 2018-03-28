package com.udemy.suraj.micro;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityFour extends AppCompatActivity{
    GridLayout mainGrid;
    TextView text;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;
    String s="\nThese instructions are used to transfer the data from the source operand to the destination operand.";
    String s2="\nThese instructions are used to perform arithmetic operations like addition, subtraction, multiplication, division, etc.";
    String s3="\nThese instructions are used to perform operations where data bits are involved, i.e. operations like logical, shift, etc.";
    String s4="\nString is a group of bytes/words and their memory is always allocated in a sequential order.";
    String s5="\nThese instructions are used to transfer/branch the instructions during an execution.";
    String s6="\nThese instructions are used to control the processor action by setting/resetting the flag values.";
    String s7="\nThese instructions are used to execute the given instructions for number of times.";
    String s8="\nThese instructions are used to call the interrupt during program execution.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
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
        setSingleEvent(mainGrid);

    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(ActivityFour.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(ActivityFour.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finalI==0){
                        Intent intent = new Intent(ActivityFour.this,ActivityFour1.class);
                        intent.putExtra("info","This is activity from card item index  "+finalI);
                        startActivity(intent);}
                    if(finalI==1){
                        Intent intent = new Intent(ActivityFour.this,ActivityFour2.class);
                        intent.putExtra("info","This is activity from card item index  "+finalI);
                        startActivity(intent);}
                    if(finalI==2){
                        Intent intent = new Intent(ActivityFour.this,ActivityFour3.class);
                        intent.putExtra("info","This is activity from card item index  "+finalI);
                        startActivity(intent);}
                    if(finalI==3){
                        Intent intent = new Intent(ActivityFour.this,ActivityFour4.class);
                        intent.putExtra("info","This is activity from card item index  "+finalI);
                        startActivity(intent);}
                    if(finalI==3){
                        Intent intent = new Intent(ActivityFour.this,ActivityFour5.class);
                        intent.putExtra("info","This is activity from card item index  "+finalI);
                        startActivity(intent);}
                    if(finalI==3){
                        Intent intent = new Intent(ActivityFour.this,ActivityFour6.class);
                        intent.putExtra("info","This is activity from card item index  "+finalI);
                        startActivity(intent);}
                    if(finalI==3){
                        Intent intent = new Intent(ActivityFour.this,ActivityFour7.class);
                        intent.putExtra("info","This is activity from card item index  "+finalI);
                        startActivity(intent);}
                    if(finalI==3){
                        Intent intent = new Intent(ActivityFour.this,ActivityFour8.class);
                        intent.putExtra("info","This is activity from card item index  "+finalI);
                        startActivity(intent);}

                }
            });
        }
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }
}
