
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            double n = sc.nextDouble(), pi, raio, area;

            pi = 3.14159; // Math.PI
            raio = Math.pow(n, 2.0);
            area = pi * raio;

            System.out.printf("A=%.4f%n", area);
        }
    }
}
