/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeorsiguais;

import java.util.Scanner;

/**
 *
 * @author Mathe
 */
public class NUMEORSIGUAIS {

    public static void main(String[] args) {
    double N1,N2;
    boolean R;
    Scanner input = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    N1=Double.valueOf(input.nextLine());
    System.out.print("Digite um numero: ");
    N2=Double.valueOf(input.nextLine());
    R=N1==N2;
    System.out.print("Os dois valores são iguais: "+R);    
}
}