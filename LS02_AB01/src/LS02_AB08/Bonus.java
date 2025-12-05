package LS02_AB08;

import java.util.Scanner;

// Aufgabe 8.3 Bonusberechnung
// Ein Unternehmen zahlt seinen Mitarbeitern einen Jahresbonus, der sich
// nach dem Jahresumsatz und der Dauer der Betriebszugehörigkeit richtet.
// Schreiben Sie ein Programm, das den Jahresbonus berechnet.
// Die Berechnung erfolgt nach folgenden Regeln:
// - Liegt der Jahresumsatz unter 150.000 Euro und die Betriebszugehörigkeit
//   unter 5 Jahren, beträgt der Bonus 2 % des Jahresumsatzes.
// - Liegt der Jahresumsatz unter 150.000 Euro und die Betriebszugehörigkeit
//   mindestens 5 Jahre, beträgt der Bonus 2,5 % des Jahresumsatzes.
// - Liegt der Jahresumsatz mindestens 150.000 Euro und die Betriebszugehörigkeit
//   unter 5 Jahren, beträgt der Bonus 3,5 % des Jahresumsatzes.
// - Liegt der Jahresumsatz mindestens 150.000 Euro und die Betriebszugehörigkeit
//   mindestens 5 Jahre, beträgt der Bonus 4 % des Jahresumsatz

public class Bonus {
        private double jahresUmsatz;
        private double endBonus;
        private double dauerGb;
        private double endBetrag;

        public Bonus(double jahresUmsatz, double dauerGb){
            this.jahresUmsatz = jahresUmsatz;

            this.dauerGb = dauerGb;
        }

        public void rechnen(){
            if (jahresUmsatz < 150000 && dauerGb < 5){
                endBonus = 2;
            } else if (jahresUmsatz < 150000 && dauerGb >= 5) {
                endBonus = 2.5;
            } else if (jahresUmsatz >= 150000 && dauerGb >= 5){
                endBonus = 4;
            } else if (jahresUmsatz >= 150000 && dauerGb < 5){
                endBonus = 3.5;
            }
            endBetrag = jahresUmsatz * endBonus / 100;
        }
        public void ausgabe(){
            System.out.println("Bonus" + endBonus);
            System.out.println("Jahresbonus: " + endBetrag);
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("umsatz ");
        double um = scanner.nextDouble();


        System.out.println("dauer ");
        double dauer = scanner.nextDouble();

        scanner.close();
        Bonus eins = new Bonus(um, dauer);
        eins.rechnen();
        eins.ausgabe();
    }
    }
