package com.example.computer.oopsample.abstrach_example;

/**
 * Created by computer on 2017. 4. 5..
 */

public abstract class Student {

    //사람인가?
    private boolean isHuman = true;

    //사람인지 확인해주는 메서드
    protected boolean isHuman(){
        return isHuman;
    }

    abstract String getMajor();

}
