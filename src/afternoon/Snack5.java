package afternoon;

/**
 * Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
 * Possibile usare solo :
 * cicli
 * chartAt
 * if / switch
 */
public class Snack5 {
    public static void main(String[] args) {
        String stringNumber = "10";

        int intNumber = 0;

        for (int i = 0; i < stringNumber.length(); i++) {
            intNumber *= 10;
            intNumber += stringNumber.charAt(i) - '0';
        }

        System.out.print("Numero in stringa: ");
        System.out.println(stringNumber + 0);

        System.out.print("Numero in intero: ");
        System.out.println(intNumber + 0);
    }
}
