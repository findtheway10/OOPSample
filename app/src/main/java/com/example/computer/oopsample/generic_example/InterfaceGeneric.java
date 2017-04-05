package com.example.computer.oopsample.generic_example;


/**
 * Interface generic type 또한 Class generic type과 사용방법이 유사하다.
 * 아래는 제너릭 타입이 두 개 선언된 것을 알 수 있는데
 * <T1, T2> 이는 abstract method의 제너릭 타입을 다르게 주고 싶을 때 사용하면 된다.
 */

public interface InterfaceGeneric<Type1, Type2> {

    Type1 doSomething();

    Type2 doSomethings();

}
