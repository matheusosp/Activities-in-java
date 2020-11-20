/*
Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados
de idade, sexo (M/F) e salário. Faça um programa que leia a quantidade de entrevistados,
os dados de cada um, calcule e apresente:
a) a média de salário do grupo;
b) a maior e a menor idade do grupo;
c) a quantidade de mulheres com salário até R$1000,00.
Crie uma função para ler os dados e mais uma função para cada item solicitado.

Entrada: idade, sexo, salario (N)
Processamento: 
- a média de salário do grupo;
- a maior idade do grupo;
- a menor idade do grupo;
- a quantidade de mulheres com salário até R$1000,00.
Saída:

*/
package lista5_2_ex11;

import java.util.Scanner;

public class Lista5_2_Ex11 {
    public static void leiaDados(int[] idades, char[] generos, double[] salarios,
                                 int n, Scanner input){
        for (int i=0;i<n;i++){
            System.out.println("Digite a idade da pessoa "+i+" :");
            idades[i] = Integer.valueOf(input.nextLine());
            System.out.println("Digite o gênero da pessoa "+i+" :");
            generos[i] = input.nextLine().charAt(0);
            System.out.println("Digite o salário da pessoa "+i+" :");
            salarios[i] = Double.valueOf(input.nextLine());
        }
    }

    public static double calculeMediaSalarial(double[] salarios,int n){
        double soma=0;
        for (int i=0;i<n;i++){
            soma = soma + salarios[i];
        }
        return soma / n;
    }
    
    public static int encontreMaiorIdade(int[] idades, int n){
        int maior = idades[0];
        for (int i=1;i<n;i++){
            if (idades[i] > maior){
                maior  = idades[i];
            }
        }
        return maior;
    }
    
    public static int encontreMenorIdade(int[] idades, int n){
        int menor = idades[0];
        for (int i=1;i<n;i++){
            if (idades[i] < menor){
                menor  = idades[i];
            }
        }
        return menor;
    }
    
    public static int conteFemininoMenor1000(double[] salarios,char[] generos, int n){
        int cont = 0;
        for (int i=0;i<n;i++){
            if (generos[i]=='F' && salarios[i]<=1000){
                cont++;
            }
        }
        return cont;
    }
    
    public static void  mostreResultados(double mediaSal, int maiorIdade, 
                                         int menorIdade, int quantFemMenor1000){
        System.out.println("Média salarial: "+mediaSal);
        System.out.println("Maior idade: "+maiorIdade);
        System.out.println("Menor idade: "+menorIdade);
        System.out.println("Quantidade de mulheres com salário até R$ 1000,00 :"+
                           quantFemMenor1000);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de entrevistados: ");
        int n = Integer.valueOf(input.nextLine());
        int[] idades = new int[n];
        char[] generos = new char[n];
        double[] salarios = new double[n];
        double mediaSal;
        int maiorIdade;
        int menorIdade;
        int quantFemMenor1000;
        leiaDados(idades,generos,salarios,n,input);
        mediaSal = calculeMediaSalarial(salarios,n);
        maiorIdade = encontreMaiorIdade(idades,n);
        menorIdade = encontreMenorIdade(idades,n);
        quantFemMenor1000 = conteFemininoMenor1000(salarios,generos,n);
        mostreResultados(mediaSal, maiorIdade, menorIdade, quantFemMenor1000);
    }
    
}
