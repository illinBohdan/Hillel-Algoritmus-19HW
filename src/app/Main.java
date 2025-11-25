package app;

import app.utils.MergeSort;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] arr = new ArrayGenerator().generateArray(11,100);

        new PrintResult().printArray(arr, new ArrayUtils()::mergeSort);
    }
}
