package prova2questao3;

import java.util.Scanner;


public class Prova2Questao3 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, n;
        double a = 0, numerador, denominador;
        
        do{
            System.out.print("Digite o valor de x (deve ser um número inteiro maior que 0): ");
            x = Integer.valueOf(input.nextLine());
        } while (x<=0);
        do{
            System.out.print("Digite o valor de n (deve ser um número inteiro maior que 0): ");
            n = Integer.valueOf(input.nextLine());
        } while (n<=0);
        for (int i=1;i<=n;i++){
            numerador = 1;
            denominador = 1;
            for (int j=1;j<=i;j++){
                numerador = numerador * x;
                denominador = denominador * j;
            }
            a = a + (double) numerador / denominador;
        }
        System.out.println("A = "+ a);
    }
    
}
