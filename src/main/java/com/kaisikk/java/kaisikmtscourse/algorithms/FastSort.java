package com.kaisikk.java.kaisikmtscourse.algorithms;

import java.util.Arrays;

public class FastSort {

    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};

        System.out.println(Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));

    }


    private static void quickSort(int[] array, int from, int to) {

        if (from < to) {
            int divideIndex = partition(array, from, to);

            quickSort(array, from, divideIndex - 1);

            quickSort(array, divideIndex, to);

        }

    }

    private static int partition(int[] array, int from, int to) {
        int rigthIndex = to;
        int leftIndex = from;


        int pivot = array[from];
        while (leftIndex <= rigthIndex) {

            while (array[leftIndex] < pivot) {
                leftIndex++;
            }

            while (array[rigthIndex] > pivot) {
                rigthIndex--;
            }

            if (leftIndex <= rigthIndex) {
                swap(array, rigthIndex, leftIndex);
                leftIndex++;
                rigthIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }


}
