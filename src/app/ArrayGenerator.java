package app;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayGenerator {

    public int[] generateArray(int size, int bound){

        Random random = new Random();

        return IntStream.range(0,size)
                .map(i -> random.nextInt(bound))
                .toArray();
    }

}
