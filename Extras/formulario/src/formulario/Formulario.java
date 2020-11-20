/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Formulario {

       public static void main(String[] args) {
        // TODO code application logic here
        String nome;
        boolean matricula;
        char genero;
        int idade;
        float peso;
        Scanner input= new Scanner (System.in);
        System.out.print("Digite o seu nome: ");
        nome = input.nextLine();
        System.out.print("Digite a sua idade ");
        idade = Integer.valueOf(input.nextLine());
        System.out.print("Digite o seu peso: ");
        peso = Float.valueOf(input.nextLine());
        System.out.print("Digite o seu genero: ");
        genero = input.nextLine().charAt(0);
        System.out.print("Digite se esta matriculado ");
        matricula = Boolean.valueOf(input.nextLine());
         System.out.println("Seja bem vindo "+nome +"\n" +idade +"\n" +peso +"\n" +genero +"\n" +matricula);
        
    }
    
}


