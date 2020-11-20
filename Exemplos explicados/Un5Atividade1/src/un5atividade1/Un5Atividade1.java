/*
 Atividade 5.1: Crie um programa que calcule o fatorial de dois números e 
apresente a soma destes valores.
Entrada: 
    - Número1
    - Número2
Processamento: 
    - Calcular o fatorial do número 1
    - Calcular o fatorial do número 2
    - Somar os fatoriais dos números 1 e 2
Saída:
    - Soma
 */
package un5atividade1;

import java.util.Scanner;

public class Un5Atividade1 {
    static int leiaNumero(Scanner input){
        System.out.print("Digite um número inteiro: ");
        return Integer.valueOf(input.nextLine());
    }
    
    static int calculeFatorial(int n){
        int fat = 1;
        for (int i=n;i>1;i--){
            fat = fat * i;
        }
        return fat;
    }
        

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = leiaNumero(input);
        int n2 = leiaNumero(input);
        int fat1 = calculeFatorial(n1);
        int fat2 = calculeFatorial(n2);
        int res = fat1 + fat2;
        System.out.println("Fatorial de "+n1+" mais fatorial de "+n2+": "+res);
    }
    
}
