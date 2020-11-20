/* Crie um programa em Java que leia um número inteiro de 1 a 7, que representa
os dias da semana e apresente o dia por extenso, de acordo com a seguinte tabela:
1 – Domingo;
2 – Segunda;
…
7 – Sábado;
*/
package un3exemplo5;

import java.util.Scanner;

public class Un3Exemplo5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número correspondente ao dia (1 a 7):");
        int dia = Integer.valueOf(input.nextLine());
        switch (dia){
            case 1: System.out.println("Domingo");
                    break;
            case 2: System.out.println("Segunda-feira");
                    break;
            case 3: System.out.println("Terça-feira");
                    break;
            case 4: System.out.println("Quarta-feira");
                    break;
            case 5: System.out.println("Quinta-feira");
                    break;
            case 6: System.out.println("Sexta-feira");
                    break;
            case 7: System.out.println("Sábado");
                    break;
            default: System.out.println("Dia inválido");
        }
    }
    
}
