package afternoon;

import java.util.Arrays;
import java.util.Random;

/**
 * Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
 */
public class Snack3 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int length = 10;
        int[] arrayNumbers = new int[length];

        int sum = 0;

        for (int i = 0; i < length; i++) {
            arrayNumbers[i] = randomGenerator.nextInt(0, 21);
            if (i % 2 == 0) {
                sum += arrayNumbers[i];
            }
        }

        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println("Somma: " + sum);
    }
}
