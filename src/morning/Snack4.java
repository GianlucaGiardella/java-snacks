package morning;

import java.util.Scanner;

/**
 * Chiedi per 6 volte all’utente di inserire un numero, se è dispari mostrare questa informazione a video
 */
public class Snack4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println(i + 1 + " - Inserire un numero:");
            int inputNum = scan.nextInt();
            if (inputNum % 2 == 1) {
                System.out.println(inputNum + " è dispari");
            }
            System.out.println();
        }

        scan.close();
    }
}
