package com.udemy.suraj.micro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ActivityFour6 extends AppCompatActivity {

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

        listDataHeader.add("STC");
        listDataHeader.add("CLC");
        listDataHeader.add("CMC");
        listDataHeader.add("STD");
        listDataHeader.add("CLD");
        listDataHeader.add("STI");
        listDataHeader.add("CLI");

        List<String> edmtDev = new ArrayList<>();
        edmtDev.add("Used to set carry flag CF to 1");

        List<String> androidStudio = new ArrayList<>();
        androidStudio.add("Used to clear/reset carry flag CF to 0");

        List<String> xamarin = new ArrayList<>();
        xamarin.add("Used to put complement at the state of carry flag CF");

        List<String> uwp = new ArrayList<>();
        uwp.add("Used to set the direction flag DF to 1");
        List<String> popa = new ArrayList<>();
        popa.add("Used to clear/reset the direction flag DF to 0");
        List<String> xchg = new ArrayList<>();
        xchg.add("Used to set the interrupt enable flag to 1, i.e., enable INTR input");
        List<String> shr = new ArrayList<>();
        shr.add("Used to clear the interrupt enable flag to 0, i.e., disable INTR input");




        listHash.put(listDataHeader.get(0),edmtDev);
        listHash.put(listDataHeader.get(1),androidStudio);
        listHash.put(listDataHeader.get(2),xamarin);
        listHash.put(listDataHeader.get(3),uwp);
        listHash.put(listDataHeader.get(4),popa);
        listHash.put(listDataHeader.get(5),xchg);
        listHash.put(listDataHeader.get(6),shr);

    }
}