
import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite o código para abastecer:");

            int alcool = 0;
            int gasolina = 0;
            int diesel = 0;

            int type = sc.nextInt();

            while (type != 4) {
                switch (type) {
                    case 1 ->
                        alcool++;
                    case 2 ->
                        gasolina++;
                    case 3 ->
                        diesel++;
                    default ->
                        System.out.println("Código inválido. Digite novamente:");
                }
                type = sc.nextInt();
            }

            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel: " + diesel);
        }

    }
}
