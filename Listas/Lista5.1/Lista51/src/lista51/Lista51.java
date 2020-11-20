package lista51;
import java.util.Scanner;
public class Lista51 {
    
    static int leiaNumero(Scanner input){
        System.out.print("Digite um número inteiro: ");
        return Integer.valueOf(input.nextLine());
    }
    
    static int soma(int n1,int n2){
        int soma=n1+n2;
        return soma;
    }    
    static int sub(int n1,int n2){
        int sub=n1-n2;
        return sub;
    } 
    static int mult(int n1,int n2){
        int mult=n1*n2;
        return mult;
    } 
    static int divisao(int n1,int n2){
        int divisao=n1/n2;
        return divisao;
    }     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = leiaNumero(input);
        int n2 = leiaNumero(input);
        int soma = soma(n1,n2);
        int sub = sub(n1,n2);
        int mult = mult(n1,n2);
        int divisao = divisao(n1,n2);
        System.out.println("A soma de "+n1+" mais "+n2+": "+soma);
        System.out.println("A soma de "+n1+" mais "+n2+": "+sub);
        System.out.println("A soma de "+n1+" mais "+n2+": "+mult);
        System.out.println("A soma de "+n1+" mais "+n2+": "+divisao);
    }

}
