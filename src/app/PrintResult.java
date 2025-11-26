package app;

import app.utils.BinarySearch;

import java.util.function.Consumer;

public class PrintResult {

    void printArray(int[] arr, Consumer<int[]> method) {
        System.out.println("----- Робота методу з сортування масиву -----");
        System.out.print("Масив до сортування: ");
        for (int x : arr)
            System.out.print(x + " ");

        method.accept(arr);

        System.out.print("\nМасив після сортування: ");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    void printResultBinarySearch(int[] arr, int target){
        System.out.println("----- Робота методу з пошуку числа в відсортованому масиві -----");
        int result = new BinarySearch().findNumber(arr, target);

        if (result == -1){
            System.out.println("Число " + target + " не знайдено в даному масиві");
        }
        else {
            System.out.println("Індекс шуканого числа " + target + " в даному масиві є : "+ result);
        }
    }
}
