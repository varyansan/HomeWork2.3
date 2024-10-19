package pro.calculator.calculatorspringboot;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    public String answerHello() {
        return "<h1>Добро пожаловать в калькулятор<h1>";
    }

    public int calculatedSum(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("<h1>Не введен параметр!<h1>");
        }
        return num1 + num2;
    }

    public int calculatedSubtraction(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("<h1>Не введен параметр!<h1>");
        }
        return num1 - num2;
    }

    public int calculatedMultiplication(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("<h1>Не введен параметр!<h1>");
        }
        return num1 * num2;
    }

    public int calculatedDivision(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("<h1>Не введен параметр!<h1>");
        } else if (num2 == 0) {
            throw new IllegalArgumentException("<h1>Деление на 0 запрещено!<h1>");
        }
        return num1 / num2;
    }


}
