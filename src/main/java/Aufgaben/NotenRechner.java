package Aufgaben;

import java.util.Scanner;

public class NotenRechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Wie viele Noten möchtest du eingeben?");
        int anzahl = scanner.nextInt();
        
        double summe = 0;  // Hier sammeln wir alle Noten
        
        // For-Schleife um Noten einzulesen
        for(int i = 1; i <= anzahl; i++) {
            System.out.println("Note " + i + ": ");
            double note = scanner.nextDouble();
            summe = summe + note;  // Addiere die Note zur Summe
        }
        
        // Durchschnitt berechnen
        double durchschnitt = summe / anzahl;
        
        System.out.println("Durchschnitt: " + durchschnitt);
        
        scanner.close();
    }
}
