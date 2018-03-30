package com.udemy.suraj.micro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ActivityFour3 extends AppCompatActivity {

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

        listDataHeader.add("NOT");
        listDataHeader.add("AND");
        listDataHeader.add("OR");
        listDataHeader.add("XOR");
        listDataHeader.add("TEST");
        listDataHeader.add("SHL/SAL");
        listDataHeader.add("SHR");
        listDataHeader.add("SAR");
        listDataHeader.add("ROL");
        listDataHeader.add("ROR");
        listDataHeader.add("RCR");
        listDataHeader.add("RCL");

        List<String> edmtDev = new ArrayList<>();
        edmtDev.add("Used to invert each bit of a byte or word");

        List<String> androidStudio = new ArrayList<>();
        androidStudio.add("Used for adding each bit in a byte/word with the corresponding bit in another byte/word");

        List<String> xamarin = new ArrayList<>();
        xamarin.add("Used to multiply each bit in a byte/word with the corresponding bit in another byte/word");

        List<String> uwp = new ArrayList<>();
        uwp.add("Used to perform Exclusive-OR operation over each bit in a byte/word with the corresponding bit in another byte/word");
        List<String> popa = new ArrayList<>();
        popa.add("Used to add operands to update flags, without affecting operands");
        List<String> xchg = new ArrayList<>();
        xchg.add("Used to shift bits of a byte/word towards left and put zero(S) in LSBs");
        List<String> shr = new ArrayList<>();
        shr.add("Used to shift bits of a byte/word towards the right and put zero(S) in MSBs");

        List<String> sar = new ArrayList<>();
        sar.add("Used to shift bits of a byte/word towards the right and copy the old MSB into the new MSB");

        List<String> xlat = new ArrayList<>();
        xlat.add("Used to rotate bits of byte/word towards the left, i.e. MSB to LSB and to Carry Flag [CF]");
        List<String> in = new ArrayList<>();
        in.add("Used to rotate bits of byte/word towards the right, i.e. LSB to MSB and to Carry Flag [CF]");
        List<String> out = new ArrayList<>();
        out.add("Used to rotate bits of byte/word towards the right, i.e. LSB to CF and CF to MSB");
        List<String> lea = new ArrayList<>();
        lea.add("Used to rotate bits of byte/word towards the left, i.e. MSB to CF and CF to LSB");



        listHash.put(listDataHeader.get(0),edmtDev);
        listHash.put(listDataHeader.get(1),androidStudio);
        listHash.put(listDataHeader.get(2),xamarin);
        listHash.put(listDataHeader.get(3),uwp);
        listHash.put(listDataHeader.get(4),popa);
        listHash.put(listDataHeader.get(5),xchg);
        listHash.put(listDataHeader.get(6),shr);
        listHash.put(listDataHeader.get(7),sar);
        listHash.put(listDataHeader.get(8),xlat);
        listHash.put(listDataHeader.get(9),in);
        listHash.put(listDataHeader.get(10),out);
        listHash.put(listDataHeader.get(11),lea);

    }
}