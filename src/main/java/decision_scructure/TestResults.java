package decision_scructure;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        char grade;
        if (score < 60) {
            grade = '5';
        } else if (score < 70) {
            grade = '4';
        } else if (score < 80) {
            grade = '3';
        } else if (score < 90) {
            grade = '2';
        }
        else {
            grade = '1';
        }
        System.out.println(grade);

    }
}
