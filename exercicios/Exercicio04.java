package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senha;
        boolean aceita;

        System.out.println("Insira a senha");
        senha = entrada.nextLine();

        aceita = senha.equals("R10p5");
        
        if (aceita == true) {
            System.out.println("senha correta");
        } else {
            System.out.println("senha incorreta");
        }



        entrada.close();
    }
}
