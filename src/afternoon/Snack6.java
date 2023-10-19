package afternoon;

import java.util.Random;

/**
 * Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)
 */
public class Snack6 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int totalSeconds = randomGenerator.nextInt(1, 1000000);
        System.out.println("Secondi totali: " + totalSeconds);

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println("Formato (hh:mm::ss): " + hours + ":" + minutes + ":" + seconds);
    }
}
