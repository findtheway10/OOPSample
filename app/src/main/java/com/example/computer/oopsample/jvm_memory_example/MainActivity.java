package com.example.computer.oopsample.jvm_memory_example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.computer.oopsample.R;

/**
 * 해당 라인이 어떤 메모리 공간에서 동작하는지 적으시오
 * 단, 코드가 모두 실행 되었을 때로 가정하며 GC는 일어나지 않는다.
 *
 */

public class MainActivity extends AppCompatActivity {


    //1 : ?
    public static final int NUMBER = 1;

    //2 : ?
    private String testMessage = "hello world";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //3 : ?
        setContentView(R.layout.activity_main);

        //4 : ?
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //5 : ?
        setSupportActionBar(toolbar);

        //6 : ?
        Button tempButton;

        //7 : ?
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        //8 : ?
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //9 : ?
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //10 : ?
        Intent testIntent = new Intent();

        //11 : ?
        setHappy();

        //12 : ?
        getDinner();

    }

    //13 : ?
    public static void setHappy(){

    }

    //14 : ?
    private void getRice(){

    }

    //15 : ?
    private void washRice(){
        getRice();
    }

    //16 : ?
    private void makeRice(){
        washRice();
    }

    //17 : ?
    private void getDinner(){
        makeRice();
    }

}
