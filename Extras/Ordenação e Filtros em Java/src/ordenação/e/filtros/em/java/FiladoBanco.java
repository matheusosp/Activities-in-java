/* Desafio 
O banco que você trabalha sempre tem problemas para organizar as filas de atendimento dos clientes.

Após uma reunião com a gerência ficou decidido que os clientes ao chegar na agência receberão uma senha numérica em seu aparelho de celular via sms e que a ordem da fila será dada não pela ordem de chegada, mas sim pelo número recebido via sms. Sendo, aqueles com número maior deverão ser atendidos primeiro. 

Então, dada a ordem de chegada dos clientes reordene a fila de acordo com o número recebido via sms, e diga quantos clientes não precisaram trocar de lugar nessa reordenação.

Entrada
A primeira linha contém um inteiro N, indicando o número de casos de teste a seguir.

Cada caso de teste inicia com um inteiro M (1 ≤ M ≤ 1000), indicando o número de clientes. Em seguida haverá M inteiros distintos Pi (1 ≤ Pi ≤ 1000), onde o i-ésimo inteiro indica o número recebido via sms do i-ésimo cliente.

Os inteiros acima são dados em ordem de chegada, ou seja, o primeiro inteiro diz respeito ao primeiro cliente a chegar na fila, o segundo inteiro diz respeito ao segundo cliente, e assim sucessivamente.

Saída
Para cada caso de teste imprima uma linha, contendo um inteiro, indicando o número de clientes que não precisaram trocar de lugar mesmo após a fila ser reordenada.

 
Exemplo de Entrada	Exemplo de Saída
3                               1
3                               0
100 80 90                          4
4
100 120 30 50
4
100 90 30 25
 */
package ordenação.e.filtros.em.java;

import java.util.Arrays;
import java.util.Scanner;
public class FiladoBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        int res [] = new int[line];
        for (int i=0;i<line;i++){
            int line2 = input.nextInt();
            int [] arr = new int[line2];
            for (int j=0;j<line2;j++){
                arr[j] = Integer.valueOf(input.next());
            }
            copyarray(arr);
        }
    }
    public static void copyarray(int arr[]){
        int copyarray[] = arr.clone();
        Arrays.sort(copyarray);
        int aux;
        int repeticoes=copyarray.length/2;
        for(int i=0;i<repeticoes;i++){
            aux=copyarray[i];
            copyarray[i]=copyarray[(copyarray.length-1)-i];
            copyarray[(copyarray.length-1)-i]=aux;
        }
        int trocouposicao=0;
        for(int i = 0; i< arr.length;i++){      
            if(arr[i]==copyarray[i]){
                trocouposicao++;
            }
        }
        System.out.println(trocouposicao);
    }
}
