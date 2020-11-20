package exercicio5;

import java.util.Scanner;

public class Exercicio5 {

     public static void main(String[] args) {
        //Declaração das variáveis
        Scanner input = new Scanner(System.in);
        int numero;
        
        //Entrada de dados
        System.out.print("Digite um número inteiro: ");
        numero = Integer.valueOf(input.nextLine());
       
        // Saída de dados
        if (numero <= 10) {
            System.out.println("F1");
        }
        else {
            if (numero <= 100){
                System.out.println("F2");
            }
            else { 
                System.out.println("F3");
            }
        }
    }
}