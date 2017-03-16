package com.example.ojboba.passintentdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by OjBoba on 3/15/2017.
 */

public class ListViewAdapter extends ArrayAdapter<Book> {
    public ListViewAdapter(Context context, int resource, List<Book> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if(null==v){
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.list_item, parent, false);
        }
        Book currentBook = getItem(position);
        TextView hmong = (TextView) v.findViewById(R.id.hmong_text_list);
        TextView english = (TextView) v.findViewById(R.id.english_text_list);

        hmong.setText(currentBook.getBookName());
        english.setText(currentBook.getAuthor());


        return v;
    }
}
