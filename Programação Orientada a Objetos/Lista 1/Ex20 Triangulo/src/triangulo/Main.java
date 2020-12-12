package triangulo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] valores = new int[3];
        System.out.println("Digite X");
        valores[0] = input.nextInt();
        System.out.println("Digite Y");
        valores[1] = input.nextInt();
        System.out.println("Digite Z");
        valores[2] = input.nextInt();
        Triangulo triangulo1 = new Triangulo();
        triangulo1.setClassificao(valores);
        System.out.println("Classificação: "+triangulo1.getClassificao());
       
    }

}
