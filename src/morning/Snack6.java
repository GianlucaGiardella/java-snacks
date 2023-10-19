package morning;

import java.util.Arrays;
import java.util.Random;

/**
 * Genera un array di 10 numeri casuali e crea una stringa  che lo rappresenta nella forma [valore1, valore2, …, valoreN] senza usare il metodo Arrays.toString()
 */
public class Snack6 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int length = 3;
        int[] arrayNumbers = new int[length];

        if (length > 0) {

            for (int i = 0; i < length; i++) {
                arrayNumbers[i] = randomGenerator.nextInt(1, 21);

                if (i == 0) {
                    System.out.print("[");
                }

                if (i < length - 1) {
                    System.out.print(arrayNumbers[i] + ", ");
                } else {
                    System.out.print(arrayNumbers[i] + "]");
                }
            }
        } else {
            System.out.print("[]");
        }

        System.out.println();
        System.out.println(Arrays.toString(arrayNumbers));
    }
}
