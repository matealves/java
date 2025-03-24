
import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Quantidade divisões: ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                if (y == 0) {
                    System.out.println("divisao impossivel");
                } else {
                    double div = (double) x / y;
                    System.out.printf("%.1f%n", div);
                }
            }
        }
    }
}
