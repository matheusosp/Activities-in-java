/*
8) Faça um programa que leia quantos produtos uma empresa possui em seu catálogo,
bem como o nome e o preço de cada produto. Por fim, o programa deve apresentar o
nome e o preço dos três produtos mais caros existentes no catálogo.


Este exercício pode ser resolvido como no programa abaixo ou pode-se ordenar os 
vetores e apresentar os dados das três primeiras posições}
 */
package lista4_1_exercicio8;

import java.util.Scanner;

public class Lista4_1_Exercicio8 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de produtos comercializada pela empresa: ");
        int n = Integer.valueOf(input.nextLine());
        String[] nomes = new String[n];
        String[] nomesCaros = new String[3];
        double[] precos = new double[n];
        double[] precosCaros = new double[3];
        
        for (int i=0;i<n;i++){
            System.out.print("Digite o nome do produto "+i+": ");
            nomes[i] = input.nextLine();
            System.out.print("Digite o preço do produto "+nomes[i]+": ");
            precos[i] = Double.valueOf(input.nextLine());
        }
        
        for (int i=0;i<3;i++){
            nomesCaros[i] = nomes[0];
            precosCaros[i] = precos[0];
            int posicaoCaro = 0;
            for (int j=1;j<n;j++){
                if (precos[j] > precosCaros[i]){
                    precosCaros[i] = precos[j];
                    nomesCaros[i] = nomes[j];
                    posicaoCaro = j;
                }
            }
            precos[posicaoCaro] = 0;
        }
        
        System.out.println("Lista com os três produtos mais caros: ");
        for (int i=0;i<3;i++)
            System.out.println(nomesCaros[i]+"-"+precosCaros[i]);
    }
    
}
