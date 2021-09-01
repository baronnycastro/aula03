package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota, nota1, nota2;
         
        
        System.out.println("Insira a nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Insira a nota 2: ");
        nota2 = entrada.nextDouble();

        nota1 = nota1 * 0.4;
        nota2 = nota2 * 0.6;
        nota = nota1 + nota2;

        
        if (nota >= 6.0) {
            System.out.println("Aprovad0 com media: " + nota);
        } else {
            System.out.println("reprovado " + nota);
        }


        entrada.close();
    }
}
