package morning;

import java.util.Scanner;

/**
 * Stampa il cubo dei primi N numeri, dove N è un numero indicato dall’utente.
 */
public class Snack5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserire un numero:");
        int inputNumber = scan.nextInt();

        for (int i = 1; i <= inputNumber; i++) {
            System.out.println("Cubo di " + i + " = " + (i * i * i));
        }

        scan.close();
    }
}
