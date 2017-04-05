package com.example.computer.oopsample.generic_example;

import android.view.View;

/**
 * 메소드 제너릭 타입은 클래스에 제너릭 타입을 선언하지 않아도 되며
 * 아래와 같이 필요한 메서드에 제너릭 타입을 선언하면 된다.
 * 여기서 유념해야 할 점은 메서드 아규먼트에 타입 매개변수 T가 선언되어 있으면
 * 메서드의 리턴 타입 앞에 제너릭 타입을 선언해야 한다.
 * int 옆에 있는 <T> 쉽게 생각해서 T, E, V, U 등등의 타입 매개변수가 선언되어 있다면
 * 제너릭 타입이 필수적으로 선언되어야 한다라는 것이다.
 */

public class MethodGenericType {

    public static <T> int methodGeneric(T[] list, T item) {
        int count = 0;
        for (T t : list) {
            if (item == t) {
                count++;
            }
        }
        return count;
    }

    public static <V extends View> int getViewId(V view){

        return view.getId();

    }

}
