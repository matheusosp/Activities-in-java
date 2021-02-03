package prova2questao2;

import java.util.Scanner;


public class Prova2Questao2 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num, soma=0, maior, percentualPos;
        int cont=0,contPos=0,cont1_10=0;
        
        System.out.print("Digite um número diferente de 0 (ou 0 para terminar): ");
        num = Double.valueOf(input.nextLine());
        maior = num;
        while (num != 0){
            cont = cont + 1;
            soma = soma + num;
            if (num > maior){
                maior = num;
            }
            if (num > 0){
                contPos = contPos + 1;
            }
            if (num >=1 && num <=10) {
                cont1_10 = cont1_10 + 1;
            }
            System.out.print("Digite um número diferente de 0 (ou 0 para terminar): ");
            num = Double.valueOf(input.nextLine());                
        }
        percentualPos = (double) contPos / cont * 100;
        System.out.println("Quantidade de números lidos: "+cont);
        System.out.println("Soma de todos os números: "+soma);
        System.out.println("Maior número lido: "+maior);
        System.out.println("Percentual de números positivos: "+percentualPos);
        System.out.println("Quantidade de números entre 1 e 10: "+cont1_10);
    }
    
}
