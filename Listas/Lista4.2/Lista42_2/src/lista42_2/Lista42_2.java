package lista42_2;
import java.util.Scanner;
public class Lista42_2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String nome="IFSC";
       for(int i = 1;i<=4;i++){
           String sub = nome.substring(0, i);
           System.out.println(sub);
       }
       for(int i = 3;i>=1;i--){
           String sub = nome.substring(0, i);
           System.out.println(sub);
       }
    }    
}
