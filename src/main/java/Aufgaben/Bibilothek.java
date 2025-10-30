package Aufgaben;

import java.util.Scanner;

public class Bibilothek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n=== Bibilothek ===");
            System.out.println("1. Buch ausleihe");
            System.out.println("2. Buch zuruckgeben");
            System.out.println("3. Ubersicht anzeigen");
            System.out.println("4. Beenden");
            System.out.println("wahle eine Option: ");

            option = scanner.nextInt();
            scanner.nextLine(); // Wichtig! Verbraucht die Enter-Taste

            if (option == 1) {
                // Buch ausleihen
                System.out.println("Buchtitel eingeben: ");
                String titel = scanner.nextLine();

                System.out.println("Anzahl der Tage: ");
                int tage = scanner.nextInt();

                // Gebühr berechnen
                double gebuehr;
                if (tage <= 7) {
                    gebuehr = 5;
                } else if (tage <= 14) {
                    gebuehr = 8;
                } else if (tage <= 30) {
                    gebuehr = 12;
                } else {
                    gebuehr = 15;
                }

                System.out.println("Buch: " + titel);
                System.out.println("Die Leihgebuehr betraegt: " + gebuehr + " Euro");

            } else if (option == 2) {
                // Buch zurückgeben
                System.out.println("Buchtitel eingeben: ");
                String titel = scanner.nextLine();

                System.out.println("Hat das Buch Schäden? (ja/nein): ");
                String antwort = scanner.nextLine();

                double schadensgebuehr = 0;

                // Hier dein if-else Code
                if (antwort.equals("Ja")){
                    schadensgebuehr = 10;
                };

                System.out.println("Rückgabe erfolgreich!");
                // ... Rest ausgeben
                System.out.println(schadensgebuehr);

            } else if (option == 3) {
                System.out.println("Wilkommen bei Ubersicht anzeigen");

            } else if (option == 4) {
                System.out.println("Good bye!");

            } else {
                System.out.println("Fehler: Ungueltige Option!");
            }

        } while (option != 4);

        scanner.close();
    }
}