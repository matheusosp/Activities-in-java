package lista3_2_exercicio8;

import java.util.Scanner;

public class Lista3_2_Exercicio8 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, fat=1;
        
        System.out.print("Digite um número inteiro par calcular o fatorial: ");
        n = Integer.valueOf(input.nextLine());
        for (i=1;i<=n;i++){
            fat = fat*i;
        }
        System.out.println("O fatorial de "+n+" é: "+fat);
    }
    
}
