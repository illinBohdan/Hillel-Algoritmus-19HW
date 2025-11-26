package app.utils;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayGenerator {

    public int[] generateArray() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть бажаний розмір масиву розмір -> ");
        int size;
        do {
            size = scanner.nextInt();
            if (size < 0) {
                System.out.println("Введіть число більше за 0");
            }
        } while (size < 0);


        System.out.print("Введіть бажаний діапазон чисел від 0 до  -> ");
        int bound;
        do {
            bound = scanner.nextInt();
            if (bound < 0) {
                System.out.println("Введіть число більше за 0");
            }
        } while (bound < 0);

        int finalBound = bound;
        return IntStream.range(0, size)
                .map(i -> random.nextInt(finalBound + 1))
                .toArray();
    }

}
