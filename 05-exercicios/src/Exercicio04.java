
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {

            int idEmployee, hoursWorked;
            double hourlySalary, salary;

            idEmployee = sc.nextInt();
            hoursWorked = sc.nextInt();
            hourlySalary = sc.nextDouble();

            salary = hoursWorked * hourlySalary;

            System.out.println("NUMBER = " + idEmployee);
            System.out.printf("SALARY = U$ %.2f%n", salary);
        }
    }
}
