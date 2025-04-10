package application;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {

            Employee employee = new Employee();
            System.out.println("Enter employee data:");
            System.out.print("Name: ");
            employee.name = sc.nextLine();

            System.out.print("Gross salary: ");
            employee.grossSalary = sc.nextDouble();

            System.out.print("Tax: ");
            employee.tax = sc.nextDouble();

            System.out.println();
            System.out.println("Employee: " + employee);

            System.out.println();
            System.out.print("Which percentage to increase salary? ");
            double percentage = sc.nextDouble();

            employee.IncreaseSalary(percentage);
            System.out.println();
            System.out.println("Updated data: " + employee);

        }
    }
}
