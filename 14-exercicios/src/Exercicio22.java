
import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Fatorial do número: ");
            int n = sc.nextInt();

            int fat = 1;
            for (int i = 1; i <= n; i++) {
                fat = fat * i;
            }

            System.out.println(fat);
        }
    }
}
