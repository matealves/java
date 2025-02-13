
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n;
            n = sc.nextInt();

            if (n < 0) {
                System.out.println("NEGATIVO");
            } else {
                System.out.println("NÃO NEGATIVO");
            }
        }
    }
}
