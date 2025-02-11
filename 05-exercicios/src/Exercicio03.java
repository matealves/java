
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int A, B, C, D, diferenca;

            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            D = sc.nextInt();

            diferenca = A * B - C * D;

            System.out.println("DIFERENCA = " + diferenca);
        }
    }
}
