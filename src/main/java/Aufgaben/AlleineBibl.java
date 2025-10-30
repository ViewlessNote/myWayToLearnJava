package Aufgaben;

import java.util.Scanner;

public class AlleineBibl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("wahle 1,2,3,4");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1){
                System.out.println("hier ist 1");
            } else if (option == 2) {
                System.out.println("hier ist 2");
            } else if (option == 3) {
                System.out.println("hier ist 3");
            } else if (option == 4){
                System.out.println("beendet ");
            } else{
                System.out.println("ungutlige nummer");
            }
        }while(option != 4);
    }
}
