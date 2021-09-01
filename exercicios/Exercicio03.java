package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double credito, prestacao, salario;

        System.out.println("qual seu salario? ");
        salario = entrada.nextDouble();

        System.out.println("qual A PRESTAÇÃO ? ");
        prestacao = entrada.nextDouble();

        credito = salario * 0.3;
        

        if (prestacao <= credito) {
            System.out.println("emprestimo liberado");
        } else {
            System.out.println("Valor limite, nao pode liberar o crédito");
        }



        entrada.close();
    }
}
