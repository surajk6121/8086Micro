package com.udemy.suraj.micro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ActivityFour2 extends AppCompatActivity {

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

        listDataHeader.add("ADD");
        listDataHeader.add("ADC");
        listDataHeader.add("INC");
        listDataHeader.add("AAA");
        listDataHeader.add("DAA");
        listDataHeader.add("SUB");
        listDataHeader.add("SBB");
        listDataHeader.add("DEC");
        listDataHeader.add("NPG");
        listDataHeader.add("CMP");
        listDataHeader.add("AAS");
        listDataHeader.add("DAS");
        listDataHeader.add("MUL");
        listDataHeader.add("IMUL");
        listDataHeader.add("AAM");
        listDataHeader.add("DIV");
        listDataHeader.add("IDIV");
        listDataHeader.add("AAD");
        listDataHeader.add("CBW");
        listDataHeader.add("CWD");

        List<String> edmtDev = new ArrayList<>();
        edmtDev.add("Used to add with carry");

        List<String> androidStudio = new ArrayList<>();
        androidStudio.add("Used to increment the provided byte/word by 1");

        List<String> xamarin = new ArrayList<>();
        xamarin.add("Used to adjust ASCII after addition");

        List<String> uwp = new ArrayList<>();
        uwp.add("Used to adjust the decimal after the addition/subtraction operation");
        List<String> popa = new ArrayList<>();
        popa.add("Used to subtract the byte from byte/word from word");
        List<String> xchg = new ArrayList<>();
        xchg.add("Used to perform subtraction with borrow");
        List<String> xlat = new ArrayList<>();
        xlat.add("Used to decrement the provided byte/word by 1");
        List<String> in = new ArrayList<>();
        in.add("Used to negate each bit of the provided byte/word and add 1/2’s complement");
        List<String> out = new ArrayList<>();
        out.add("Used to compare 2 provided byte/word");
        List<String> lea = new ArrayList<>();
        lea.add("Used to adjust ASCII codes after subtraction");
        List<String> lds = new ArrayList<>();
        lds.add("Used to adjust decimal after subtraction");
        List<String> les = new ArrayList<>();
        les.add("Used to multiply unsigned byte by byte/word by word");
        List<String> lahf = new ArrayList<>();
        lahf.add("Used to multiply signed byte by byte/word by word");
        List<String> sahf = new ArrayList<>();
        sahf.add("Used to adjust ASCII codes after multiplication");
        List<String> pushf = new ArrayList<>();
        pushf.add("Used to divide the unsigned word by byte or unsigned double word by word");
        List<String> popf = new ArrayList<>();
        popf.add("Used to divide the signed word by byte or signed double word by word");
        List<String> aad = new ArrayList<>();
        aad.add("Used to adjust ASCII codes after division");
        List<String> cbw = new ArrayList<>();
        cbw.add("Used to fill the upper byte of the word with the copies of sign bit of the lower byte");
        List<String> cwd = new ArrayList<>();
        cwd.add("Used to fill the upper word of the double word with the sign bit of the lower word");



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
        listHash.put(listDataHeader.get(16),aad);
        listHash.put(listDataHeader.get(16),cbw);
        listHash.put(listDataHeader.get(16),cwd);

    }
}