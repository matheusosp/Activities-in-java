/*
a) Faça um programa em Java que leia 10 números inteiros e apresente como 
resultado estes valores elevados ao quadrado.

b) Altere o programa anterior para que, inicialmente, ele pergunte ao usuário 
quantos números ele quer elevar ao quadrado.

c) Altere o programa anterior para que ele conte quantos números positivos e 
quantos números negativos foram digitados.

d) Altere o programa anterior para que ele some todos os valores digitados.
*/
package un3exemplo8;

import java.util.Scanner;

public class Un3Exemplo8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, quadrado, i, n, contPositivo = 0, contNegativo = 0, acumulador = 0;
    
        System.out.println("Digite quantos números você deseja elevar ao quadrado: ");
        n = Integer.valueOf(input.nextLine());
        for (i=1;i<=n;i++){
            System.out.println("Digite um número inteiro:");
            numero = Integer.valueOf(input.nextLine());
            acumulador = acumulador + numero;
            quadrado = numero * numero;
            System.out.println("Resultado: "+quadrado);
            if (numero < 0){
                contNegativo = contNegativo + 1;
            }
            else {
                contPositivo = contPositivo + 1;
            } 
        }
        System.out.println("Número positivos: "+contPositivo);
        System.out.println("Número negativos: "+contNegativo);     
        System.out.println("Soma dos números: "+acumulador);
    }
    
}
