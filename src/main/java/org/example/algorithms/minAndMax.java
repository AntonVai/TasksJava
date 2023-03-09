package org.example.algorithms;

public class minAndMax {
    public static void main(String[] args) {
        int[] array = new int[]{22, 66, 63, 51, 101, 23, 77, 2, 33, 12, 98};
        System.out.println(min(array));
        System.out.println("------------------");
        System.out.println(max(array));
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

}
