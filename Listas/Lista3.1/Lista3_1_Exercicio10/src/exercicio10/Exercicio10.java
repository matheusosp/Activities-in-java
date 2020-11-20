package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

   
    public static void main(String[] args) {
        //Declaração das variáveis
        Scanner input = new Scanner(System.in);
        int a, b, c;
        
        //Entrada de dados
        System.out.print("Digite um número inteiro: ");
        a = Integer.valueOf(input.nextLine());
        System.out.print("Digite um número inteiro: ");
        b = Integer.valueOf(input.nextLine());
        System.out.print("Digite um número inteiro: ");
        c = Integer.valueOf(input.nextLine());
       
        // Saída de dados
        if ((a < b+c)&&(b < a+c)&&(c < a+b) ) {
            if (a==b && b==c){
                System.out.println("Triângulo equilátero.");
            } 
            else {
                if (a==b || a==c || b==c){
                    System.out.println("Triânguo isócele");
                }
                else {
                    System.out.println("Triângulo escaleno");
                }
            }
        }
        else {
            System.out.println("Estas medidas não formam um triângulo.");
        }
    }
}