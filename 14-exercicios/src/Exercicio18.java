
import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int x = sc.nextInt();

            for (int i = 1; i <= x; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

    }
}
