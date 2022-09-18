package pro.sky.java.course2.calculator.CalculatorController;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello() {
        return "<h2>Добро пожаловать в калькулятор<h2/>";
    }


    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("ввести значение");
        }

        return num1 + " + " + num2 + "=" + String.valueOf((double) num1 + num2);
    }


    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("ввести значение");
        }
        return num1 + " - " + num2 + "=" + String.valueOf((double) num1 - num2);
    }

    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("ввести значение");
        }
        return num1 + " * " + num2 + "=" + String.valueOf((double) num1 * num2);
    }

    public String divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("ввести значение");
        }
        return num1 + " / " + num2 + "=" + String.valueOf((double) num1 / num2);
    }
}
