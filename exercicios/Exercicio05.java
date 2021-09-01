package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("Insira seu salário: ");
        salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("isento");

        } else {
            if (salario <= 1200) {
                salario = salario - (salario * 0.2);
                System.out.println("salario com desconto de 20%: " + salario);

            } else {
                if (salario <= 2000) {
                    System.out.println("25%");
                } else {
                    System.out.println("30%");
                }
            }
        }

        entrada.close();
    }
}
