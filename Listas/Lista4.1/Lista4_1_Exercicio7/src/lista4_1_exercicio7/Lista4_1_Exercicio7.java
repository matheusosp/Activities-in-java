/*
7) Realizou-se uma pesquisa com um conjunto de pessoas, na qual obteve-se os
seguintes dados:
- Idade;
- Valor do salário;
- Grau de instrução registrado como um código (1 – Fundamental; 2 – Médio; 3 –
Superior).

Faça um programa que leia os dados das várias pessoas entrevistadas, calcule e
apresente:
a) Quantidade de pessoas com ensino superior que ganham menos de R$ 2.000,00;
b) A média salarial das pessoas conforme seu grau de instrução;
c) A idade média das pessoas com ensino superior;
d) O percentual de pessoas que possuem ensino fundamental;
e) A idade média das pessoas com ensino superior e quantas pessoas com ensino
fundamental e médio estão acima desta média;

O programa deve ler os dados até que o usuário digite -1 como idade da pessoa.
 */
package lista4_1_exercicio7;

import java.util.Scanner;

public class Lista4_1_Exercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] idades = new int[50];
        double[] salarios = new double[50];
        char[] instrucao = new char[50];
        int n=0, contSup2000=0, contFundamental=0, contMedio=0, contSuperior=0,
                 somaIdadeSup=0, contAcimaIdadeSup=0;
        double somaSalFundamental=0, somaSalMedio=0, somaSalSuperior=0, 
               mediaSalFundamental, mediaSalMedio, mediaSalSuperior,
               mediaIdadeSup, percFundamental;
        
        //Entrada de dados
        System.out.print("Digite a idade do entrevistado "+n+": ");
        idades[n] = Integer.valueOf(input.nextLine());
        while (idades[n]!=-1){
            System.out.print("Digite o valor do salário do entrevistado "+n+": ");
            salarios[n] = Double.valueOf(input.nextLine());
            System.out.print("Digite o grau de instrução do entrevistado "+n+": ");
            instrucao[n] = input.nextLine().charAt(0);
            n++;
            System.out.print("Digite a idade do entrevistado "+n+": ");
            idades[n] = Integer.valueOf(input.nextLine());
        }
        //Processamento
        for (int i=0;i<n;i++){
            //Pessoas com ensino superior que ganham menos de 2.000,00.
            if (instrucao[i]=='3' && salarios[i] < 2000)
                contSup2000++;
            //A média salarial das pessoas conforme seu grau de instrução
            switch (instrucao[i]){
                case '1':   somaSalFundamental = somaSalFundamental + salarios[i];
                            contFundamental++;
                            break;
                case '2':   somaSalMedio = somaSalMedio + salarios[i];
                            contMedio++;
                            break;
                case '3':   somaSalSuperior = somaSalSuperior + salarios[i];
                            contSuperior++;
                            break;
            }
            // A idade média das pessoas com ensino superior
            if (instrucao[i]=='3')
                somaIdadeSup = somaIdadeSup + idades[i];
        }
        //A média salarial das pessoas conforme seu grau de instrução
        mediaSalFundamental = somaSalFundamental / contFundamental;
        mediaSalMedio = somaSalMedio / contMedio;
        mediaSalSuperior = somaSalSuperior / contSuperior;
        mediaIdadeSup = somaIdadeSup / contSuperior;
        percFundamental = contFundamental * 100 / n;
        for (int i=0;i<n;i++){
            //Quantas pessoas com ensino fundamental e médio estão acima da idade 
            //média das pessoas com ensino superio
            if ((instrucao[i]=='1' ||  instrucao[i]=='2') && idades[i] > mediaIdadeSup){
                contAcimaIdadeSup++;
            }
        }
            
        //Saída de dados
        System.out.println("Quantidade de pessoas com ensino superior que ganham "+
                           "menos de R$ 2.000,00: "+contSup2000);

        System.out.println("Média salarial das pessoas com ensino fundamental: "+
                            mediaSalFundamental);
        System.out.println("Média salarial das pessoas com ensino médio: "+
                            mediaSalMedio);
        System.out.println("Média salarial das pessoas com ensino superior: "+
                            mediaSalSuperior);

        System.out.println("Idade média das pessoas com ensino superior: "+
                            mediaIdadeSup);
        System.out.println("Percentual de pessoas que possuem ensino fundamental: "+
                            percFundamental);
        System.out.println("Quantidade de pessoas com ensino fundamental e médio que "+
                           "estão acima da idade média das pessoas com ensino superior: "+
                            contAcimaIdadeSup);
    }
    
}
