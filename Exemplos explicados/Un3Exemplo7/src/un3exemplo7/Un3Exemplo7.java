package un3exemplo7;

import java.util.Scanner;

public class Un3Exemplo7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int i;
        int quantidade;
        double valor;
        
        for (i=1;i<=12;i++){
            System.out.print("Digite a quantidade vendida no mês: ");
            quantidade = Integer.valueOf(input.nextLine());
            valor = quantidade * 15.00;
            System.out.println("Total arrecadado com as vendas do mês: " + valor);
        }
    }      
}
