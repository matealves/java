
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int x = sc.nextInt();
            int soma = 0;

            while (x != 0) {
                soma += x;
                x = sc.nextInt();
            }

            System.out.println("A soma dos valores é: " +  soma);

        }
    }
}
