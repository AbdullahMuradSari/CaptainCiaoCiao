package KapitelZwei;

/**
 * @author Abdullah Murad Sari
 */
public class KapitelZweiMain {
    public static void main(String[] args) {
        /**
         * Aufgabe 2.1
         */
        System.out.println("Aufgabe 2.1:");
        AufgabeZweiEins.circleMainMethod();
        System.out.println();

        /**
         * Aufgabe 2.2.1
         */
        System.out.println("Aufgabe 2.2.1:");
        int x = 100;
        int y = 110;
        double r = 20.5;
        AufgabeZweiZweiEins.circleMainMethod(x, y, r);

        System.out.println();

        x = 10;
        y = 10;
        r = 2.686;
        AufgabeZweiZweiEins.circleMainMethod(x, y, r);
        System.out.println();

        /**
         * Aufgabe 2.2.4
         * 
         *      Der Wertebereich vom Ergebnis der Methode random()
         *      liegt bei 0.0 - 1.0 wobei 0.0 inklusive ist und 1.0 nicht.
         */
        AufgabeZweiZweiVier.circleMainMethod();
    }
}
