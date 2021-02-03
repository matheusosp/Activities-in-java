package ordenação.e.filtros.em.java;
import java.util.Scanner;
import java.util.Arrays;

/*
Pedro trabalha sempre até tarde todos os dias, com isso tem pouco tempo tempo para as tarefas domésticas. Para economizar tempo ele faz a lista de compras do supermercado em um aplicativo e costuma anotar cada item na mesma hora que percebe a falta dele em casa.

O problema é que o aplicativo não exclui itens duplicados, como Pedro anota o mesmo item mais de uma vez e a lista acaba ficando extensa. Sua tarefa é melhorar o aplicativo de notas desenvolvendo um código que exclua os itens duplicados da lista de compras e que os ordene alfabeticamente.

Entrada
A primeira linha de entrada contém um inteiro N (N < 100) com a quantidade de casos de teste que vem a seguir, ou melhor, a quantidade de listas de compras para organizar. Cada lista de compra consiste de uma única linha que contém de 1 a 1000 itens ou palavras compostas apenas de letras minúsculas (de 1 a 20 letras), sem acentos e separadas por um espaço.

Saída
A saída contém N linhas, cada uma representando uma lista de compra, sem os itens repetidos e em ordem alfabética.

 
Exemplo de Entrada	
2
carne laranja suco picles laranja picles
laranja pera laranja pera pera

Exemplo de Saída
carne laranja picles suco
laranja pera
*/
public class ComprasSupermercado {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        String texto = input.nextLine();
        for (int i=0;i<line;i++){
            texto = input.nextLine();
            String array [] = texto.split(" ");
            for(int s=0;s<array.length-1;s++){
                for(int m=s + 1;m<array.length;m++){
                    if(array[s] != null && array[s].equals(array[m])){
                        array[m] = ""; 
                    }
                } 
            }
            Arrays.sort(array);
            for (String array1 : array) {
                if (!"".equals(array1)) {
                    System.out.print(array1 + " ");
                }
            }
            System.out.println("");
        }
    }
}
