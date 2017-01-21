package com.example.thanhvu.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView)findViewById(R.id.listView);
        ArrayList<String> mangmonhoc = new ArrayList<String>();
        mangmonhoc.add("cau truc du lieu");
        mangmonhoc.add("ly thuyet thongtin");
        mangmonhoc.add("an toan va bao mat thong tin");
        mangmonhoc.add("danh gia hieu nang mang");
        ArrayAdapter list1 = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,mangmonhoc);
        list.setAdapter(list1);
    }
}
