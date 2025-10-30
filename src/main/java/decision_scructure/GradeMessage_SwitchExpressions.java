package decision_scructure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade){
            case "A", "AA" -> "du hast A";
            case "B" -> "Du Hast B";
            default -> "Error";
        };
        System.out.println(message);
    }
}
