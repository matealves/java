
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite a senha: ");
            int password = sc.nextInt();

            while (password != 2002) {

                System.out.println("Senha inválida.");
                password = sc.nextInt();
            }

            System.out.println("Acesso permitido.");

        }
    }
}
