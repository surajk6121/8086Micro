package com.udemy.suraj.micro;

/**
 * Created by Saurav Yadav on 24-02-2018.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class ActivityOne extends AppCompatActivity {
    TextView expandableTextView;
    TextView expandableTextView2;
    TextView expandableTextView3;
    TextView expandableTextView4;
    TextView expandableTextView5;
    TextView expandableTextView6;
    TextView expandableTextView7;
    TextView expandableTextView8;
    TextView expandableTextView9;
    String cf2="<br><br>Control flags are set or reset deliberately to control the operations of the execution unit. Control flags are as follows:<br><br>&nbsp;&nbsp;&nbsp;<b> 1. Trap Flag (TP)</b>:<br><br>&nbsp;&nbsp;&nbsp;&nbsp; a. It is used for single step control. <br><br>&nbsp;&nbsp;&nbsp;&nbsp; b. It allows user to execute one instruction of a program at a time for debugging.<br><br>&nbsp;&nbsp;&nbsp;&nbsp; c. When trap flag is set, program can be run in single step mode.<br><br>&nbsp;&nbsp;&nbsp;&nbsp;<b> 2. Interrupt Flag (IF)</b>:<br><br>&nbsp;&nbsp;&nbsp;&nbsp; a. It is an interrupt enable/disable flag.<br><br>&nbsp;&nbsp;&nbsp;&nbsp; b. If it is set, the maskable interrupt of 8086 is enabled and if it is reset, the interrupt is disabled.<br><br>&nbsp;&nbsp;&nbsp;&nbsp; c. It can be set by executing instruction sit and can be cleared by executing CLI instruction.<br><br>&nbsp;&nbsp;&nbsp;<b> 3. Direction Flag (DF)</b>:<br><br>&nbsp;&nbsp;&nbsp;&nbsp; a. It is used in string operation.<br><br>&nbsp;&nbsp;&nbsp;&nbsp; b. If it is set, string bytes are accessed from higher memory address to lower memory address.<br><br>&nbsp;&nbsp;&nbsp;&nbsp; c. When it is reset, the string bytes are accessed from lower memory address to higher memory address. <br><br>";
    String cf="<br><br>Conditional flags represent result of last arithmetic or logical instruction executed. Conditional flags are as follows: <br><br>&nbsp;&nbsp;<b> Carry Flag (CF)</b>: This flag indicates an overflow condition for unsigned integer arithmetic. It is also used in multiple-precision arithmetic.<br><br>&nbsp;&nbsp;<b> Auxiliary Flag (AF)</b>: If an operation performed in ALU generates a carry/barrow from   lower nibble (i.e. D0 – D3) to upper nibble (i.e. D4 – D7), the AF flag is set i.e. carry given by D3 bit to D4 is AF flag. This is not a general-purpose flag, it is used internally by the processor to perform Binary to BCD conversion. <br><br>&nbsp;&nbsp;<b> Parity Flag (PF)</b>: This flag is used to indicate the parity of result. If lower order 8-bits of the result contains even number of 1’s, the Parity Flag is set and for odd number of 1’s, the Parity Flag is reset. <br><br>&nbsp;&nbsp;<b> Zero Flag (ZF)</b>: It is set; if the result of arithmetic or logical operation is zero else it is reset. <br><br>&nbsp;&nbsp;<b> Sign Flag (SF)</b>: In sign magnitude format the sign of number is indicated by MSB bit. If the result of operation is negative, sign flag is set. \n" +

            "<br><br>&nbsp;&nbsp;<b> Overflow Flag (OF)</b>: It occurs when signed numbers are added or subtracted. An OF indicates that the result has exceeded the capacity of machine.<br><br>";
    String fr = "<br><br> Flags Register determines the current state of the processor. They are modified automatically by CPU after mathematical operations, this allows to determine the type of the result, and to determine conditions to transfer control to other parts of the program. 8086 has 9 flags and they are divided into two categories:<br><br>&nbsp;&nbsp;&nbsp; 1. <b>Conditional Flags</b><br><br>&nbsp;&nbsp;&nbsp; 2. <b>Control Flags</b><br><br>";
    String sr2="1. <b>Code Segment (CS)</b>: The CS register is used for addressing a memory location in the Code Segment of the memory, where the executable program is stored.<br><br> 2. <b>Data Segment (DS)</b>: The DS contains most data used by program. Data are accessed in the Data Segment by an offset address or the content of other register that holds the offset address.<br><br> 3. <b>Stack Segment (SS)</b>: SS defined the area of memory used for the stack. \n" +
            "<br><br> 4. <b>Extra Segment (ES)</b>: ES is additional data segment that is used by some of the string to hold the destination data<br><br>";
    String sr="<br><br> Additional registers called segment registers generate memory address when combined with other in the microprocessor. In 8086 microprocessor, memory is divided into 4 segments as follow:<br><br><br>";
    String gpr = "<br><br>These registers can be used as 8-bit registers individually or can be used as 16-bit in pair to have AX, BX, CX, and DX.<br> \n" +
            " <br>" +
            "1. AX Register: AX register is also known as accumulator register that stores operands for arithmetic operation like divided, rotate.<br><br> 2. BX Register: This register is mainly used as a base register. It holds the starting base location of a memory region within a data segment.<br><br> 3. CX Register: It is defined as a counter. It is primarily used in loop instruction to store loop counter.<br><br> 4. DX Register: DX register is used to contain I/O port address for I/O instruction.<br>";
    String htmlString = "<br><br>    1. To increase the execution speed, BIU fetches as many as six instruction bytes ahead to time from memory. <br><br>    2. All six bytes are then held in first in first out 6 byte register called instruction queue. <br><br>    3. Then all bytes have to be given to EU one by one. <br><br>    4. This pre fetching operation of BIU may be in parallel with execution operation of EU, which improves the speed execution of the instruction";
    String executionTime="<br><br>The functions of execution unit are:<br><br>    &#11044 To tell BIU where to fetch the instructions or data from.<br><br>    &#11044 To decode the instructions.<br><br>    &#11044 To execute the instructions. <br><br>" +
            " \n" +
            "\n\nThe EU contains the control circuitry to perform various internal operations. A decoder in EU decodes the instruction fetched memory to generate different internal or external control signals required to perform the operation. EU has 16-bit ALU, which can perform arithmetic and logical operations on 8-bit as well as 16-bit.";
    String longText="<br><br>The function of BIU is to:<br><br>    &#11044 Fetch the instruction or data from memory.<br><br>    &#11044 Write the data to memory.<br><br>    &#11044 Write the data to the port.<br><br>    &#11044 Read data from the port.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

      // expandableTextView0=(TextView) findViewById(R.id.expandable_text0);
       // expandableTextView=findViewById(R.id.expandable_text_view);
       // expandableTextView0.setText(Html.fromHtml(longText));
        expandableTextView=(TextView)findViewById(R.id.expandable_text);
        expandableTextView.setText(Html.fromHtml(longText));
       expandableTextView2=(TextView)findViewById(R.id.expandable_text2);
        expandableTextView2.setText(Html.fromHtml(htmlString));
        expandableTextView3=(TextView)findViewById(R.id.expandable_text3);
        expandableTextView3.setText(Html.fromHtml(executionTime));
        expandableTextView4=(TextView)findViewById(R.id.expandable_text4);
        expandableTextView4.setText(Html.fromHtml(gpr));
        expandableTextView5=(TextView)findViewById(R.id.expandable_text5);
        expandableTextView5.setText(Html.fromHtml(sr));
        //expandableTextView6=(TextView)findViewById(R.id.expandable_text6);
        //expandableTextView6.setText(Html.fromHtml(sr2));
        expandableTextView7=(TextView)findViewById(R.id.expandable_text7);
        expandableTextView7.setText(Html.fromHtml(fr));
        expandableTextView8=(TextView)findViewById(R.id.expandable_text8);
        expandableTextView8.setText(Html.fromHtml(cf));
        expandableTextView9=(TextView)findViewById(R.id.expandable_text9);
        expandableTextView9.setText(Html.fromHtml(cf2));}
       //expandableTextView.setText(longText);*/
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }


}
