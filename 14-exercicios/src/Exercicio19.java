
import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Quantidade de valores digitados: ");
            int x, in = 0, notIn = 0, n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                x = sc.nextInt();

                if (x >= 10 && x <= 20) {
                    in++;
                } else {
                    notIn++;
                }
            }

            System.out.println("Dentro do intervalo: " + in);
            System.out.println("Fora do intervalo: " + notIn);

        }
    }
}
