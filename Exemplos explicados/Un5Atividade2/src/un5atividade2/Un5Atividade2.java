/*
Atividade 5.2: Faça um programa que leia o gabarito de uma prova composta por 
3 questões objetivas. Em seguida, o programa deve ler o nome de um aluno, 
suas respostas e apresentar a quantidade de acertos deste aluno, juntamente 
com o seu nome. O programa deve ser executado até que o nome do aluno seja FIM.

Entrada: 
    - Respostas corretas (3 valores)
    - Nome do aluno                     - Vários alunos
    - Respostas do aluno (3 valores)    - Vários alunos
Processamento:
    - Verificar a quantidade de acertos - Vários alunos
Saída:
    - Nome e quantidade de acertos      - Vários alunos
 */
package un5atividade2;

import java.util.Scanner;

public class Un5Atividade2 {

    static char[] leiaRespostas(Scanner input){
        char [] local = new char[3];
        for (int i=0;i<3;i++){
            System.out.print("Questão " + (i+1) + ": ");
            local[i] = input.nextLine().charAt(0);
        }
        return local;
    }
    
    static int verifiqueAcertos(char[] resp, char[] gab){
        int cont = 0;
        for (int i=0;i<3;i++){
            if (resp[i]==gab[i])
                cont++;
        }
        return cont;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [] gabarito, respostas;
        String nome;
        int acertos;
        
        System.out.println("Digite as respostas corretas: ");
        gabarito = leiaRespostas(input);
        System.out.print("Digite o nome do aluno: ");
        nome = input.nextLine();
        while (!nome.equalsIgnoreCase("FIM")){
            System.out.println("Digite as respostas do aluno "+nome+": ");
            respostas = leiaRespostas(input);
            acertos = verifiqueAcertos(respostas, gabarito);
            System.out.println(nome+" você acertou "+acertos + " questões.");
            System.out.print("Digite o nome do aluno :");
            nome = input.nextLine();
        }
    }
    
}
