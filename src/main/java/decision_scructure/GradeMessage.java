package decision_scructure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch (grade){
            case "A":
                message = "du hast A";
                break;
            case "B":
                message = "Du Hast B";
                break;
            default:
                message = "Error";
                break;
        }
        System.out.println(message);
    }
}
