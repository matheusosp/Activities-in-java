/*
2) Crie uma nova versão do programa gerado na questão 1 usando a função subString.
 */
package lista4_2_exercicio2;


public class Lista4_2_Exercicio2 {

     public static void main(String[] args) {
              String texto = "IFSC";
        //Imprime I
        System.out.println(texto.substring(0,1));
        //Imprime IF
        System.out.println(texto.substring(0,2));
        //Imprime IFS
        System.out.println(texto.substring(0,3));
        //Imprime IFSC
        System.out.println(texto.substring(0,4));
        //Imprime IFS
        System.out.println(texto.substring(0,3));
        //Imprime IF
        System.out.println(texto.substring(0,2));
        //Imprime I
        System.out.println(texto.substring(0,1));
    }
    
}
