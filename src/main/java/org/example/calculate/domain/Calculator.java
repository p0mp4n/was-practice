package org.example.calculate.domain;

import org.example.calculate.tobe.*;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> arithmeticOperator = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        try{
            Thread.sleep(5_000L);
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
        return arithmeticOperator.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
