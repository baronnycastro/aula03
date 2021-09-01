package exemplos;

public class Exemplo06 {
    public static void main(String[] args) {
        int a, b;

        a = 10;
        b = 10;

        System.out.println((a < 11) && (b > 0)); // T && T = T
        System.out.println((a > 11) && (b > 0)); // F && T = F
        System.out.println((a > 11) || (b > 0)); // F || T = V
        System.out.println((a > 11) || (b < 0)); // F || F = F
    }
}
