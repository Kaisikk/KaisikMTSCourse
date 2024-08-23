package com.kaisikk.java.kaisikmtscourse.algorithms;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {

        // сначала ищется минимальный элемент, затем он меняется местами с первым элементом
        // и по такому же принципу до конца массива
        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};

        System.out.println(Arrays.toString(array));

        for (int step = 0; step < array.length; step++) {
            int index = min(array, step);
            int tmp = array[step];
            array[step] = array[index];
            array[index] = tmp;
        }

        System.out.println(Arrays.toString(array));

    }

    private static int min(int[] array, int start) {
        int minIndex = start;
        int minValue = array[start];

        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}
