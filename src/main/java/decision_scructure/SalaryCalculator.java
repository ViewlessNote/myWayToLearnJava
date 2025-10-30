package decision_scructure;


import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        double salary = 1000;
        double bonus = 250;
        int quota = 10;

        System.out.println("how many sales did you have this week? ");
        Scanner scanner = new Scanner(System.in);

        int sales = scanner.nextInt();

        if(sales > quota ){
            salary = salary + bonus;
        }
        System.out.println("Salary is: " + salary);
    }

}
