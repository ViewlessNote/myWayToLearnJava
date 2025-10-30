package decision_scructure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("How many sales did you have this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if (sales >= quota) {
            System.out.println("Gratuliere !!!");

        }else{
            int salesShort = quota - sales;
            System.out.println("you were " + salesShort + " close to win");
        }


        scanner.close();
    }
}
