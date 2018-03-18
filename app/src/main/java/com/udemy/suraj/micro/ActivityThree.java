package com.udemy.suraj.micro;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //ActionBar actionBar = getActionBar();
        //actionBar.setDisplayHomeAsUpEnabled(true);
        ListView mylistview=(ListView)findViewById(R.id.mylistview);
        ArrayList<String> programs=new ArrayList<String>();
        programs.add("Factorial of a number");
        programs.add("Transfer the block of data to new location ");
        programs.add("Display string");
        programs.add("Reverse the given string");
        programs.add("Multiply 2 numbers (16-bit data)");
        programs.add("Sum of series of 10 numbers");
        programs.add("Largest No. in a block of data");
        programs.add("Count number of vowels in a given string");
        programs.add("Number of times letter e exist in the string exercise");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,programs);
        mylistview.setAdapter(arrayAdapter);
        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent(ActivityThree.this,ActivityThree11.class);
                    //intent.putExtra("info","This is activity from card item index  "+finalI);
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent = new Intent(ActivityThree.this,ActivityThree12.class);
                    //intent.putExtra("info","This is activity from card item index  "+finalI);
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent = new Intent(ActivityThree.this,ActivityThree13.class);
                    //intent.putExtra("info","This is activity from card item index  "+finalI);
                    startActivity(intent);
                }
                if(i==3){
                    Intent intent = new Intent(ActivityThree.this,ActivityThree14.class);
                    //intent.putExtra("info","This is activity from card item index  "+finalI);
                    startActivity(intent);
                }
                if(i==4){
                    Intent intent = new Intent(ActivityThree.this,ActivityThree16.class);
                    //intent.putExtra("info","This is activity from card item index  "+finalI);
                    startActivity(intent);
                }
                if(i==5){
                    Intent intent = new Intent(ActivityThree.this,ActivityThree15.class);
                    //intent.putExtra("info","This is activity from card item index  "+finalI);
                    startActivity(intent);
                }
                if(i==6){
                    Intent intent = new Intent(ActivityThree.this,ActivityThree17.class);
                    //intent.putExtra("info","This is activity from card item index  "+finalI);
                    startActivity(intent);
                }
                if(i==7){
                    Intent intent = new Intent(ActivityThree.this,ActivityThree18.class);
                    //intent.putExtra("info","This is activity from card item index  "+finalI);
                    startActivity(intent);
                }
                if(i==8){
                    Intent intent = new Intent(ActivityThree.this,ActivityThree19.class);
                    //intent.putExtra("info","This is activity from card item index  "+finalI);
                    startActivity(intent);
                }
            }

        });

    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }
}
