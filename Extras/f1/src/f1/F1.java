package f1;
import java.util.Scanner;
public class F1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite um numero inteiro: ");
    int N=Integer.valueOf(input.nextLine());
    if(N<=10){System.out.print("F1");}
    else if(N>10 && N<=100) {System.out.print("F2"); }
    else{System.out.print("F3");}
    }}
    
