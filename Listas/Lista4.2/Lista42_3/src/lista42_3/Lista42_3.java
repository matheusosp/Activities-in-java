package lista42_3;

import java.util.Scanner;

public class Lista42_3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String algo;
      char vogais;
      int cont = 0;
        System.out.println("Digite uma string");
        algo=String.valueOf(input.nextLine());
        System.out.println("O tamanho da string digitada é "+algo.length());
        for(int i=0;i<algo.length();i++){  
            vogais=algo.charAt(i);
                if (vogais == 'a') {
                    cont++;
                } 
                if (vogais == 'e') {
                    cont++;
                } 
                if (vogais == 'i') {
                    cont++;
                } 
                if (vogais == 'o') {
                    cont++;
                } 
                if (vogais == 'u') {
                    cont++;
                } 
        }
        System.out.println("Existe "+cont+" vogais na String");
        System.out.println("String digitada em caixa alta: "+algo.toUpperCase());
    }        
}   

