package com.example.juliettecoia.testing_1_2_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by juliettecoia on 7/26/16.
 */
public class SecondActivity extends AppCompatActivity {

    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        textview = (TextView) findViewById(R.id.button2);
    }

    public void goToA3 (View view){
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Donate"))
        {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }

        //String message = "Done";
        //textview.setText(message);
    }
}
