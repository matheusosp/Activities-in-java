package triangulos;
import java.util.Scanner;
public class Triangulos { 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o valor X: ");
    double X=Double.valueOf(input.nextLine());
    System.out.print("Digite o valor Y: ");
    double Y=Double.valueOf(input.nextLine());
    System.out.print("Digite o valor Z: ");
    double Z=Double.valueOf(input.nextLine());
    boolean triangulo;
    triangulo = X<(Y+Z) && Y<(X+Z) && Z<(X+Y);
    if (triangulo == true){
    if(X==Z && X== Y && Z == Y){System.out.print("È um triangulo equilátero");}
    else if(X == Z || X == Y || Z == Y ) {System.out.print(" è um triângulo isósceleS"); }
    else if(X!=Z && X!=Y && Z!=Y){System.out.print(" È um triângulo escaleno");}
    }else{System.out.print("Os ponto X,Y e Z não formam um triangulo");}
    }}
    