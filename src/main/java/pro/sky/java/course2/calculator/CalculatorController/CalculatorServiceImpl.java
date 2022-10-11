package pro.sky.java.course2.calculator.CalculatorController;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.CalculatorController.CalculatorService;
import pro.sky.java.course2.calculator.exeption.DividionByZeroException;


@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return "<h2>Добро пожаловать в калькулятор<h2/>";
    }

    @Override
    public int plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public int minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public double divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null)
            throw new DividionByZeroException("Введите параметр") ;
        if (num2 == 0)
            throw new DividionByZeroException("На ноль делить нельзя") ;
        return num1 / num2;
    }
}
