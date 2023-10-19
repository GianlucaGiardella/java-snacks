package morning;

import java.util.Scanner;

/**
 * L’utente inserisce due parole in successione. Il software stampa prima la parola più corta, poi la parola più lunga.
 */
public class Snack2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserire un parola:");
        String inputWord1 = scan.nextLine();

        System.out.println("Inserire un'altra parola:");
        String inputWord2 = scan.nextLine();

        System.out.println(inputWord1.length() < inputWord2.length() ? inputWord1 + " " + inputWord2 : inputWord2 + " " + inputWord1);

        scan.close();
    }
}
