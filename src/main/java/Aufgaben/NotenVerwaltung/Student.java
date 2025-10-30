package Aufgaben.NotenVerwaltung;

public class Student {
    private String name;
    private int[] grades;


    public Student (String name){
        this.name = name;
        this.grades = new int[5];

    }

    public void fillRandomGrades(){
        java.util.Random rnd = new java.util.Random();
        for (int i = 0; i < grades.length; i++){
            grades[i] = rnd.nextInt(6) + 1;
        }
    }
    public double calculateAverage(){
        int sum = 0;
        for (int g : grades){
            sum += g;
        }
        return (double) sum / grades.length;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public int[] getGrades(){
        return grades;
    }

    @Override
    public String toString(){
        return name + " ( O: " + String.format("%.2f", calculateAverage()) + ")";
    }

}
