package pro.sky.java.course2.calculator.CalculatorController;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.calculator.CalculatorController.constants.*;


class CalculatorServiceImplTestParam {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();


    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldSumCorrect(int a, int b) {
        int result = calculatorService.plus(a,b);
        assertEquals(a+b, result);

    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldMinusCorrect(int a, int b) {
        int result = calculatorService.minus(a,b);
        assertEquals(a-b, result);

    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldSMultiplyCorrect(int a, int b) {
        int result = calculatorService.multiply(a,b);
        assertEquals(a*b, result);

    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldDivideCorrect(int a, int b) {
        double result = calculatorService.divide(a,b);
        assertEquals(a/b, result);

    }

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(ONE, ONE),
                Arguments.of(ONE, TWO),
                Arguments.of(THREE, ONE),
                Arguments.of(THREE, THREE),
                Arguments.of(THREE, ONE),
                Arguments.of(THREE, TWO),
                Arguments.of(THREE, ONE),
                Arguments.of(THREE, TWO)

        );

    }


}