package lista53;
import java.util.Scanner;
public class Lista53 {
    static String leia(Scanner input){
        System.out.print("Digite um caractere: ");
        return input.nextLine();
    }  
    static int vogal(String c){
        if(c.equalsIgnoreCase("a")||c.equalsIgnoreCase("e")||c.equalsIgnoreCase("i")||c.equalsIgnoreCase("o")||c.equalsIgnoreCase("u")){
            return 0;
        }else{ 
            return 1;
        }
    }      
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c = leia(input);
        int vogal=vogal(c);
        System.out.println(vogal);
    }

}
