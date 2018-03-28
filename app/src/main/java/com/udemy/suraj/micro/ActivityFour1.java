package com.udemy.suraj.micro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ActivityFour1 extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four1);

        listView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("MOV");
        listDataHeader.add("PPUSH");
        listDataHeader.add("POP");
        listDataHeader.add("PUSHA");
        listDataHeader.add("POPA");
        listDataHeader.add("XCHG");
        listDataHeader.add("PUSHA");
        listDataHeader.add("XLAT");
        listDataHeader.add("IN");
        listDataHeader.add("OUT");
        listDataHeader.add("LEA");
        listDataHeader.add("LDS");
        listDataHeader.add("LES");
        listDataHeader.add("LAHF");
        listDataHeader.add("SAHF");
        listDataHeader.add("PUSHF");
        listDataHeader.add("POPF");

        List<String> edmtDev = new ArrayList<>();
        edmtDev.add("Used to copy the byte or word from the provided source to the provided destination");

        List<String> androidStudio = new ArrayList<>();
        androidStudio.add("Used to put a word at the top of the stack");

        List<String> xamarin = new ArrayList<>();
        xamarin.add("Used to get a word from the top of the stack to the provided location");

        List<String> uwp = new ArrayList<>();
        uwp.add("Used to put all the registers into the stack");
        List<String> popa = new ArrayList<>();
        popa.add("Used to get words from the stack to all registers");
        List<String> xchg = new ArrayList<>();
        xchg.add("Used to exchange the data from two locations");
        List<String> xlat = new ArrayList<>();
        xlat.add("Used to translate a byte in AL using a table in the memory");
        List<String> in = new ArrayList<>();
        in.add("Used to read a byte or word from the provided port to the accumulator");
        List<String> out = new ArrayList<>();
        out.add("Used to send out a byte or word from the accumulator to the provided port");
        List<String> lea = new ArrayList<>();
        lea.add("Used to load the address of operand into the provided register");
        List<String> lds = new ArrayList<>();
        lds.add("Used to load DS register and other provided register from the memory");
        List<String> les = new ArrayList<>();
        les.add("Used to load ES register and other provided register from the memory");
        List<String> lahf = new ArrayList<>();
        lahf.add("Used to load AH with the low byte of the flag register");
        List<String> sahf = new ArrayList<>();
        sahf.add("Used to store AH register to low byte of the flag register");
        List<String> pushf = new ArrayList<>();
        pushf.add("Used to copy the flag register at the top of the stack");
        List<String> popf = new ArrayList<>();
        popf.add("Used to copy a word at the top of the stack to the flag register");



        listHash.put(listDataHeader.get(0),edmtDev);
        listHash.put(listDataHeader.get(1),androidStudio);
        listHash.put(listDataHeader.get(2),xamarin);
        listHash.put(listDataHeader.get(3),uwp);
        listHash.put(listDataHeader.get(4),popa);
        listHash.put(listDataHeader.get(5),uwp);
        listHash.put(listDataHeader.get(6),xchg);
        listHash.put(listDataHeader.get(7),xlat);
        listHash.put(listDataHeader.get(8),in);
        listHash.put(listDataHeader.get(9),out);
        listHash.put(listDataHeader.get(10),lea);
        listHash.put(listDataHeader.get(11),lds);
        listHash.put(listDataHeader.get(12),les);
        listHash.put(listDataHeader.get(13),lahf);
        listHash.put(listDataHeader.get(14),sahf);
        listHash.put(listDataHeader.get(15),pushf);
        listHash.put(listDataHeader.get(16),popf);

    }
}