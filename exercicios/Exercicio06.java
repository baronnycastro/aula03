package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;
        System.out.println("Insira os lados do triangulo: ");
        a = entrada.nextInt();
        
        System.out.println("Insira os lados do triangulo: ");
        b = entrada.nextInt();
       
        System.out.println("Insira os lados do triangulo: ");
        c = entrada.nextInt();

        if(a > b + c) {
            System.out.println("nao eh um triangulo");
        } else {
            if((a == b) && (a == c) && (b == c)){
                System.out.println("Triangulo equilatéro");
            } else {
                if((a == b) || (b == c) || (a == c)) {
                    System.out.println("triangulo isoceles");
                } else {
                    System.out.println("trianguo escaleno");
                }
            } 
        }

        entrada.close();
    }
}
