
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n;
            n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("IMPAR");
            }
        }
    }
}
