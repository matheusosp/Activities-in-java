package lista3_2_exercicio5;

import java.util.Scanner;

public class Lista3_2_Exercicio5 {

 
  public static void main(String[] args) {      
        Scanner input = new Scanner(System.in);
        int quantHospedes, i, quantDiarias;
        String nome;
        double conta, total=0;
       
        //Entrada de dados
        System.out.print("Digite a quantidade de hóspedes que vão deixar o hotel hoje: ");
        quantHospedes = Integer.valueOf(input.nextLine());
        
        for (i=1;i<=quantHospedes;i++){
            System.out.print("Digite o nome do hóspede "+i+": ");
            nome = input.nextLine();
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
        }    
        System.out.println("Total recebido pelo hotel no dia de hoje: "+total);
    }
}
