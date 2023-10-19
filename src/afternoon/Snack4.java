package afternoon;

import java.util.Scanner;

/**
 * Data in input una stringa verificare se è palindroma
 */
public class Snack4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una parola:");
        String inputString = scan.nextLine();

        boolean palindrome = true;

        for (int i = 0; i < inputString.length() - 1; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }

        System.out.println("La parola " + (palindrome ? "è palindroma" : "non è palindroma"));

        scan.close();
    }
}
