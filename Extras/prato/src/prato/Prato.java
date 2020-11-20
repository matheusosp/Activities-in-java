/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prato;

import java.util.Scanner;

/**
 *
 * @author Mathe
 */
public class Prato {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
        double peso;
        Scanner input= new Scanner (System.in);
        System.out.print("Digite o peso do prato montado:  ");
         peso= Integer.valueOf(input.nextLine());
         peso= (peso+0.450)*39.0;
        System.out.println("O quociente é: "+peso);
        
    }
    
}
