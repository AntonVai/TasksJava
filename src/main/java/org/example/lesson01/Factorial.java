package org.example.lesson01;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }

    public static int getFactorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
        return result;
    }
}
