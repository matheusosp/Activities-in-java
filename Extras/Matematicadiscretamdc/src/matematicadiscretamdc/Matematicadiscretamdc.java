package matematicadiscretamdc;
import java.util.Scanner;
public class Matematicadiscretamdc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numero 1: ");
        float n1= Float.valueOf(input.nextLine());
        System.out.print("Numero 2: ");
        float n2= Float.valueOf(input.nextLine());
        int mod=(int)(n1%n2);
        while(mod!=0){
            mod=(int)(n1%n2);
            n1=n2;
            if (mod!=0){
                n2=mod;
            }     
        }                
        System.out.println("MDC = "+(int)(n2));           
    }

}
