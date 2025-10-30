package Aufgaben.NotenVerwaltung;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1️⃣ Liste mit ein paar Beispielnamen, aus denen zufällig gewählt wird
        String[] firstNames = {"Ali", "Sara", "Omar", "Lina", "Karwan", "Diyar", "Mira", "Yusuf", "Nora", "Zana", "Liam", "Aria", "Hana", "Amin", "Selin"};
        String[] lastNames  = {"Aziz", "Mohammed", "Ahmad", "Kaya", "Demir", "Ali", "Suleiman", "Khalid", "Baran", "Hasan"};

        Random rnd = new Random();
        Student[] students = new Student[100];

        // 2️⃣ 100 Studenten erzeugen
        for (int i = 0; i < students.length; i++) {
            String randomName = firstNames[rnd.nextInt(firstNames.length)] + " " + lastNames[rnd.nextInt(lastNames.length)];
            students[i] = new Student(randomName);
            students[i].fillRandomGrades();
        }

        // 3️⃣ Alle ausgeben
        for (Student s : students) {
            printStudent(s);
        }

        // 4️⃣ Besten Durchschnitt ermitteln
        bestAverage(students);
    }

    private static void printStudent(Student s){
        System.out.print(s.getName() + " -> Noten: ");
        int[] arr = s.getGrades();

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println(" | Durchschnitt: " + String.format("%.2f", s.calculateAverage()));
    }

    private static void bestAverage(Student... students) {
        Student best = students[0];

        for (Student st : students) {
            if (st.calculateAverage() < best.calculateAverage()) {
                best = st;
            }
        }

        double bestAvg = best.calculateAverage();
        System.out.print("Die besten Schüler sind: ");

        boolean firstPrinted = false;
        for (Student st : students) {
            if (Math.abs(st.calculateAverage() - bestAvg) < 0.001) {
                if (firstPrinted) System.out.print(", ");
                System.out.print(st.getName());
                firstPrinted = true;
            }
        }

        System.out.println(" (Ø: " + String.format("%.2f", bestAvg) + ")");
    }
}
