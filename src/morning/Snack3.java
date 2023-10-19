package morning;

import java.util.Scanner;

/**
 * Il software deve chiedere per 10 volte all’utente di inserire un numero. Il programma stampa la somma di tutti i numeri inseriti.
 */
public class Snack3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - Inserire un numero:");
            sum += Integer.parseInt(scan.nextLine());
            System.out.println(i < 9 ? "Somma attuale: " + sum : "Totale: " + sum);
            System.out.println();
        }

        scan.close();
    }
}
