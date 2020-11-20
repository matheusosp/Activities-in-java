/*
12) O seno de um ângulo A, expresso em radianos, pode ser calculado pela série 
abaixo:
Faça um programa que leia o valor do ângulo em graus, converta-o para radianos e
calcule o seu seno, utilizando os oito primeiros termos da série acima. 
Use funções diferentes para realizar a conversão do ângulo e o cálculo do 
seu seno.
Entrada: Angulo em graus
Processamento: 
        Converter angulo de graus para radianos
        Calcular seno do angulo usando a série dada    
Saida: Seno do angulo

*/
package lista5_2_ex12;

import java.util.Scanner;

public class Lista5_2_Ex12 {

    public static double converteGrausRad(double g){
        return g*3.14/180;
    }
    
    public static double calculaPotencia(double rad, int p){
        double temp=1;
        for (int i=0;i<p;i++){
            temp = temp * rad;
        }
        return temp;
    }
    
    public static int calculaFatorial(int n){
        int fat = 1;
        for (int i=n;i>1;i--){
            fat = fat * i;
        }
        return fat;
    }
    
    public static double calculaSeno(double rad){
           int fat;
           double pot;
           double soma = 0;
           boolean somar = true;
           
           for (int i=1;i<=15;i=i+2){
               pot = calculaPotencia(rad,i);
               fat = calculaFatorial(i);
               if (somar==true){
                    soma = soma + pot/fat;
                    somar = false;
               }
               else {               
                    soma = soma - pot/fat;
                    somar = true;
               }
           }
           return soma;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ângulo em graus: ");
        double graus = Double.valueOf(input.nextLine());
        double rad = converteGrausRad(graus);
        double seno = calculaSeno(rad);    
        System.out.println("Seno de "+graus+" graus: "+seno);
    }
    
}
