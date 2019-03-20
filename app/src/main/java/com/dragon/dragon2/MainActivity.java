package com.dragon.dragon2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ListView mListView;



    RowItem row1 = new RowItem(1, "00:10", false, false, false,false, false, false,false);

    RowItem row2 = new RowItem(2, "00:20", false, false, false,false, false, false,false);
    RowItem row3 = new RowItem(3, "00:30", false, false, false,false, false, false,false);

    RowItem row4 = new RowItem(4, "00:40", false, false, false,false, false, false,false);
    RowItem row5 = new RowItem(5, "00:50", false, false, false,false, false, false,false);
    RowItem row6 = new RowItem(6, "00:56", false, false, false,false, false, false,false);

    RowItem row7 = new RowItem(7, "07:30", false, false, false,false, false, false,false);
    RowItem row8 = new RowItem(8, "08:30", false, false, false,false, false, false,false);
    RowItem row9 = new RowItem(9, "09:30", false, false, false,false, false, false,false);

    RowItem row10 = new RowItem(10, "10:30", false, false, false,false, false, false,false);
    RowItem row11 = new RowItem(11, "11:30", false, false, false,false, false, false,false);
    RowItem row12 = new RowItem(12, "12:30", false, false, false,false, false, false,false);

    RowItem row13 = new RowItem(13, "13:30", false, false, false,false, false, false,false);
    RowItem row14 = new RowItem(14, "14:30", false, false, false,false, false, false,false);
    RowItem row15 = new RowItem(15, "15:30", false, false, false,false, false, false,false);

    List<RowItem> rows = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listview);


        rows.add(row1);
        rows.add(row2);
        rows.add(row3);

        rows.add(row4);
        rows.add(row5);
        rows.add(row6);

        rows.add(row7);
        rows.add(row8);
        rows.add(row9);


        rows.add(row10);
        rows.add(row11);
        rows.add(row12);


        rows.add(row13);
        rows.add(row14);
        rows.add(row15);

        CustomListViewAdapter myAdapter = new CustomListViewAdapter(this, R.layout.listview_item, rows);

        mListView.setAdapter(myAdapter);

        /* --no use
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +position, Toast.LENGTH_SHORT).show();

            }
        });
        */
    }


}
