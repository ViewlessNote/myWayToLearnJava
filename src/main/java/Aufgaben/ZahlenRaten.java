package Aufgaben;

import java.util.Scanner;

public class ZahlenRaten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zufallszahl = (int)(Math.random() * 100) + 1;
        boolean gewonnen = false;
        for(int i = 0; i <= 9; i++){
            System.out.print("Versuch " + i + ": ");
            int geraten = scanner.nextInt();
            if (geraten > zufallszahl){
                System.out.println("dein zahl ist grosser");
            } else if (geraten < zufallszahl){
                System.out.println("dein zahl ist kleiner");
            } else{
                gewonnen = true;
                System.out.println("gluckwunsch");
                break;
            }

        }

        if (gewonnen != true) {
            System.out.println("leider verloren");
        }
    }
}
