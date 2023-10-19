package afternoon;

import java.util.Random;

/**
 * Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
 */
public class Snack2 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        String[] firstName = {"Leonardo", "Raffaello", "Donatello", "Michelangelo"};
        String[] lastNames = {"Da Vinci", "Sanzio", "Bardi", "Buonarotti"};

        for (int i = 0; i < 8; i++) {
            System.out.println(firstName[randomGenerator.nextInt(0, firstName.length - 1)] + " " + lastNames[randomGenerator.nextInt(0, lastNames.length - 1)]);
        }
    }
}
