/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horas;

import java.util.Scanner;

/**
 *
 * @author Mathe
 */
public class Horas {

        public static void main(String[] args) {
        // TODO code application logic here
        int horas,minutos,segundos;
        Scanner input= new Scanner (System.in);
        System.out.print("digite as horas,minutos,segundos respectivamente ");
         horas= Integer.valueOf(input.nextLine());
         System.out.print("minutos: ");
         minutos= Integer.valueOf(input.nextLine());
         System.out.print("segundos ");
         segundos= Integer.valueOf(input.nextLine()); 
         horas= horas*3600;
         minutos= minutos*60;
         horas= (horas+minutos+segundos);
        System.out.println("Ja se passou "+horas+"segundos.");
        
    }
    
}
