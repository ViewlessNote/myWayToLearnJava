package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {

        int gehalt = 14;
        int arbeitsStunde = 40;

        System.out.println("wie viel Stunden hast du diese Woche gearbeitet? ");
        Scanner stunde = new Scanner(System.in);
        int gesamtStunde = stunde.nextInt();

        while (gesamtStunde > arbeitsStunde){
            System.out.println("du darfst nur bis " + arbeitsStunde + " Arbeiten");
            System.out.println("wie viel Stunden hast du diese Woche gearbeitet? ");
            gesamtStunde = stunde.nextInt();
        }
        stunde.close();


        int lohn = gesamtStunde * gehalt;
        System.out.println( "du hast "+ lohn + "$ verdient");
    }
}
