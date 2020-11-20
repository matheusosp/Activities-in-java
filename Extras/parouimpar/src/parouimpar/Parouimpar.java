package parouimpar;
import java.util.Scanner;
public class Parouimpar { 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite um numero inteiro: ");
    int N=Integer.valueOf(input.nextLine());
    if(N%2==0){System.out.print("O numero é par");}
    else {System.out.print("O numero é impar"); }
    }}
