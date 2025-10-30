package basics;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        System.out.println("How many hours did you work per week?");
        Scanner week = new Scanner(System.in);
        int hours = week.nextInt();

        System.out.println("What is your hourly pay?");
        double rate = week.nextDouble();
        //scanner.close();

        double payRate = hours * rate;

        System.out.println("Gross pay: " + payRate);

    }
}
