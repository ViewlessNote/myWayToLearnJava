package decision_scructure;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("wie viel Produkt? ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        for(int i=0; i<quantity; i++){
            System.out.println("the cost for the items? ");
            double price = scanner.nextDouble();
            total = total + price;
        }
        scanner.close();

        System.out.println(total);
    }
}
