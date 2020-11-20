
package exercicio1;

import java.util.Scanner;


public class Exercicio1 {


    public static void main(String[] args) {
        //Declaração das variáveis
        Scanner input = new Scanner(System.in);
        double preco, conta, contaAtraso;
        int consumo;
        
        //Entrada de dados
        System.out.print("Digite o preço do quilowatt: ");
        preco = Double.valueOf(input.nextLine());
        System.out.print("Digite a quantidade consumida de quilowatts: ");
        consumo = Integer.valueOf(input.nextLine());
        
        //Processamento
        conta = consumo * preco;
        contaAtraso = conta + conta*10/100;
        
        //Saída de dados
        System.out.println("Valor da conta ser for paga em dia: "+conta);
        System.out.println("Valor da conta ser for paga com atraso: "+contaAtraso);
        if (consumo > 70){
            System.out.println("Consumo elevado de energia.");
        }
        else {
            System.out.println("Você é um consumidor consciente.");
        }
    }   
}
