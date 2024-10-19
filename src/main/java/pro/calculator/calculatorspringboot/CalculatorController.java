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
    public int calculatedSum(@RequestParam(value = "num1", required = false) Integer num1,
                             @RequestParam(value = "num2", required = false) Integer num2) {

        return calculatorService.calculatedSum(num1, num2);
    }

    @GetMapping("/minus")
    public int calculatedSubtraction(@RequestParam(value = "num1", required = false) Integer num1,
                                     @RequestParam(value = "num2", required = false) Integer num2) {

        return calculatorService.calculatedSubtraction(num1, num2);
    }

    @GetMapping("/multiply")
    public int calculatedMultiplication(@RequestParam(value = "num1", required = false) Integer num1,
                                        @RequestParam(value = "num2", required = false) Integer num2) {

        return calculatorService.calculatedMultiplication(num1, num2);
    }

    @GetMapping("/divide")
    public int calculatedDivision(@RequestParam(value = "num1", required = false) Integer num1,
                                  @RequestParam(value = "num2", required = false) Integer num2) {

        return calculatorService.calculatedDivision(num1, num2);
    }
}
