package com.example.ojboba.passintentdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity implements OnClickListener {

    private Button sButton,pButton;
    public  final static String SER_KEY = "com.easyinfogeek.objectPass.ser";
    public  final static String PAR_KEY = "com.easyinfogeek.objectPass.par";
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();

    }

    public void setupViews(){
        sButton = (Button)findViewById(R.id.button1);
        pButton = (Button)findViewById(R.id.button2);
        sButton.setOnClickListener(this);
        pButton.setOnClickListener(this);
    }

    public void SerializeMethod(){
        Person mPerson = new Person();
        mPerson.setName("Leon");
        mPerson.setAge(25);
        Intent mIntent = new Intent(this,ObjectTranDemo1.class);
        Bundle mBundle = new Bundle();
        mBundle.putSerializable(SER_KEY,mPerson);
        mIntent.putExtras(mBundle);

        startActivity(mIntent);
    }

    public void PacelableMethod(){

        ArrayList<Book> words = new ArrayList<Book>();
        words.add(new Book("red", "yes", 1));
        words.add(new Book("mustard", "yes", 1));
        Toast.makeText(this, "" + words, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,ObjectTranDemo2.class);
        intent.putParcelableArrayListExtra("Contact_list", words);
        Bundle mBundle = new Bundle();
        intent.putExtras(mBundle);
        startActivity(intent);
    }

    public void onClick(View v) {
        if(v == sButton){
            SerializeMethod();
        }else{
            PacelableMethod();
        }
    }
}