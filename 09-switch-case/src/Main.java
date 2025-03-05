
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            String dia = switch (x) {
                case 1 ->
                    "Domingo";
                case 2 ->
                    "Segunda-feira";
                case 3 ->
                    "Terça-feira";
                case 4 ->
                    "Quarta-feira";
                case 5 ->
                    "Quinta-feira";
                case 6 ->
                    "Sexta-feira";
                case 7 ->
                    "Sábado";
                default ->
                    "Valor inválido.";
            };
            // String dia;

            // switch (x) {
            //     case 1:
            //         dia = "Domingo";
            //         break;
            //     case 2:
            //         dia = "Segunda-feira";
            //         break;
            //     case 3:
            //         dia = "Terça-feira";
            //         break;
            //     case 4:
            //         dia = "Quarta-feira";
            //         break;
            //     case 5:
            //         dia = "Quinta-feira";
            //         break;
            //     case 6:
            //         dia = "Sexta-feira";
            //         break;
            //     case 7:
            //         dia = "Sábado";
            //         break;
            //     default:
            //         dia = "Valor inválido.";
            // }
            System.out.println(dia);

        }
    }
}
