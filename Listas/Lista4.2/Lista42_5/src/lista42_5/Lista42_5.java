package lista42_5;
import java.util.Scanner;
public class Lista42_5 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       String algo,palindromo = "", kkk = "";
        System.out.println("Digite uma string");
        algo=input.nextLine(); 
        for( int i = algo.length()-1;i>=0;i--){
            if(algo.charAt(i) != ' '){    
                palindromo += algo.charAt(i);
            }
        }
        for( int i = 0;i<algo.length();i++){
            if(algo.charAt(i) != ' '){    
                kkk += algo.charAt(i);
            }
        }
        if(palindromo.equalsIgnoreCase(kkk)) {
            System.out.print("É um palíndromo!" + "\n" + palindromo);
    	}
    	else {
            System.out.print("Não é um palíndromo!" + "\n" + palindromo);   			
    	}
    }
}
    

