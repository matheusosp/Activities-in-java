package ordenação.e.filtros.em.java;
import java.util.Scanner;
import java.util.Arrays;
/*
Crie um programa onde você receberá valores inteiros não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:

Primeiro os Pares
Depois os Ímpares
Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.

Saída
Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.

 
Exemplo de Entrada	
10
4
32
34
543
3456
654
567
87
6789
98

Exemplo de Saída
4
32
34
98
654
3456
6789
567
543
87
*/
public class OrdenandoNúmerosPareseImpares {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        int num [] = new int[line];
        for (int i=0;i<line;i++){
          num[i] = input.nextInt();
        }
        Arrays.sort(num);
        int len = 0;
        for (int i=0;i<line;i++){
          if(num[i] % 2 == 0){
            System.out.println(num[i]);
          }else{
            len++;
          }
        }
        int impar []= new int[len];
        int j = 0;
        for (int i=0;i<line;i++){
          if(num[i] % 2 != 0){
            impar[j] = num[i];
            j++;
          }
        }
        for (int i=len-1;i>=0;--i){
          System.out.println(impar[i]);
        }
    }
}
