
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Quantos números você vai somar?");
            int n = sc.nextInt();
            int soma = 0;

            for (int i = 0; i < n; i++) {
                System.out.println(i + 1 + "º número: ");
                int x = sc.nextInt();
                soma = soma + x;
            }
            System.out.println("A soma dos valores é: "+  soma);
        }
    }
}
