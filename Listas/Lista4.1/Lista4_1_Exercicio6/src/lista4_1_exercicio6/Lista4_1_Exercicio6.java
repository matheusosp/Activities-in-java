/*
6) Para ser aprovado no POSCOMP e ingressar em um curso de Pós-Graduação em
Computação, o aluno deve ter nota superior a média das notas de todos os candidatos
que realizaram a prova. Faça um programa que leia quantos alunos realizaram o
POSCOMP, o nome e a nota de cada um deles, e apresente a lista com o nome dos
candidatos aprovados. O programa também deve apresentar o total e o percentual de
candidatos aprovados e reprovados.
 */
package lista4_1_exercicio6;

import java.util.Scanner;

public class Lista4_1_Exercicio6 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos alunos fizeram a prova do Poscomp? ");
        int n = Integer.valueOf(input.nextLine());
        String[] nomes = new String[n];
        double[] notas = new double[n];
        double soma = 0, media, percAprovados, percReprovados;
        int aprovados = 0, reprovados;
        
        
        for (int i=0;i<n;i++){
            System.out.print("Digite o nome do aluno "+i+": ");
            nomes[i] = input.nextLine();
            System.out.print("Digite a nota do aluno "+nomes[i]+": ");
            notas[i] = Double.valueOf(input.nextLine());
            soma = soma + notas[i];
        }
        media = soma / n;
        System.out.println("Lista dos Aprovados");
        for (int i=0;i<n;i++){
            if (notas[i] > media) {
                System.out.println(nomes[i]);
                aprovados++;
            }
        }
        reprovados = n - aprovados;
        percAprovados = aprovados*100/n;
        percReprovados = 100 - percAprovados;
        System.out.println("Média das notas: "+media);
        System.out.println("Quantidade de aprovados: "+aprovados);
        System.out.println("Percentual de aprovados: "+percAprovados);
        System.out.println("Quantidade de reprovados: "+reprovados);
        System.out.println("Percentual de reprovados: "+percReprovados);
    }
    
}
