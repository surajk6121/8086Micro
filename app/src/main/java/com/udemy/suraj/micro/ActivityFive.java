package com.udemy.suraj.micro;

/**
 * Created by Suraj Kumar on 24-02-2018.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class ActivityFive extends AppCompatActivity {
    TextView expandableTextView;
    TextView expandableTextView2;
    TextView expandableTextView3;
    TextView expandableTextView4;
    TextView expandableTextView5;
    TextView expandableTextView6;
    TextView expandableTextView7;
    TextView expandableTextView8;
    TextView expandableTextView9;
    TextView expandableTextView10;
    TextView expandableTextView11;
    TextView expandableTextView12;
    TextView expandableTextView13;
    TextView expandableTextView14;
    TextView expandableTextView15;
    TextView expandableTextView16;
    TextView expandableTextView17;
    TextView expandableTextView18;
    TextView expandableTextView19;
    TextView expandableTextView20;
    TextView expandableTextView21;
    TextView expandableTextView22;
    TextView expandableTextView23;

    String cf2="<br><br>It is available at pin 18. It is an interrupt request signal, which is sampled during the last clock cycle of each instruction to determine if the processor considered this as an interrupt or not";
    String cf="<br><br>It is available at pin 21 and is used to restart the execution. It causes the processor to immediately terminate its present activity. This signal is active high for the first 4 clock cycles to RESET the microprocessor";
    String fr = "<br><br> It is available at pin 32. It is an acknowledgement signal from I/O devices that data is transferred. It is an active high signal. When it is high, it indicates that the device is ready to transfer data. When it is low, it indicates wait state";
    String sr2="1. <b>Code Segment (CS)</b>: The CS register is used for addressing a memory location in the Code Segment of the memory, where the executable program is stored.<br><br> 2. <b>Data Segment (DS)</b>: The DS contains most data used by program. Data are accessed in the Data Segment by an offset address or the content of other register that holds the offset address.<br><br> 3. <b>Stack Segment (SS)</b>: SS defined the area of memory used for the stack. \n" +
            "<br><br> 4. <b>Extra Segment (ES)</b>: ES is additional data segment that is used by some of the string to hold the destination data<br><br>";
    String sr="<br><br>It is available at pin 32 and is used to read signal for Read operation ";
    String gpr = "<br><br>BHE stands for Bus High Enable. It is available at pin 34 and used to indicate the transfer of data using data bus D8-D15. This signal is low during the first clock cycle, thereafter it is active";
    String htmlString = "<br><br>Clock signal is provided through Pin-19. It provides timing to the processor for operations. Its frequency is different for different versions, i.e. 5MHz, 8MHz and 10MHz";
    String executionTime="<br><br>AD0-AD15. These are 16 address/data bus. AD0-AD7 carries low order byte data and AD8AD15 carries higher order byte data. During the first clock cycle, it carries 16-bit address and after that it carries 16-bit data";
    String longText="<br><br>It uses 5V DC supply at VCC pin 40, and uses ground at VSS pin 1 and 20 for its operation.";
    String nmi="\n\nIt stands for non-maskable interrupt and is available at pin 17. It is an edge triggered input, which causes an interrupt request to the microprocessor.\n" +
            "\n" +
            "$\\overline{TEST}$\n" +
            "\n" +
            "This signal is like wait state and is available at pin 23. When this signal is high, then the processor has to wait for IDLE state, else the execution continues.";
    String mn="\n\nIt stands for Minimum/Maximum and is available at pin 33. It indicates what mode the processor is to operate in; when it is high, it works in the minimum mode and vice-aversa.";
    String inta="\n\nIt is an interrupt acknowledgement signal and id available at pin 24. When the microprocessor receives this signal, it acknowledges the interrupt";
    String ale="\n\n\n" +
            "It stands for address enable latch and is available at pin 25. A positive pulse is generated each time the processor begins any operation. This signal indicates the availability of a valid address on the address/data lines";
    String den="\n\nIt stands for Data Enable and is available at pin 26. It is used to enable Transreceiver 8286. The transreceiver is a device used to separate data from the address/data bus.";
    String dtr="\n\nIt stands for Data Transmit/Receive signal and is available at pin 27. It decides the direction of data flow through the transreceiver. When it is high, data is transmitted out and vice-a-versa.";
    String mio="\n\nThis signal is used to distinguish between memory and I/O operations. When it is high, it indicates I/O operation and when it is low indicates the memory operation. It is available at pin 28.";
    String wr="\n\n\n" +
            "It stands for write signal and is available at pin 29. It is used to write the data into the memory or the output device depending on the status of M/IO signal.";
    String hlda="\n\nIt stands for Hold Acknowledgement signal and is available at pin 30. This signal acknowledges the HOLD signal.";
    String hold="\n\nThis signal indicates to the processor that external devices are requesting to access the address/data buses. It is available at pin 31.";
    String qs1="\n\nThese are queue status signals and are available at pin 24 and 25. These signals provide the status of instruction queue.";
    String s0="\n\nThese are the status signals that provide the status of operation, which is used by the Bus Controller 8288 to generate memory & I/O control signals. These are available at pin 26, 27, and 28. ";
    String lock="\n\nWhen this signal is active, it indicates to the other processors not to ask the CPU to leave the system bus. It is activated using the LOCK prefix on any instruction and is available at pin 29.";
    String rq="\n\nThese are the Request/Grant signals used by the other processors requesting the CPU to release the system bus. When the signal is received by CPU, then it sends acknowledgment. RQ/GT0 has a higher priority than RQ/GT1.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
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
        expandableTextView9.setText(Html.fromHtml(cf2));
        expandableTextView10=(TextView)findViewById(R.id.expandable_text10);
        expandableTextView10.setText(nmi);
        expandableTextView11=(TextView)findViewById(R.id.expandable_text11);
        expandableTextView11.setText((mn));
        expandableTextView12=(TextView)findViewById(R.id.expandable_text12);
        expandableTextView12.setText((inta));
        expandableTextView13=(TextView)findViewById(R.id.expandable_text13);
        expandableTextView13.setText((ale));
        expandableTextView14=(TextView)findViewById(R.id.expandable_text14);
        expandableTextView14.setText((den));
        expandableTextView15=(TextView)findViewById(R.id.expandable_text15);
        expandableTextView15.setText((dtr));
        expandableTextView16=(TextView)findViewById(R.id.expandable_text16);
        expandableTextView16.setText((mio));
        expandableTextView17=(TextView)findViewById(R.id.expandable_text17);
        expandableTextView17.setText((wr));
        expandableTextView18=(TextView)findViewById(R.id.expandable_text18);
        expandableTextView18.setText((hlda));
        expandableTextView19=(TextView)findViewById(R.id.expandable_text19);
        expandableTextView19.setText((hold));
        expandableTextView20=(TextView)findViewById(R.id.expandable_text20);
        expandableTextView20.setText((qs1));
        expandableTextView21=(TextView)findViewById(R.id.expandable_text21);
        expandableTextView21.setText((s0));
        expandableTextView22=(TextView)findViewById(R.id.expandable_text22);
        expandableTextView22.setText((lock));
        expandableTextView23=(TextView)findViewById(R.id.expandable_text23);
        expandableTextView23.setText((rq));

    }
    //expandableTextView.setText(longText);*/
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }


}
