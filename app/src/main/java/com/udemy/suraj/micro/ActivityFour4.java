package com.udemy.suraj.micro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ActivityFour4 extends AppCompatActivity {

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

        listDataHeader.add("REP");
        listDataHeader.add("REPE/REPZ");
        listDataHeader.add("REPNE/REPNZ");
        listDataHeader.add("MOVS/MOVSB/MOVSW");
        listDataHeader.add("COMS/COMPSB/COMPSW");
        listDataHeader.add("INS/INSB/INSW");
        listDataHeader.add("OUTS/OUTSB/OUTSW");
        listDataHeader.add("SCAS/SCASB/SCASW");
        listDataHeader.add("LODS/LODSB/LODSW");

        List<String> edmtDev = new ArrayList<>();
        edmtDev.add("Used to repeat the given instruction till CX ≠ 0");

        List<String> androidStudio = new ArrayList<>();
        androidStudio.add("Used to repeat the given instruction until CX = 0 or zero flag ZF = 1");

        List<String> xamarin = new ArrayList<>();
        xamarin.add("Used to repeat the given instruction until CX = 0 or zero flag ZF = 1");

        List<String> uwp = new ArrayList<>();
        uwp.add("Used to move the byte/word from one string to another");
        List<String> popa = new ArrayList<>();
        popa.add("Used to compare two string bytes/words");
        List<String> xchg = new ArrayList<>();
        xchg.add("Used as an input string/byte/word from the I/O port to the provided memory location");
        List<String> shr = new ArrayList<>();
        shr.add("Used as an output string/byte/word from the provided memory location to the I/O port");

        List<String> sar = new ArrayList<>();
        sar.add("Used to scan a string and compare its byte with a byte in AL or string word with a word in AX");

        List<String> xlat = new ArrayList<>();
        xlat.add("Used to store the string byte into AL or string word into AX");




        listHash.put(listDataHeader.get(0),edmtDev);
        listHash.put(listDataHeader.get(1),androidStudio);
        listHash.put(listDataHeader.get(2),xamarin);
        listHash.put(listDataHeader.get(3),uwp);
        listHash.put(listDataHeader.get(4),popa);
        listHash.put(listDataHeader.get(5),xchg);
        listHash.put(listDataHeader.get(6),shr);
        listHash.put(listDataHeader.get(7),sar);
        listHash.put(listDataHeader.get(8),xlat);

    }
}