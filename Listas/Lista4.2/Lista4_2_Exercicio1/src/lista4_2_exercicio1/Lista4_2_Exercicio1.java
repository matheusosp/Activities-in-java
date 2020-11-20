/*
1) Faça um programa que possua uma variável do tipo String que deve ser inicializada
com o valor “IFSC”. Em seguida, o programa deve apresentar na tela os seguintes textos:
I
IF
IFS
IFSC
IFS
IF
I
Os dados apresentados na tela não podem ser constantes, eles devem ser oriundos da
variável e gerados a partir da aplicação da função charAt
 */
package lista4_2_exercicio1;


public class Lista4_2_Exercicio1 {

   
    public static void main(String[] args) {
        String texto = "IFSC";
        //Imprime I
        System.out.println(texto.charAt(0));
        //Imprime IF
        System.out.print(texto.charAt(0));
        System.out.println(texto.charAt(1));
        //Imprime IFS
        System.out.print(texto.charAt(0));
        System.out.print(texto.charAt(1));
        System.out.println(texto.charAt(2));
        //Imprime IFSC
        System.out.print(texto.charAt(0));
        System.out.print(texto.charAt(1));
        System.out.print(texto.charAt(2));
        System.out.println(texto.charAt(3));
        //Imprime IFS
        System.out.print(texto.charAt(0));
        System.out.print(texto.charAt(1));
        System.out.println(texto.charAt(2));
        //Imprime IF
        System.out.print(texto.charAt(0));
        System.out.println(texto.charAt(1));
        //Imprime I
        System.out.println(texto.charAt(0));
    }
    
}
