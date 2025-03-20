
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int horaInicial, horaFinal, duracao;

            horaInicial = sc.nextInt();
            horaFinal = sc.nextInt();

            if (horaInicial < horaFinal) {
                duracao = horaFinal - horaInicial;
            } else {
                duracao = 24 - horaInicial + horaFinal;
            }

            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
    }
}
