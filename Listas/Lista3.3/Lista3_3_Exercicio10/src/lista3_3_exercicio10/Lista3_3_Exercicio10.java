/*
10) Uma empresa está cadastrando os candidatos a emprego. Cada candidato 
preencheu uma ficha onde estão registrados os seguintes dados: nome, 
gênero (M,  F ou I), idade e experiência no serviço (S ou N).

Faça um programa que leia estes dados, calcule e apresente:
a) A quantidade de candidatos de cada gênero;
b) A quantidade de candidatos com experiência no serviço;
c) A quantidade de candidatos sem experiência no serviço;
d) A idade média dos candidatos com experiência no serviço;
e) A idade média dos candidatos sem experiência no serviço;
f) O percentual de candidatos com experiência no serviço e idade inferior a 35 anos;
g) A idade do candidato mais jovem.

O programa deve ser repetido até que o usuário digite FIM como nome do candidato.
Neste caso, não se deve perguntar as demais informações do candidato.
 */
package lista3_3_exercicio10;

import java.util.Scanner;

public class Lista3_3_Exercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        char genero, experiencia;
        int idade, contCandidatos=0,contM=0, contF=0, contI=0,contExp=0,contNaoExp=0,
            somaIdadeExp=0, somaIdadeNaoExp=0, contExp35=0, maisJovem;
        double idadeMediaExp, idadeMediaNaoExp, percExp35;
        
        System.out.print("Digite o nome do candidato: ");
        nome = input.nextLine();
        maisJovem = 100;
        while (!nome.equalsIgnoreCase("FIM")){
            contCandidatos++; // contCandidatos = contCandidatos + 1; 
            System.out.print("Digite o gênero do candidato (M, F ou I): ");
            genero = input.nextLine().charAt(0);
            System.out.print("Digite a idade do candidato: ");
            idade = Integer.valueOf(input.nextLine());
            System.out.print("O candidato possui experiência no serviço (S ou N): ");
            experiencia = input.nextLine().charAt(0);
            //Contagem por gênero
            switch (genero){
                case 'M' : contM++;  
                           break; 
                case 'F' : contF++;  
                           break; 
                case 'I' : contI++;  
            }
            //Contagem e soma das idades por experiência no serviço 
            switch (experiencia){
                case 'S' : contExp++; 
                           somaIdadeExp = somaIdadeExp + idade;
                           break; 
                case 'N' : contNaoExp++;  
                           somaIdadeNaoExp = somaIdadeNaoExp + idade;
            }
            //Contagem de candidatos com experiência no serviço e idade inferior a 35 anos
            if (experiencia=='S' && idade < 35){
                contExp35++;
            }
            //Verificação do candidato mais jovem
            if (idade < maisJovem) {
                maisJovem = idade;
            }
            System.out.print("Digite o nome do candidato: ");
            nome = input.nextLine();    
        }
        idadeMediaExp = (double) somaIdadeExp / contExp;
        idadeMediaNaoExp = (double) somaIdadeNaoExp / contNaoExp;
        percExp35 = (double) contExp35 / contCandidatos * 100;
        //Saída de dados
        System.out.println("Quantidade de candidatos do gênero masculino: "+contM);
        System.out.println("Quantidade de candidatos do gênero feminino: "+contF);
        System.out.println("Quantidade de candidatos do gênero indefinido: "+contI);
        System.out.println("Quantidade de candidatos com experiência no serviço: "+contExp);
        System.out.println("Quantidade de candidatos sem experiência no serviço: "+contNaoExp);
        System.out.println("Idade média dos candidatos com experiência no serviço: "+idadeMediaExp);
        System.out.println("Idade média dos candidatos sem experiência no serviço: "+idadeMediaNaoExp);
        System.out.println("Percentual de candidatos com experiência no serviço e menos de 35 anos: "+percExp35);
        System.out.println("Idade do candidato mais jovem: "+maisJovem);
    }
    
}
