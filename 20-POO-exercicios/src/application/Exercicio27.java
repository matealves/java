package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {

            Student student = new Student();
            System.out.println("Enter student name: ");
            student.name = sc.nextLine();

            System.out.println("Enter the three grades: ");
            student.grade1 = sc.nextDouble();
            student.grade2 = sc.nextDouble();
            student.grade3 = sc.nextDouble();

            System.out.println("FINAL GRADE = " + String.format("%.2f", student.FinalGrade()));
            System.out.println(student.name + " " + student.Status());

        }
    }
}
