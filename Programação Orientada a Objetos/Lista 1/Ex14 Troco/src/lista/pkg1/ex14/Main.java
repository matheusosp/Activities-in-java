package lista.pkg1.ex14;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor pra ser gerado o troco?");
        int troco = input.nextInt();
        Troco troco1 = new Troco(troco);
        System.out.println("o número mínimo total de cada nota do valor "+troco+" é: ");
        System.out.println(troco1.getNota10()+" notas de 10 Reais");
        System.out.println(troco1.getNota5()+" notas de 5 Reais");
        System.out.println(troco1.getNota1()+" notas de 1 Reais");
    }

}
