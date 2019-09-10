package calculator;


public class Calculator {
    public static double calculate(int number1, int number2, Operation operation) {
        return operation.operate(number1, number2);
    }

    static Operation multiply = (a, b) -> a * b;
    static Operation adding = (x, y) -> x + y;
    static Operation division = (c, t) -> c / t;

    public static void main(String[] args) {
        System.out.println(Calculator.calculate(5, 7, (a, b) -> a + b));
        System.out.println(Calculator.calculate(63, 56, (x, y) -> x / y));
        System.out.println(Calculator.calculate(80, 90, adding));
        System.out.println(Calculator.calculate(80, 2, division));
    }
}

