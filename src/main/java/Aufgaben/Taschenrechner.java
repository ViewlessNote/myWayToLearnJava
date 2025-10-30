package Aufgaben;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rechnen;

        do {
            System.out.println("=== Taschenrechner ===\n" +
                    "   1. Addition (+)\n" +
                    "   2. Subtraktion (-)\n" +
                    "   3. Multiplikation (*)\n" +
                    "   4. Division (/)\n" +
                    "   5. Beenden\n" +
                    "   Wähle eine Option:");
            rechnen = scanner.nextInt();
            scanner.nextLine();
            if(rechnen == 1){
                System.out.println("gebe das erste zahl ein: ");
                int ersteAddition = scanner.nextInt();
                System.out.println("gebe das zweite zahl ein: ");
                int zweiteAddition = scanner.nextInt();
                int ergebnisse = ersteAddition + zweiteAddition;
                System.out.println("dein ergebbbnis ist " + ergebnisse);
            }
        }while (rechnen != 5);
    }
}
