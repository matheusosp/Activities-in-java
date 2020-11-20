/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combustivel;

import java.util.Scanner;

/**
 *
 * @author Mathe
 */
public class Combustivel {
    public static void main(String[] args) {
    double distancia,consumo,preco,custo;
    Scanner input = new Scanner(System.in);
    System.out.print("Qual a distancia a ser percorrida em Km: ");
    distancia=Double.valueOf(input.nextLine());
    System.out.print("Qual o Consumo médio em Km/Litro: ");
    consumo=Double.valueOf(input.nextLine());
    System.out.print("Qual o Preço do Litro de combustivel: ");
    preco=Double.valueOf(input.nextLine());
    custo=distancia/consumo*preco;
    System.out.print("O valor a ser gasto com Combustivel em R$ é: "+custo);
    }
}
