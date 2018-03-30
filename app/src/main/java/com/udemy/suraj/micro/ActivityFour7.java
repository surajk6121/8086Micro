package com.udemy.suraj.micro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ActivityFour7 extends AppCompatActivity {

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

        listDataHeader.add("LOOP");
        listDataHeader.add("LOOPE/LOOPZ");
        listDataHeader.add("LOOPNE/LOOPNZ");
        listDataHeader.add("JCXZ");

        List<String> edmtDev = new ArrayList<>();
        edmtDev.add("Used to loop a group of instructions until the condition satisfies, i.e., CX = 0");

        List<String> androidStudio = new ArrayList<>();
        androidStudio.add("Used to loop a group of instructions till it satisfies ZF = 1 & CX = 0");

        List<String> xamarin = new ArrayList<>();
        xamarin.add("Used to loop a group of instructions till it satisfies ZF = 0 & CX = 0");

        List<String> uwp = new ArrayList<>();
        uwp.add("Used to jump to the provided address if CX = 0");



        listHash.put(listDataHeader.get(0),edmtDev);
        listHash.put(listDataHeader.get(1),androidStudio);
        listHash.put(listDataHeader.get(2),xamarin);
        listHash.put(listDataHeader.get(3),uwp);

    }
}