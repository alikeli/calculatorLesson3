package pro.sky.java.course2.calculator.CalculatorController;

import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculator.exeption.DividionByZeroException;


import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.calculator.CalculatorController.constants.*;

class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void returnTwoWhenSumOneAndOne() {
        int result = calculatorService.plus(ONE, ONE);
        assertEquals(ONE + ONE, result);

    }

    @Test
    public void returnThreeWhenSumOneAndTwo() {
        int result = calculatorService.plus(ONE, TWO);
        assertEquals(ONE + TWO, result);
    }



    @Test
    public void returnTwoWhenMinusThreeAndOne() {
        int result = calculatorService.minus(THREE, ONE);
        assertEquals(THREE - ONE, result);

    }

    @Test
    public void returnZeroWhenMinusThreeAndThree() {
        int result = calculatorService.minus(THREE, THREE);
        assertEquals(THREE - THREE, result);
    }
    @Test
    public void returnThreeWhenMultiplyThreeAndOne() {
        int result = calculatorService.multiply(THREE, ONE);
        assertEquals(THREE * ONE, result);

    }

    @Test
    public void returnSixWhenMultiplyThreeAndTwo() {
        int result = calculatorService.multiply(THREE, TWO);
        assertEquals(THREE * TWO, result);
    }

    @Test
    public void returnThreeWhenMDivideThreeAndOne() {
        double result = calculatorService.divide(THREE, ONE);
        assertEquals(THREE / ONE, result);

    }

    @Test
    public void returnWhenMultiplyThreeAndThree() {
        double result = calculatorService.divide(THREE, THREE);
        assertEquals(THREE / TWO, result);
    }
    @Test
    public void returnThrowIllegalArgumentExcWhenDivideByZero() {
//        double result = calculatorService.divide(THREE, ZERO);
        assertThrows(DividionByZeroException.class, () -> calculatorService.divide(THREE, ZERO));
    }


}