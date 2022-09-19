package pro.sky.java.course2.calculator.CalculatorController;

import org.springframework.stereotype.Service;

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
        return num1 / num2;
    }
}
