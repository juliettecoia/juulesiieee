package com.example.marleybennett.newapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by marleybennett on 7/26/16.
 */
public class Information extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_layout);
    }

    public void mapPage(View view) {
        String button_text;
        button_text = ((Button)view).getText().toString();

        if(button_text.equals("Map"));
        {
            Intent intent = new Intent(this,Map.class);
            startActivity(intent);
        }
    }
}
