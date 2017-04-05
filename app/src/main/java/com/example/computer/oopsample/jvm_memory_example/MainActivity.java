package com.example.computer.oopsample.jvm_memory_example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.computer.oopsample.R;

public class MainActivity extends AppCompatActivity {


    //class area
    public static final int NUMBER = 1;

    private String testMessage = "hello world";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //heap memory
        Intent testIntent = new Intent();

    }



    /*
    * stack memory
    */
    private void getRice(){

    }

    private void washRice(){
        getRice();
    }

    private void makeRice(){
        washRice();
    }

    private void getDinner(){
        makeRice();
    }

}
