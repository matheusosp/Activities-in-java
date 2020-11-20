/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quilowatss;

import java.util.Scanner;

public class Quilowatss {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite  o preço do quilowatt de energia ");
    float preco = Float.valueOf(input.nextLine());
    System.out.print("Digite quantidade gasta de quilowatts em uma residência ");
    float qtd=Float.valueOf(input.nextLine());
    float conta,contaatraso;
    boolean consumoelevado;
    conta= qtd * preco;
    contaatraso =conta + conta/10  ;
    if (qtd>70){
    System.out.print("O valor a ser pago pela residência caso a conta seja paga no dia é:"+conta);
    System.out.print("\n e o valor a ser pago caso a conta seja paga em atraso é :"+contaatraso);
    System.out.print("\n E o consumo de energia da residencia está elevado.");
    }else{
    System.out.print("O valor a ser pago pela residência caso a conta seja paga no dia é:"+conta);
    System.out.print("\n e o valor a ser pago caso a conta seja paga em atraso é :"+contaatraso);
    System.out.print("\n E o consumo de energia da residencia não  está elevado.");
}}
}
    

