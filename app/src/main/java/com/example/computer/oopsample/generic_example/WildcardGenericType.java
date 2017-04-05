package com.example.computer.oopsample.generic_example;

import java.util.ArrayList;
import java.util.List;

/** ?는 알 수 없는 타입
 *  <?> : 모든 객체 자료형, 내부적으로는 Object로 인식
 *  <? super 객체자료형> : 명시된 객체자료형의 상위 객체, 내부적으로는 Object로 인식
 *  <? extends 객체자료형> : 명시된 객체 자료형을 상속한 하위객체, 내부적으로는 명시된 객체 자료형으로 인식
 */

public class WildcardGenericType {

    public List<? extends Number> method1() {
        return new ArrayList<Long>();
    }

    // Bounded wildcard parameterized type
    public <T> List<? extends String> method2(T param) {
        return new ArrayList<String>();
    }

    // Unbounded wildcard parameterized type
    public List<?> method3() {
        return new ArrayList<>();
    }

}

