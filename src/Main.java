import java.util.Scanner;
import java.io.IOException;



public class Main {


    public static void main(String[] args) {
        //Initialisierung der Werte die eingegeben werden müssen
        double Param1;
        double Param2;
        char operator;
        //Initialisierung für ergebnis-Variable
        double ergebnis = 0;
        //Erstellung eines Scanners, der mit System.in aufgerufen wird und den Benutzer eine Eingabe ermöglicht
        Scanner scanner = new Scanner(System.in);
        //Aufforderungen zur Eingabe
        System.out.println("Willkommen zum Taschenrechner! Bitte geben Sie den Wert der ersten Zahl ein!");
        Param1 = scanner.nextInt();
        System.out.println("Sehr gut, der erste Wert beträgt: " + Param1);
        System.out.println("Geben Sie nun den zweiten ein!");
        Param2 = scanner.nextInt();
        System.out.println("Sehr gut, der zweite Wert beträgt: " + Param2);
        System.out.println("Nun geben sie die mathematische Operation ein.");
        System.out.println("Addition:   +\nSubtraktion: -\nMultiplikation:  *\nDivision:    /\nExponierung: ^");
        operator = scanner.next().charAt(0);

        if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '^') {

            switch (operator) {
                case '+':
                    meMath addieren = new meMath();
                    ergebnis = addieren.plus(Param1, Param2);

                    break;
                case '-':
                    meMath subtrahieren = new meMath();
                    ergebnis = subtrahieren.minus(Param1, Param2);
                    break;
                case '*':
                    meMath multiplizieren = new meMath();
                    ergebnis = multiplizieren.mal(Param1, Param2);
                    break;
                case '/':
                    meMath dividieren = new meMath();
                    ergebnis = dividieren.geteilt(Param1, Param2);
                    break;
                case '^':
                    ergebnis = Math.pow(Param1, Param2);
                default:
                    System.out.println("Test me!");
                    break;
            }
            System.out.println("Die gewünschte Operation lautet: " + operator);
            System.out.println("Das Ergebnis von " + Param1 + " " + operator + " " + Param2 + " lautet: " + ergebnis);

        } else{
            System.out.println("Ungueltiger Operator! Ihre Eingabe war: " + operator);
        }





    }
}