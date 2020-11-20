package un3exemplo9;

import java.util.Scanner;


public class Un3Exemplo9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, quadrado, i, n;
    
        do {
            System.out.println("Digite um número inteiro:");
            numero = Integer.valueOf(input.nextLine());
            quadrado = numero * numero;
            System.out.println("Resultado: "+quadrado);
        } while (numero != 0);
            
    }
  
}
