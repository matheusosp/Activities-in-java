package lista55farentocelsius;
import java.util.Scanner;
public class Lista55farentoCelsius {
    static double leia(Scanner input){
        System.out.print("Digite um numero em Fahrenheit ");
        return Double.valueOf(input.nextLine());
    } 
    static double ftoc(double f){
       double C;
       C=(f-32)*5/9;
       return C; 
    }       
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f = leia(input);
        double C= ftoc(f);
        System.out.println((float)C);
    }

}
