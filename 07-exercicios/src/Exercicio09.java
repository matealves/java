
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();

            if (a % b == 0 || b % a == 0) {
                System.out.println("Multiplos");
            } else {
                System.out.println("Não Multiplos");
            }
        }
    }
}
