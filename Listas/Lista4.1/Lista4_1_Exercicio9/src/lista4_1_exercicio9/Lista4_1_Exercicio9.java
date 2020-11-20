/*
9) O voo de uma empresa aérea possui escala em cinco cidades (A, B, C, D e E). Faça
um programa que leia a quantidade de passageiros presentes no voo, o nome e a cidade
de destino de cada um deles. Por fim, o programa deve imprimir uma lista para cada
cidade, com o nome dos passageiros que a tem como destino.

Este problema pode ser resolvido como no programa abaixo, ou de forma mais simples,
sem o vetor cidades. Neste caso, não precisa colocar o for externo na parte e 
processamento e saída de dados e o código que está dentro dele deve ser repetido
cinco vezes, um para cada cidade.
 */
package lista4_1_exercicio9;

import java.util.Scanner;

public class Lista4_1_Exercicio9 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de passageiros no voo: ");
        int n = Integer.valueOf(input.nextLine());
        String[] nomes = new String[n];
        char[] destinos = new char[n];
        char[] cidades = {'A','B','C','D','E'};
        
        //Entrada de dados
        for (int i=0;i<n;i++){
            System.out.print("Digite o nome do passageiro "+i+": ");
            nomes[i] = input.nextLine();
            System.out.print("Digite o destino do passageiro"+nomes[i]+" (A, B, C, D ou E): ");
            destinos[i] = input.nextLine().charAt(0);
        }
        
        //Processamento e saída dos dados
        for (int i=0;i<5;i++){
            System.out.println("Passageiros com destino a cidade "+cidades[i]);
            boolean temPassageiros = false;
            for (int j=0;j<n;j++){
                if (destinos[j]==cidades[i]){    
                    System.out.println(nomes[j]);
                    temPassageiros = true;
                }
            }
            if (temPassageiros==false)
                System.out.println("Nenhum passageiro com destino a cidade "+cidades[i]);
        }
    }
    
}
