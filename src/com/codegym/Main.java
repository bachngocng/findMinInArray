package com.codegym;

public class Main {

    public static void main(String[] args) {
        int[] arr = {6, 15, 9, 2, 3, 4, 7};
        int index = minValue(arr);
        System.out.println("GTNN trong mảng là: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
