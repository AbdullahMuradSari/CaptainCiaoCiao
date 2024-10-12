package KapitelZwei;

/**
 * @author Abdullah Murad Sari
 */
public class AufgabeZweiZweiEins {
    /**
     * Diese Methode gibt einen SVG Code für einen Kreis mit bestimmten Angaben aus
     * 
     * @param x Der x-Wert für die Postion des Kreismittelpunkts
     * @param y Der y-Wert für die Postion des Kreismittelpunkts
     * @param r Der Radius des Kreis
     */
    public static void circleMainMethod(int x, int y, double r){
        System.out.println( "<svg height=\"400\" width=\"1000\">\n  <circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + r + "\" />\n</svg>" );
    }
}
