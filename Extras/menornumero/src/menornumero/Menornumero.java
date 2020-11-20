package menornumero;
import java.util.Scanner;
public class Menornumero {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite um numero inteiro: ");
    int N1=Integer.valueOf(input.nextLine());
    System.out.print("Digite um numero inteiro diferente: ");
    int N2=Integer.valueOf(input.nextLine());
    System.out.print("Digite um numero inteiro diferente: ");
    int N3=Integer.valueOf(input.nextLine());
    if(N1<N2&&N1<N3){System.out.print(N1);}
    else if(N2<N1 && N2<N3) {System.out.print(N2); }
    else{System.out.print(N3);}
    }}
    

