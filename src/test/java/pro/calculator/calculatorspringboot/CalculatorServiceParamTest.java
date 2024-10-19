package pro.calculator.calculatorspringboot;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParamTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @DisplayName("Корректно ли складывает 2 параметра")
    @MethodSource("provideDifferentSumParams")
    void calculatedSum3(int a, int b) {

        int expected = a + b;

        int actual = calculatorService.calculatedSum(a, b);

        assertEquals(actual, expected);
    }

    private static Stream<Arguments> provideDifferentSumParams() {
        return Stream.of(Arguments.of(100, 200),
                Arguments.of(0, 0),
                Arguments.of(-120, 120),
                Arguments.of(-130, -200),
                Arguments.of(52, 0));
    }

    @ParameterizedTest
    @DisplayName("Корректно ли умножает 2 параметра")
    @MethodSource("provideDifferentMultiplyParams")
    void calculatedMultiply2(int a, int b) {

        int expected = a * b;

        int actual = calculatorService.calculatedMultiplication(a, b);

        assertEquals(actual, expected);
    }

    private static Stream<Arguments> provideDifferentMultiplyParams() {
        return Stream.of(Arguments.of(100, 200),
                Arguments.of(0, 0),
                Arguments.of(-120, 120),
                Arguments.of(-130, -200),
                Arguments.of(52, 0));
    }
}
