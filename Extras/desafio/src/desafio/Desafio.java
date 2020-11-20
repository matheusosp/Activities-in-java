/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.Scanner;

/**
 *
 * @author Mathe
 */
public class Desafio {

        public static void main(String[] args) {
        // TODO code application logic here
        int horas = 0,minutos = 0,segundos;
        Scanner input= new Scanner (System.in);
        System.out.print("digite a quantidade de segundos: ");
         segundos= Integer.valueOf(input.nextLine());
         horas= segundos/3600;
         minutos=(segundos/60)-horas*60;
         segundos= (segundos-(horas*3600)-(minutos*60));
        System.out.println("O dia vai acabar em: "+horas+":"+minutos+":"+segundos);
        
    }
    
}
