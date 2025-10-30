package decision_scructure;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do{
            System.out.println("enter the first number");
            double num1 = scanner.nextDouble();
            System.out.println("enter the secound number");
            double num2 = scanner.nextDouble();

            System.out.println("sum" + (num1 + num2));
            again = scanner.nextBoolean();
        }while (again);
    }
}
