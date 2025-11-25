package app;

import app.utils.MergeSort;

public class ArrayUtils {


    public void mergeSort(int[] array) {

        new MergeSort().mergeSorting(array, 0, array.length-1);
    }

    public void binarySearch(int[] array, int target) {

    }
}
