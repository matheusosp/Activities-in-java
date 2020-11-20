package lista3_3_exercicio2;

import java.util.Scanner;

public class Lista3_3_Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, cont=0, soma=0;
        double media;
        
        System.out.print("Digite um número inteiro positivo ou 0 para terminar: ");
        numero = Integer.valueOf(input.nextLine());
        while (numero!=0){
            cont = cont + 1;
            soma = soma + numero;
            System.out.print("Digite um número inteiro positivo ou 0 para terminar: ");
            numero = Integer.valueOf(input.nextLine());
        }
        media = (double) soma / cont;
        System.out.println("Quantidade de números digitados: "+cont);
        System.out.println("Soma dos números digitados: "+soma);
        System.out.println("Média dos números digitados: "+media);
    }
    
}
