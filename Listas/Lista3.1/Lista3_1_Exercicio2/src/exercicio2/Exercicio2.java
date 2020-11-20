package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
      //Declaração das variáveis
        Scanner input = new Scanner(System.in);
        double prova1, prova2, trabalho;
        
        //Entrada de dados
        System.out.print("Digite a nota da prova 1: ");
        prova1 = Double.valueOf(input.nextLine());
        System.out.print("Digite a nota da prova 2: ");
        prova2 = Double.valueOf(input.nextLine()); 
        System.out.print("Digite a nota do trabalho: ");
        trabalho = Double.valueOf(input.nextLine());
        
        //Processamento e saída de dados
        if ((prova1>= 6 || prova2 >=6)&&(trabalho >= 7)){
            System.out.println("Parabéns, você foi aprovado.");
        }
        else {
            System.out.println("Infelizmente você não foi aprovado.");
        }
    }
}
