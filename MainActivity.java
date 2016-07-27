package com.example.marleybennett.newapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView) findViewById(R.id.textView);
    }


    public void ShowGreetings(View view) {
        String button_text;
        button_text = ((Button)view).getText().toString();

        if(button_text.equals("Enter"));
        {
            Intent intent = new Intent(this,Information.class);
            startActivity(intent);
        }
    }


}