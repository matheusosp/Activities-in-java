/*
8) Faça um programa que receba o valor da venda e a condição de pagamento, conforme
menu abaixo. O programa deve enviar estes dados para uma função que calcula e 
retorna
o valor final da venda, que deve ser apresentado pelo programa.
1 - Venda a Vista - desconto de 10%.
2 - Venda a Prazo 30 dias - desconto de 5%.
3 - Venda a Prazo 60 dias - mesmo preço.
4 - Venda a Prazo 90 dias - acréscimo de 5%.
5 - Venda com cartão de débito - desconto de 7%.
6 - Venda com cartão de crédito - desconto de 5%.

Entrada: Valor de venda, Condicao de pagamento
Processamento: Valor final da venda = Valor da venda +- taxa
               taxa = valor que depende da condição de pagamento
Saída: Valor final da venda
*/
package lista5_2_ex8;

import java.util.Scanner;

public class Lista5_2_Ex8 {
    
    public static double calculeValorFinal(double venda, int condicao){
        double vf=0;
        switch (condicao){
            case 1: vf = venda - venda*10/100;
                    break;
            case 2: vf = venda - venda*5/100;
                    break;
            case 3: vf = venda;
                    break;
            case 4: vf = venda + venda*5/100;
                    break;
            case 5: vf = venda - venda*7/100;
                    break;
            case 6: vf = venda - venda*5/100;
                    break;
        }   
        return vf;
    } 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor da venda: ");
        double venda = Double.valueOf(input.nextLine());
        System.out.println("1 - Venda a Vista - desconto de 10%.\n" +
                           "2 - Venda a Prazo 30 dias - desconto de 5%.\n" +
                           "3 - Venda a Prazo 60 dias - mesmo preço.\n" +
                           "4 - Venda a Prazo 90 dias - acréscimo de 5%.\n" +
                           "5 - Venda com cartão de débito - desconto de 7%.\n" +
                           "6 - Venda com cartão de crédito - desconto de 5%.");
        System.out.print("Digite a condição de pagamento: ");
        int condicao = Integer.valueOf(input.nextLine());
        double valorFinal = calculeValorFinal(venda,condicao); 
        System.out.println("Valor final da venda: "+valorFinal);
    }
    
}
