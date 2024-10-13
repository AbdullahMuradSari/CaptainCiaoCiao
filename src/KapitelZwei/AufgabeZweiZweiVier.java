package KapitelZwei;

public class AufgabeZweiZweiVier {
    /**
     * Diese Methode gibt einen SVG Code für einen Kreis aus, bei dem der Radius zufällig bestimmt wird
     */
    public static void circleMainMethod(){
        System.out.println( "<svg height=\"400\" width=\"1000\">\n  <circle cx=\"100\" cy=\"100\" r=\"" + (Math.random() * (20.0-10-0) + 10.0)
                             + "\" />\n</svg>" );
    }
}
