package lista52;
import java.util.Scanner;
public class Lista52 {
    
    static Float leiaNumero(Scanner input){
        System.out.print("Digite um número: ");
        return Float.valueOf(input.nextLine());
    }
    
    static float maior(float n1,float n2){
        float maior;
        if (n1>=n2){
            maior=n1;
        }    
        else{
            maior=n2;
        }    
        return maior;
    }       
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n1 = leiaNumero(input);
        float n2 = leiaNumero(input);
        float maior = maior(n1,n2);
        System.out.println("O maior numero é "+maior);
    }

}
