package un3exemplo10;

import java.util.Scanner;

public class Un3Exemplo10 {

   public static void main(String[] args) {      
        Scanner input = new Scanner(System.in);
        int quantDiarias;
        String nome;
        double conta, total=0;
       
        //Entrada de dados
       
        System.out.print("Digite o nome do hóspede : ");
        nome = input.nextLine();
        while(!nome.equalsIgnoreCase("FIM")){ // nome != "FIM"
            System.out.print("Digite a quantidade de diárias do hóspede "+nome+": ");
            quantDiarias = Integer.valueOf(input.nextLine());
        //Processamento dos dados
            if (quantDiarias < 10){
                conta = quantDiarias * 94.0;
            }
            else {
                if (quantDiarias == 10){
                    conta = quantDiarias * 92.5;
                }
                else {
                    conta = quantDiarias * 90.0;
                }
            }
        //Saída de dados
            total = total + conta;
            System.out.println("Nome do cliente: "+nome);
            System.out.println("Valor da conta: "+conta);
        //Entrada de dados
            System.out.print("Digite o nome do hóspede : ");
            nome = input.nextLine();
        }    
        System.out.println("Total recebido pelo hotel no dia de hoje: "+total);
    }
}
