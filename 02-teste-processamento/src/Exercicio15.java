public class Exercicio15 {
    public static void main(String[] args) throws Exception {
        int x, y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println("Área = " + area);

        int a, c;
        double resultado;

        a = 5;
        c = 2;

        // casting
        resultado = (double) a / c;

        System.out.println(resultado);
    }
}
