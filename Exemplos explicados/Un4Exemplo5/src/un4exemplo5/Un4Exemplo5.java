package un4exemplo5;

import java.util.Scanner;

public class Un4Exemplo5 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int [][] vendas = new int[50][12];
       String[] produtos = new String[50];
       
       for (int i=0;i<50;i++){
            System.out.print("Digite o nome do produto "+i+": ");
            produtos[i] = input.nextLine();
            for (int j=0;j<12;j++) {
               System.out.print("Digite a quantidade vendida de "+produtos[i]+
                                " no mês "+j+": ");
               vendas[i][j] = Integer.valueOf(input.nextLine());
           }
       }
       
       System.out.println("Matriz digitada");
       for (int i=0;i<5;i++){
           for (int j=0;j<4;j++) {
               System.out.print(vendas[i][j]+" ");
           }
           System.out.println("");
       }
    }
    
}
