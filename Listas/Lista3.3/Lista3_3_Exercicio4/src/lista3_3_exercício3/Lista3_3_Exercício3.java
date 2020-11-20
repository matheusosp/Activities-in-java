package lista3_3_exercício3;

import java.util.Scanner;


public class Lista3_3_Exercício3 {


        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, maior, menor;
        
        do {
            System.out.print("Digite um número inteiro positivo ou 0 para terminar: ");
            numero = Integer.valueOf(input.nextLine());
        } while (numero < 0);
        maior = numero;
        menor = numero;
        while (numero!=0){
            if (numero > maior){
                maior = numero;
            }
            if (numero < menor){
                menor = numero;
            }
            do {
                System.out.print("Digite um número inteiro positivo ou 0 para terminar: ");
                numero = Integer.valueOf(input.nextLine());
            } while (numero < 0);
        }
        System.out.println("Maior número: "+maior);
        System.out.println("Menor número: "+menor);
    }
    
}