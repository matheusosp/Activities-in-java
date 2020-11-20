/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Mathe
 */
public class Numeros {

    public static void main(String[] args) {
    double A,B,C;
    boolean R;
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o valor A: ");
    A=Double.valueOf(input.nextLine());
    System.out.print("Digite o valor B: ");
    B=Double.valueOf(input.nextLine());
    System.out.print("Digite o valor C: ");
    C=Double.valueOf(input.nextLine());
    R=A+B<=C;
    System.out.print("A soma de A com B é menor ou igual a C: "+R);   
    
}}
