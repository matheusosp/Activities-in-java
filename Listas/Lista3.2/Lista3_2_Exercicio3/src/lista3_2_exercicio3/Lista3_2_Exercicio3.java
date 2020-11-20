package lista3_2_exercicio3;

import java.util.Scanner;

public class Lista3_2_Exercicio3 {

    public static void main(String[] args) {      
        Scanner input = new Scanner(System.in);
        int i, numero, resultado;
       
        System.out.print("Digite um número para calcular a tabuada: ");
        numero = Integer.valueOf(input.nextLine());
        for (i=1;i<=10;i++){
            resultado = numero * i;
            System.out.println(numero+" * "+i+" = "+resultado);
       }
    }
    
}
