/*
10) Faça um programa que auxilie um professor na correção de uma prova formada por
dez questões objetivas. Inicialmente o programa deve ler e armazenar a resposta correta
de cada uma das dez questões (as respostas possíveis são ‘A’, ‘B’, ‘C’, ‘D’ e ‘E’). Na
sequência o programa de ler a quantidade de alunos que fizeram a prova, o nome de
cada aluno e as respostas destes aluno para cada uma das 10 questões. Por fim, o
programa deve calcular a quantidade de acertos de cada aluno e apresentar o nome do
aluno e sua quantidade de acertos.
 */
package lista4_2_exercicio10;

import java.util.Scanner;


public class Lista4_2_Exercicio10 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [] gabarito = new char[10];
        System.out.print("Digite a quantidade de alunos que prestaram a prova: ");
        int n = Integer.valueOf(input.nextLine());
        String[] nomes = new String[n];
        char [][] respostas = new char[n][10];
        
        //Entrada de dados
        //Leitura do gabarito
        for (int j=0;j<10;j++){
            System.out.print("Digite a resposta correta da questão "+(j+1)+": ");
            gabarito[j] = input.nextLine().charAt(0);
        }
        //Leitura das respostas dos alunos
        for (int i=0;i<n;i++){
            System.out.print("Digite o nome do aluno "+(i+1)+ ": ");
            nomes[i]=input.nextLine();
            for (int j=0;j<10;j++){
                System.out.print("Digite a resposta do aluno "+nomes[i]+ 
                                 " para a questão "+(j+1)+": ");
                respostas[i][j] = input.nextLine().charAt(0);
            }
        }
        
        //Processamento de dados
        int qtdAcertos;
        for (int i=0;i<n;i++){
            qtdAcertos = 0;
            for (int j=0;j<10;j++){
                if (respostas[i][j] == gabarito[j]){
                    qtdAcertos++;
                }
            }
            System.out.println("Aluno: "+nomes[i]+ " - Acertos: "+qtdAcertos);
        }
        
    }
    
}
