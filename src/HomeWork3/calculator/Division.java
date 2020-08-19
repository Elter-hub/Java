package HomeWork3.calculator;

public class Division implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return b != 0 ? a / b : Integer.MAX_VALUE;
    }
}
