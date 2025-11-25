package app;

import java.util.function.Consumer;

public class PrintResult {

    void printArray(int[] arr, Consumer<int[]> method) {
        for (int x : arr)
            System.out.print(x + " ");

        System.out.println();
        method.accept(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}
