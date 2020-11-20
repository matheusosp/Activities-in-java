/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto;

import java.util.Scanner;

/**
 *
 * @author Mathe
 */
public class Resto {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
        int numero,resto;
        Scanner input= new Scanner (System.in);
        System.out.print("Digite o valor inteiro: ");
         numero= Integer.valueOf(input.nextLine());
         resto= numero%2;
         numero= numero/2;
        System.out.println("O quociente é: "+numero+"\n"+"E o Resto é: "+resto);
        
    }
    
}
