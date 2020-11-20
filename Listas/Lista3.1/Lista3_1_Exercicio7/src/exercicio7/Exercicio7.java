package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

   
    public static void main(String[] args) {
        //Declaração das variáveis
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        
        //Entrada de dados
        System.out.print("Digite um número inteiro: ");
        n1 = Integer.valueOf(input.nextLine());
        System.out.print("Digite um número inteiro: ");
        n2 = Integer.valueOf(input.nextLine());
        System.out.print("Digite um número inteiro: ");
        n3 = Integer.valueOf(input.nextLine());
       
        // Saída de dados
         if (n1 < n2){                                        
            if (n2 < n3) { 
                System.out.println(n1+"-"+n2+"-"+n3);
            }
            else {                                             
                if (n1 < n3){
                   System.out.println(n1+"-"+n3+"-"+n2);
                }
                else {
                    System.out.println(n3+"-"+n1+"-"+n2);
                }   
            }
        }
        else {                                                 
            if (n2 < n3) {                                       
                if (n1 < n3) {
                   System.out.println(n2+"-"+n1+"-"+n3);
                }   
                else { 
                   System.out.println(n2+"-"+n3+"-"+n1);          
                }
            }
            else {
                System.out.println(n3+"-"+n2+"-"+n1);             
            }
         }
                 
    }
}