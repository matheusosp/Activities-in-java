package imc;
import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
    double peso,altura,imc;
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o peso: ");
    peso=Double.valueOf(input.nextLine());
    System.out.print("Digite a altura: ");
    altura=Double.valueOf(input.nextLine());
    imc =peso/(altura*altura);
    if(imc <20){System.out.print("Voce esta magro");}
    else if (imc<25){System.out.print("Voce esta no peso normal"); }
    else if (imc<=30){System.out.print("Voce esta em sobrepeso");}
    else{System.out.print("Voce esta obeso");}
    }}
