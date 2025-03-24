
import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Exibir divisores de: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {

                int primeiro = i;
                int segundo = i * i;
                int terceiro = i * i * i;
                System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
            }

        }
    }
}
