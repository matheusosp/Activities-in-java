package lista54;
import java.util.Scanner;
public class Lista54 {
    static String leia(Scanner input){
        System.out.print("Digite uma frase ");
        return input.nextLine();
    }      
    static int vogais(char[] frase){
        int cont=0;
        for (int i=0;i<frase.length;i++){
            if(frase[i]=='a'||frase[i]=='e'||frase[i]=='i'||frase[i]=='o'||frase[i]=='u'){
                cont+=1;
            }
        }
        return cont;
    }
    static int conso(char[] frase){
        int cont=0;
        for (int i=0;i<frase.length;i++){
            if(!(frase[i]=='a'||frase[i]=='e'||frase[i]=='i'||frase[i]=='o'||frase[i]=='u')){
                cont+=1;
            }
        }
        return cont;
    }     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [] frase = leia(input).toCharArray(); 
        int vogais= vogais(frase);
        int conso= conso(frase);
        System.out.println("Existe "+vogais+" vogais e "+conso+" consoantes ");
    }

}
