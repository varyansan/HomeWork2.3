package pro.calculator.calculatorspringboot;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    public String answerHello() {
        return "<h1>Добро пожаловать в калькулятор<h1>";
    }

    public String calculatedSum(int num1, int num2) {
        return String.valueOf(num1 + "+" + num2 + "=" + (num1 + num2));
    }

    public String calculatedSubtraction(int num1, int num2) {
        return String.valueOf(num1 + "-" + num2 + "=" + (num1 - num2));
    }

    public String calculatedMultiplication(int num1, int num2) {
        return String.valueOf(num1 + "*" + num2 + "=" + (num1 * num2));
    }

    public String calculatedDivision(int num1, int num2) {
        return String.valueOf(num1 + "/" + num2 + "=" + (num1 / num2));
    }


}
