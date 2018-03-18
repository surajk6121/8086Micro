package com.udemy.suraj.micro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class ActivityTwo extends AppCompatActivity {
    TextView expandableTextView;
    TextView expandableTextView2;
    TextView expandableTextView3;
    TextView expandableTextView4;
    TextView expandableTextView5;
    TextView expandableTextView6;
    TextView expandableTextView7;
    TextView expandableTextView8;
    TextView expandableTextView9;
    TextView expandableTextView0;

    String biamwd="<br><br>In this addressing mode, the operands offset is computed by adding the base register contents. An Index registers contents and 8 or 16-bit displacement.<br><br>" +
            "<br><br>" +
            "Example<br><br>" +
            "MOV AX, [BX+DI+08];<br><br> ADD CX, [BX+SI+16]<br<br>";
    String biam="<br><br>In this addressing mode, the offset address of the operand is computed by summing the base register to the contents of an Index register.\n" +
            "<br><br>" +
            "Example<br><br>" +
            "ADD CX, [AX+SI];<br><br> MOV AX, [AX+DI]<br><br>";
    String iam2="<br><br>In this addressing mode, the operands offset address is found by adding the contents of SI or DI register and 8-bit/16-bit displacements.<br><br>" +
            "<br><br>" +
            "Example<br><br>" +
            "MOV BX, [SI+16];<br><br> ADD AL, [DI+16]<br><br>";
    String bam="<br><br>In this addressing mode, the offset address of the operand is given by the sum of contents of the BX/BP registers and 8-bit/16-bit displacement.\n" +
            "<br><br>" +
            "Example<br><br>" +
            "MOV DX, [BX+04],<br><br> ADD CL, [BX+08]<br><br>";
    String dam="<br><br>The addressing mode in which the effective address of the memory location is written directly in the instruction.\n" +
            "<br><br>" +
            "Example<br><br>" +
            "&nbsp;&nbsp;&nbsp;MOV AX, [1592H], MOV AL, [0300H]<br><br>";
    String rim="<br><br><p>This addressing mode allows data to be addressed at any memory location through an offset address held in any of the following registers: BP, BX, DI &amp; SI.</p>\n" +
            "<h4>Example</h4>" +

            "<pre>MOV AX, [BX]  &nbsp;&nbsp;&nbsp;&nbsp; Suppose the register BX &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;contains 4895H, then the &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;contents  " +
            "              <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;; 4895H are moved to AX " +
            "ADD CX, {BX} </pre>" +
            "";
    String ram="<br><br>It means that the register is the source of an operand for an instruction.<br><br>"+
            "<br><br>"+
            "Example<br><br>"+
            "MOV CX, AX   ;&nbsp;&nbsp;&nbsp;&nbsp; copies the contents of the &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;16-bit AX register into  <br><br>"+
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the 16-bit CX register),  <br><br>"+
            "ADD BX, AX<br><br>";
    String iam="<br><br>The addressing mode in which the data operand is a part of the instruction itself is known as immediate addressing mode.\n" +
            "<br><br>" +
            "<b>Example</b><br><br>" +
            "MOV CX, 4929 H, ADD AX, 2387 H,  MOV AL, FFH ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        expandableTextView0=(TextView)findViewById(R.id.expandable_text0);
        expandableTextView0.setText(Html.fromHtml(iam));
        expandableTextView=(TextView)findViewById(R.id.expandable_text);
        expandableTextView.setText(Html.fromHtml(ram));
        expandableTextView2=(TextView)findViewById(R.id.expandable_text2);
        expandableTextView2.setText(Html.fromHtml(dam));
        expandableTextView3=(TextView)findViewById(R.id.expandable_text3);
        expandableTextView3.setText(Html.fromHtml(rim));
        expandableTextView4=(TextView)findViewById(R.id.expandable_text4);
        expandableTextView4.setText(Html.fromHtml(bam));
        expandableTextView5=(TextView)findViewById(R.id.expandable_text5);
        expandableTextView5.setText(Html.fromHtml(iam2));
        expandableTextView6=(TextView)findViewById(R.id.expandable_text7);
        expandableTextView6.setText(Html.fromHtml(biam));
        expandableTextView7=(TextView)findViewById(R.id.expandable_text8);
        expandableTextView7.setText(Html.fromHtml(biamwd));/*
        expandableTextView8=(TextView)findViewById(R.id.expandable_text8);
        expandableTextView8.setText(Html.fromHtml(cf));/*
        expandableTextView9=(TextView)findViewById(R.id.expandable_text9);
        expandableTextView9.setText(Html.fromHtml(cf2));*/
    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }
}
