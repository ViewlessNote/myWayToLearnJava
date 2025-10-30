package Aufgaben;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {



        System.out.println("wie viel ziffer soll das sein: ");
        Scanner scanner = new Scanner(System.in);
        int lange = scanner.nextInt();
        do {
            if (lange <= 12){
                System.out.println("die lange muss mehr als 12 sein");
            } else if (lange >= 20){
                System.out.println("die lange darf nicht mehr als 12 sein");
            }



        }while(lange != 0);
        for (int i = 0; i < lange; i++){
            int ziffer = (int)(Math.random() * 10);
            System.out.print(ziffer);
        }

    }
}
