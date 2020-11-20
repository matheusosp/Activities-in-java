/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aviao;

import java.util.Scanner;

/**
 *
 * @author Mathe
 */
public class Aviao {

public static void main(String[] args) {
       double tam_pista, peso, visibilidade, chuva, passageiros;
       boolean decolagem,decola;
    Scanner input = new Scanner(System.in);
    System.out.print("Qual o tamanho da pista em Km: ");
    tam_pista=Double.valueOf(input.nextLine());
    System.out.print("Digite o Peso do Avião: ");
    peso=Double.valueOf(input.nextLine());
    System.out.print("Digite a visibilidade: ");
    visibilidade=Double.valueOf(input.nextLine());
    System.out.print("Quantidade de chuva em mm: ");
    chuva=Double.valueOf(input.nextLine());
    System.out.print("Quantidade de passageiros: ");
    passageiros=Double.valueOf(input.nextLine());
    System.out.print("Possui sistema de decolagem? (true ou false) ");
    decolagem=Boolean.valueOf(input.nextLine());
    decola=((tam_pista<1.5 && peso<40) || (tam_pista>=1.5 && tam_pista<=2 && peso<=60) || tam_pista>2)&&(visibilidade<=20 && decolagem || visibilidade>20 )&&((passageiros>=100 && chuva == 0) || (passageiros<=100 && chuva >0) && chuva<5);
    System.out.print("Decola: "+decola);
    }
    
}
