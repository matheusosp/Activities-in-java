/*
b) Crie um programa em Java que leia dois números reais e a operação que deve 
ser realizada sobre eles (+, -, * e /). O programa deve calcular a operação 
desejada e apresentar o resultado..
 */
package un3exemplo6;

import java.util.Scanner;

public class Un3Exemplo6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double n1 = Double.valueOf(input.nextLine());
        System.out.println("Digite o segundo número: ");
        double n2 = Double.valueOf(input.nextLine());
        System.out.println("Digite a operação desejada (+, -, * e /)");
        char op = input.nextLine().charAt(0);
        double result;
        
        switch (op){
            case '+': result = n1 + n2;
                      System.out.println("Resultado da soma: " + result);
                      break;
            case '-': result = n1 - n2;
                      System.out.println("Resultado da subtração: "+result);
                      break;
            case '*': result = n1 * n2;
                      System.out.println("Resultado da multiplicação: "+result);
                      break;
            case '/': result = n1 / n2;
                      System.out.println("Resultado da divisão: "+result);
                      break;
            default : System.out.println("Operador inválido.");
       }
        
    }
    
}
