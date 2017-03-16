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

//    private ListViewAdapter listViewAdapter;
//    private ListView listView;
//

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Book> myList = getIntent().getParcelableArrayListExtra("Contact_list");
        Toast.makeText(this, "" + myList, Toast.LENGTH_SHORT).show();

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        BookAdapter adapter = new BookAdapter(this, myList);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }
}