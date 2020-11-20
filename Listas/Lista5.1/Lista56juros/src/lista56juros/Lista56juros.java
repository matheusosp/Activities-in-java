package lista56juros;
import java.util.Scanner;
public class Lista56juros {
    
    static double saldo(Scanner input){
        System.out.print("Digite o Saldo da conta ");
        return Double.valueOf(input.nextLine());
    }   

    static double juros(Scanner input){
        System.out.print("Digite o juros ");
        return Double.valueOf(input.nextLine());
    }

    static double saldonovo(double saldo,double juros){
        double saldonovo;
        juros=juros/100+1;
        saldonovo=saldo*juros;
        return saldonovo;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = saldo(input); 
        double juros = juros(input);
        double saldonovo= saldonovo(saldo,juros);
        System.out.println("O saldo com o recebimento dos juros é "+saldonovo);
    }

}
