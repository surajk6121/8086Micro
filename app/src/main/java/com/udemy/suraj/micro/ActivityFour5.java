package com.udemy.suraj.micro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ActivityFour5 extends AppCompatActivity {

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

        listDataHeader.add("CALL");
        listDataHeader.add("RET");
        listDataHeader.add("JMP");
        listDataHeader.add("JA/JNBE");
        listDataHeader.add("JAE/JNB");
        listDataHeader.add("JBE/JNA");
        listDataHeader.add("JC");
        listDataHeader.add("JE/JZ");
        listDataHeader.add("JG/JNLE");
        listDataHeader.add("JGE/JNL");
        listDataHeader.add("JL/JNGE");
        listDataHeader.add("JLE/JNG");
        listDataHeader.add("JNC");
        listDataHeader.add("JNE/JNZ");
        listDataHeader.add("JNO");
        listDataHeader.add("JNP/JPO");
        listDataHeader.add("JNS");
        listDataHeader.add("JO");
        listDataHeader.add("JP/JPE");
        listDataHeader.add("JS");


        List<String> edmtDev = new ArrayList<>();
        edmtDev.add(" Used to call a procedure and save their return address to the stack");

        List<String> androidStudio = new ArrayList<>();
        androidStudio.add("Used to return from the procedure to the main program");

        List<String> xamarin = new ArrayList<>();
        xamarin.add("Used to jump to the provided address to proceed to the next instruction");

        List<String> uwp = new ArrayList<>();
        uwp.add("Used to jump if above/not below/equal instruction satisfies");
        List<String> popa = new ArrayList<>();
        popa.add("Used to jump if above/not below instruction satisfies");
        List<String> xchg = new ArrayList<>();
        xchg.add("Used to jump if below/equal/ not above instruction satisfies");
        List<String> shr = new ArrayList<>();
        shr.add("Used to jump if carry flag CF = 1");

        List<String> sar = new ArrayList<>();
        sar.add("Used to jump if equal/zero flag ZF = 1");

        List<String> xlat1 = new ArrayList<>();
        xlat1.add("Used to jump if greater/not less than/equal instruction satisfies");
        List<String> xlat2 = new ArrayList<>();
        xlat2.add("Used to jump if greater than/equal/not less than instruction satisfies");
        List<String> xlat3 = new ArrayList<>();
        xlat3.add("Used to jump if less than/not greater than/equal instruction satisfies");
        List<String> xlat4 = new ArrayList<>();
        xlat4.add("Used to jump if less than/equal/if not greater than instruction satisfies");
        List<String> xlat5 = new ArrayList<>();
        xlat5.add("Used to jump if no carry flag (CF = 0)");
        List<String> xlat6 = new ArrayList<>();
        xlat6.add("Used to jump if not equal/zero flag ZF = 0");
        List<String> xlat7 = new ArrayList<>();
        xlat7.add("Used to jump if no overflow flag OF = 0");
        List<String> xlat8 = new ArrayList<>();
        xlat8.add("Used to jump if not parity/parity odd PF = 0");
        List<String> xlat9 = new ArrayList<>();
        xlat9.add("Used to jump if not sign SF = 0");
        List<String> xlat10 = new ArrayList<>();
        xlat10.add("Used to jump if overflow flag OF = 1");
        List<String> xlat11 = new ArrayList<>();
        xlat11.add("Used to jump if parity/parity even PF = 1");
        List<String> xlat12 = new ArrayList<>();
        xlat12.add("Used to jump if sign flag SF = 1");




        listHash.put(listDataHeader.get(0),edmtDev);
        listHash.put(listDataHeader.get(1),androidStudio);
        listHash.put(listDataHeader.get(2),xamarin);
        listHash.put(listDataHeader.get(3),uwp);
        listHash.put(listDataHeader.get(4),popa);
        listHash.put(listDataHeader.get(5),xchg);
        listHash.put(listDataHeader.get(6),shr);
        listHash.put(listDataHeader.get(7),sar);
        listHash.put(listDataHeader.get(8),xlat1);
        listHash.put(listDataHeader.get(9),xlat2);
        listHash.put(listDataHeader.get(10),xlat3);
        listHash.put(listDataHeader.get(11),xlat4);
        listHash.put(listDataHeader.get(12),xlat5);
        listHash.put(listDataHeader.get(13),xlat6);
        listHash.put(listDataHeader.get(14),xlat7);
        listHash.put(listDataHeader.get(15),xlat8);
        listHash.put(listDataHeader.get(16),xlat9);
        listHash.put(listDataHeader.get(17),xlat10);
        listHash.put(listDataHeader.get(18),xlat11);
        listHash.put(listDataHeader.get(19),xlat12);

    }
}