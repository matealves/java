
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);

        // O Scanner será fechado automaticamente ao sair do bloco try
        try (Scanner sc = new Scanner(System.in)) {
            int x;
            String s1, s2, s3;

            // s1 = sc.next(); // String
            x = sc.nextInt();
            sc.nextLine(); // Consumir quebra de linha pendente
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            s3 = sc.nextLine();

            System.out.println("DADOS DIGITADOS: ");
            System.out.println(x);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
        }
        // sc.close();
    }
}
