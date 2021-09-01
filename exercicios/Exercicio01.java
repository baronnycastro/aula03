package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Insira um número inteiro");
        numero = entrada.nextInt();

        if (numero > 20) {
            numero = numero / 2;
            System.out.println(" Metade do número é: " + numero);
        }

        entrada.close();
    }
}
