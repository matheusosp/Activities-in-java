package lista42_4;
import java.util.Scanner;
public class Lista42_4 {
    public static void main(String[] args) {
        String números;
        Scanner input = new Scanner(System.in);      
        System.out.print("Digite um numero inteiro: ");
        números = input.nextLine();
        String [] numeros = {"zero","um","dois","três","quatro","cinco","seis","sete","oito","nove"};
        int index;  
        char num;
        for(int i = 0; i < números.length(); i++){
            num=números.charAt(i);    
            switch(num){
            case '0': index = 0;
                System.out.println(numeros[index]);
                break;
            case '1': index = 1;
                System.out.println(numeros[index]);
                break;
            case '2': index = 2;
                System.out.println(numeros[index]);
                break;
            case '3': index = 3;
                System.out.println(numeros[index]);    
                break;
            case '4': index = 4;
                System.out.println(numeros[index]);
                break;
            case '5': index = 5;
                System.out.println(numeros[index]);
                break;
            case '6': index = 6;
                System.out.println(numeros[index]);
                break;
            case '7': index = 7;
                System.out.println(numeros[index]);
                break;
            case '8': index = 8;
                System.out.println(numeros[index]);
                break;
            case '9': index = 9;
                System.out.println(numeros[index]);
            }
        }
    }        
}    
 

