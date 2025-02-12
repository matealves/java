
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {

            int cod1, cod2, qtd1, qtd2;
            double price1, price2, total;

            cod1 = sc.nextInt();
            qtd1 = sc.nextInt();
            price1 = sc.nextDouble();

            cod2 = sc.nextInt();
            qtd2 = sc.nextInt();
            price2 = sc.nextDouble();

            total = qtd1 * price1 + qtd2 * price2;

            System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        }
    }
}
