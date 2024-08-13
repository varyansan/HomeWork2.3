package pro.calculator.calculatorspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String answerHello() {
        return calculatorService.answerHello();
    }

    @GetMapping("/plus")
    public String calculatedSum(@RequestParam(value = "num1", required = false) Integer num1,
                                @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "<h1>Не введен параметр!<h1>";
        }
        return calculatorService.calculatedSum(num1, num2);
    }

    @GetMapping("/minus")
    public String calculatedSubtraction(@RequestParam(value = "num1", required = false) Integer num1,
                                        @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "<h1>Не введен параметр!<h1>";
        }
        return calculatorService.calculatedSubtraction(num1, num2);
    }

    @GetMapping("/multiply")
    public String calculatedMultiplication(@RequestParam(value = "num1", required = false) Integer num1,
                                           @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "<h1>Не введен параметр!<h1>";
        }
        return calculatorService.calculatedMultiplication(num1, num2);
    }

    @GetMapping("/divide")
    public String calculatedDivision(@RequestParam(value = "num1", required = false) Integer num1,
                                     @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "<h1>Не введен параметр!<h1>";
        }
        if (num2 == 0) {
            return "<h1>Деление на 0 запрещено!<h1>";
        }
        return calculatorService.calculatedDivision(num1, num2);
    }
}
