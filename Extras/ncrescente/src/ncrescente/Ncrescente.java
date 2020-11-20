package ncrescente;
import java.util.Scanner;
public class Ncrescente {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite um numero inteiro: ");
    int N1=Integer.valueOf(input.nextLine());
    System.out.print("Digite um numero inteiro diferente: ");
    int N2=Integer.valueOf(input.nextLine());
    System.out.print("Digite um numero inteiro diferente: ");
    int N3=Integer.valueOf(input.nextLine());
    if(N1<N2&&N1<N3 && N2<N3 ){System.out.print("A ordem cresceste é :"+N1+N2+N3);}
    else if(N1<=N2&&N1<=N3 && N3<=N2) {System.out.print("A ordem cresceste é :"+N1+N3+N2); }
    else if(N2<=N1&&N2<=N3 && N3<=N1){System.out.print("A ordem cresceste é :"+N2+N3+N1);}
    else if(N2<=N1&&N2<=N3 && N1<=N3){System.out.print("A ordem cresceste é :"+N2+N1+N3);}
    else if(N3<=N2&&N3<=N1 && N1<=N2){System.out.print("A ordem cresceste é :"+N3+N1+N2);}
    else{System.out.print("A ordem cresceste é :"+N3+N2+N1);}
    }}
    

