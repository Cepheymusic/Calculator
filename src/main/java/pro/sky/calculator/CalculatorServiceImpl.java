package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }
    public String plus(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + "+" + num2 + "=" + sum;
    }
    public String minus(int num1, int num2) {
        int difference = num1 - num2;
        return num1 + "-" + num2 + "=" + difference;
    }
    public String multiplication(int num1, int num2) {
        int multiply = num1 * num2;
        return num1 + "*" + num2 + "=" + multiply;
    }
    public String division(int num1, int num2) {
        if (num2 == 0) {
            return "error";
        } else {
            int divide = num1 / num2;
            return num1 + "/" + num2 + "=" + divide;
        }
    }
}
