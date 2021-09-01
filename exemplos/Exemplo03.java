package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2;

        System.out.println("Insira o primeiro numero: ");
        numero1 = entrada.nextDouble();
        System.out.println("Insira o segundo numero: ");
        numero2 = entrada.nextDouble();

        if (numero1 < numero2) {
            System.out.println("Ordem não crescente:" + numero2 + " e " + numero1);
        }
        if (numero1 > numero2) {
            System.out.println("Ordem não crescente:" + numero1 + " e " + numero2);
        } 


        entrada.close();
    }
}
