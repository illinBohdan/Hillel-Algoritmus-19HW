package app.utils;


public class BinarySearch {
    public int findNumber(int[] array, int target) {

        new MergeSort().mergeSorting(array, 0, array.length - 1);

        System.out.print("Масив в якому шукаємо число " + target + ": ");
        for (int x : array) System.out.print(x + " ");

        System.out.println();

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

}
