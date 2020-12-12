package lista.pkg1.ex15;
import java.text.ParseException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o mes: ");
        int mes = input.nextInt();
        System.out.println("Digite o ano: ");
        int ano = input.nextInt();
        Dias dias = new Dias(mes,ano);
        System.out.println("Esse mes possui "+dias.getDias()+" dias");
    }

}
