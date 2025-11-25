package app.utils;

public class MergeSort {

   public void mergeSorting(int[] array, int leftIndex, int rightIndex) {

        if (leftIndex < rightIndex) {

            int middle = (leftIndex + rightIndex) / 2;

            mergeSorting(array, leftIndex, middle);

            mergeSorting(array, middle + 1, rightIndex);

            merge(array, leftIndex, middle, rightIndex);
        }
    }


    void merge(int[] array, int left, int middle, int right) {

        int n1 = middle - left + 1;
        int n2 = right - middle;


        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = array[middle + 1 + j];

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

}
