package app;

import app.utils.ArrayGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = new ArrayGenerator().generateArray();

        new PrintResult().printArray(arr, new ArrayUtils()::mergeSort);



        int[] arrayForSearch = new ArrayGenerator().generateArray();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число яке б ви хотіли знайти в даному масиві -> ");
        int target = scanner.nextInt();
        new ArrayUtils().binarySearch(arrayForSearch, target);


    }
}
