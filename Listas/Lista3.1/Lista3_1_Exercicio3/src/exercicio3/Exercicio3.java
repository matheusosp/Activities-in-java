package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
      //Declaração das variáveis
        Scanner input = new Scanner(System.in);
        double peso, altura, imc;
        
        //Entrada de dados
        System.out.print("Digite o seu peso (kg): ");
        peso = Double.valueOf(input.nextLine());
        System.out.print("Digite a sua altura (m): ");
        altura = Double.valueOf(input.nextLine()); 

        //Processamento 
        imc = peso/(altura*altura);
        
        // Saída de dados
        System.out.println("Índice de massa corporal: "+imc);
        if (imc < 20) {
            System.out.println("Você está magro");
        }
        else {
            if (imc <= 24.99){
                System.out.println("Você está normal");
            }
            else {
                if (imc <= 30){
                    System.out.println("Você está com sobrepeso");
                }
                else {
                    System.out.println("Você está obeso");
                }
            }
        }
    }
}