package morning;

import java.util.Scanner;

/**
 * L’utente inserisce due numeri in successione. Il software stampa il maggiore.
 */
public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserire un numero: ");
        int inputNumber1 = scan.nextInt();

        System.out.println("Inserire un altro numero: ");
        int inputNumber2 = scan.nextInt();

        System.out.println("Numero maggiore: " + (Math.max(inputNumber1, inputNumber2)));

        scan.close();
    }
}
