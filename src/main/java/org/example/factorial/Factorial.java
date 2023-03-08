package org.example.factorial;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
        System.out.println(getFactorialWithRecursion(5));
    }

    public static int getFactorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
        return result;
    }

    public static int getFactorialWithRecursion(int value) {
        if (value <= 1) {
            return value;
        } else {
            return value * getFactorial(value - 1);
        }
    }
}
