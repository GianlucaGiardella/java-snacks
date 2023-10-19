package afternoon;

import java.util.Scanner;

/**
 * Continua a chiedere all’utente di inserire un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
 * Se il numero è negativo termina.
 */
public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean negative = false;


        while (!negative) {
            System.out.println("Inserire un numero:");
            int inputNumber = scan.nextInt();
            if (inputNumber < 0){
                System.out.println("Fine");
                break;
            }
            System.out.println(inputNumber % 2 == 0 ? inputNumber : inputNumber + 1);
        }

        scan.close();
    }
}
