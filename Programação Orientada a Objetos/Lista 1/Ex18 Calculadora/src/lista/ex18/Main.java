package lista.ex18;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero 1");
        float n1 = Float.valueOf(input.nextLine());
        System.out.println("Digite a operação");
        char op = input.nextLine().charAt(0);
        System.out.println("Digite o numero 2");
        float n2 = Float.valueOf(input.nextLine());
        Calculo calculo = new Calculo();
        calculo.setCalculo(n1, n2, op);
        System.out.println("Resultado: "+calculo.getCalculo());
    }

}
