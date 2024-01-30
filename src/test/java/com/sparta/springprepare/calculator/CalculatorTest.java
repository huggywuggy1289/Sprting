package com.sparta.springprepare.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test //test()를 실행하려면 여기 위에 @로 시작하는 에너테이션을 넣어주어야한다. junit패키지에 존재한다.
    @DisplayName("더하기 테스트")
    void test1() { //반환타입, 메서드명
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "+", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(10, result); //Assertions는 test코드내에서 사용하는 동작을 검사한다. 즉, equals로 동일한지, 괄호()안에 예상값 10을 넣고, 결과 반환
    } //Assertions에 예상값과 결괏값이 틀리면 오류가 나온다.

    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "/", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(4, result);
    }
}