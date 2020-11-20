/*
7) Suponha que a cidade A possui 120 mil habitantes e a cidade B possui 80 mil 
habitantes. A população da cidade A cresce a uma taxa de 1,5% ao ano e a cidade 
B a uma taxa de 3,5% ao ano. Faça um programa que calcule e apresente em quantos
anos a população da cidade B vai ultrapassar a população da cidade A.
 */
package lista3_3_exercicio7;

public class Lista3_3_Exercicio7 {

 
    public static void main(String[] args) {
        double popA=120000, popB=80000;
        int i=0;
       
        while (popB < popA){
           i = i + 1;
           popA = popA + popA*1.5/100;
           popB = popB + popB*3.5/100;
        }
        System.out.println("A população da cidade B ultrapassará a população da "+
                           "cidade A daqui a "+i+" anos.");
    }   
}
