package com.example.ojboba.passintentdemo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by OjBoba on 3/16/2017.
 */

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Activity context, ArrayList<Book> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        // Pass a zero for the resource Id because we are inflating the view ourselves with the getView Method
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        // This method call is used to recycle the view when ever it is not being used
        // The list item view is commonly null, so the statement is used to help prevent any erros
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Book currentBook = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView topTextView = (TextView) listItemView.findViewById(R.id.hmong_text_list);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        topTextView.setText(currentBook.getBookName());

        TextView bottomTextView = (TextView) listItemView.findViewById(R.id.english_text_list);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        bottomTextView.setText(currentBook.getAuthor());

        return listItemView;
    }

}
