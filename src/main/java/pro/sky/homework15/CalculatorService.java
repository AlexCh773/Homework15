package pro.sky.homework15;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public static String greeting() {
        return "Добро пожаловать в калькулятор!";
    }

    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public Double division(Double num1, Double num2) {
        return num1 / num2;
    }

    public boolean checkParameters(Object param1, Object param2) {
        return (param1 != null && param2 != null);
    }
}
