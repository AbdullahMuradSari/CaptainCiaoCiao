package KapitelEins;

/**
 * @author Abdullah Murad Sari
 */
public class KapitelEinsMain {
    public static void main(String[] args) {
        /**
         * Aufgabe 1.1.1
         */
        AufgabeEinsEinsEins.captainAusgabe();
        
        /**
         * Aufgabe 1.2.1
         * Fehlermeldungen der IDE kennenlernen
         * 
         * 1. Änderung des Dateinamen
         *      Es taucht kein Fehler auf, weil die
         *      IDE auch den Namen in der Klasse ändert.
         * 
         * 2. Änderung der Groß-/Kleinschreibung
         * 
         *             ↓
         *      public Class Application {
         *          public static void main( String[] args ) {
         *              System.out.println( "Aye Captain!" );
         *          }
         *      }
         *      
         *      Eine Fehlermeldung weist daraufhin, dass Class klein geschrieben werden muss.
         *      Die Groß-/Kleinschreibung ist bei Schlüsselwörtern wichtig, da vieles sich durch
         *      die Änderung der Groß-/Kleinschreibung ändert.
         *      Zum Beispiel:   double -> datentyp
         *                      Double -> Wrapperklasse
         * 
         * 3. Änderung der Main-Methode
         * 
         *                         ↓
         *      public static void Main(String[] args) {
         *      }
         * 
         *                      ODER
         *                      
         *                         {  ↓  }
         *      public static void letsgo(String[] args) {
         *      }
         * 
         *      Bei beiden Änderungen entsteht kein Problem, da sie immernoch
         *      als normale statische Methoden anerkannt werden. Sie verlieren
         *      lediglich ihre Funktion als Main-Methode und werden von der IDE nicht ausgeführt
         * 
         * 4. Das Ausgeben von Umlauten und Symbolen
         * 
         *      System.out.print("ä ö ß ♥");
         * 
         *      Ummlaute und Symbole werden ohne Probleme ausgegeben.
         * 
         * 5. Das Auslassen von Leerzeichen und Zeilenumbrüchen
         * 
         *      public class Application{public static void main(String[
         *      ]args){System.out.println("Aye Captain!");}}
         * 
         *      Es gibt keine Probleme mit diesem Code, da das Nutzen von Leerzeichen
         *      und Zeilenumbrüchen an bestimmten Positionen nicht wesentlich ist.
         *      Es dient lediglich zur Überschaubarkeit der Programmierer.
         */
    }
}
