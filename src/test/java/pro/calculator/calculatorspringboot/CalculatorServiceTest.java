package pro.calculator.calculatorspringboot;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    @DisplayName("Корректно ли складывает 2 параметра")
    void calculatedSum() {
        int a = 5;
        int b = 7;
        int expected = a + b;

        int actual = calculatorService.calculatedSum(a, b);

        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Выскакивает ли ошибка при отсутствующем параметре при сложении")
    void calculatedSum2() {

        try {
            calculatorService.calculatedSum(7, null);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail();
    }

    @Test
    @DisplayName("Корректно ли вычитает 2 параметра")
    void calculatedSubtraction() {
        int a = 10;
        int b = 7;
        int expected = a - b;

        int actual = calculatorService.calculatedSubtraction(a, b);

        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Выскакивает ли ошибка при отсутствующем параметре при вычитании")
    void calculatedSubtract() {

        try {
            calculatorService.calculatedSubtraction(7, null);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail();
    }

    @Test
    @DisplayName("Корректно ли умножает 2 параметра")
    void calculatedMultiplication() {
        int a = 5;
        int b = 4;
        int expected = a * b;

        int actual = calculatorService.calculatedMultiplication(a, b);

        assertEquals(actual, expected);
    }



    @Test
    @DisplayName("Выскакивает ли ошибка при отсутствующем параметре при умножении")
    void calculatedMultiply() {

        try {
            calculatorService.calculatedMultiplication(7, null);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail();
    }

    @Test
    @DisplayName("Корректно ли выполняется деление 2 параметров")
    void calculatedDivision() {
        int a = 5;
        int b = 4;
        int expected = a / b;

        int actual = calculatorService.calculatedDivision(a, b);

        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Выскакивает ли ошибка при отсутствующем параметре при делении")
    void calculatedDivision2() {

        try {
            calculatorService.calculatedDivision(7, null);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail();
    }

    @Test
    @DisplayName("Выскакивает ли ошибка при делении на 0")
    void calculatedDivision3() {

        try {
            calculatorService.calculatedDivision(7, 0);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail();
    }
}