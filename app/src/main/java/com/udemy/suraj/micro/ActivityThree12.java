package com.udemy.suraj.micro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityThree12 extends AppCompatActivity {
    TextView text;
    String s="<br><br><br><br>MOV BL, 08H <br><br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;OV CX, E000H <br><br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;MOV EX, B001H <br><br>" +
            "Loop: MOV DL, [CX] <br><br>" +
            " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;MOV [EX], DL <br><br>" +
            " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;DEC BL <br><br>" +
            " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JNZ loop <br><br>" +
            " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;HLT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three12);
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
