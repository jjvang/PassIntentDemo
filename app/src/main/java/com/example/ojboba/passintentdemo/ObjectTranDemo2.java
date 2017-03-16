package com.example.ojboba.passintentdemo;

/**
 * Created by OjBoba on 3/15/2017.
 */

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ObjectTranDemo2 extends Activity {

    private ListViewAdapter listViewAdapter;
    private ListView listView;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<Book> myList = getIntent().getParcelableExtra("Contact_list");
        Toast.makeText(this, "" + myList, Toast.LENGTH_SHORT).show();

    }
}