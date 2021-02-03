package fundamentos.aritméticos.em.java;
import java.util.Scanner;

/*
Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 

 
Exemplo de Entrada	
6

Exemplo de Saída
2
4
6

*/
public class ExibindoNúmerosPares {
    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
    	for (int i =  1; i <= num; i++) {
    		if (i % 2 == 0) {
    		  System.out.println(i);
    		}
    	}
    }
}
