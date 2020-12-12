package imc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o Peso");
        float peso = Float.valueOf(input.nextLine());
        System.out.println("Digite a altura");
        float altura = Float.valueOf(input.nextLine());
        System.out.println(altura);
        Pessoa pessoa1 = new Pessoa(peso,altura);
        System.out.println("Classificação: "+pessoa1.getClassificação());
        Pessoa pessoa2 = new Pessoa(85, (float)1.7);
        System.out.println("Classificação: "+pessoa2.getClassificação());
        Pessoa pessoa3 = new Pessoa(85,(float) 1.8);
        System.out.println("Classificação: "+pessoa3.getClassificação());
        
    }

}
