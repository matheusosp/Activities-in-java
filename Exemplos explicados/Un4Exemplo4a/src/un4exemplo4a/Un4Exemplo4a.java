/*
Faça um programa que possua 2 variáveis do tipo string. A primeira delas deve 
ser inicializada com o valor: “Maria da Silva” e a segunda deve ser preenchida 
com um nome digitado pelo usuário (este nome deve ter no mínimo quatro 
caracteres). Em seguida, o programa deve apresentar:
- O tamanho do nome digitado pelo usuário.
- O caractere armazenado na posição 3 do nome digitado pelo usuário.
- Se a letra x está presente no nome digitado pelo usuário.
- Se os nomes são iguais ou não, considerando as letras maiúsculas e minúsculas.
- Os dois nomes em ordem alfabética, desconsiderando as letras maiúsculas e minúsculas.
- O nome digitado pelo usuário toda em caixa alta.
- O nome digitado pelo usuário toda em caixa baixa.
- A parte do nome definido como constante que fica entre as posições 9 e 13.
 */
package un4exemplo4a;

import java.util.Scanner;

public class Un4Exemplo4a {

    public static void main(String[] args) {
//Entrada de dados
        Scanner input = new Scanner(System.in);
        String nome1 = "Maria da Silva", nome2;     
        System.out.print("Digite um nome com no mínimo 4 caracteres: ");
        nome2 = input.nextLine();

//Processamento e saída dos dados

// O tamanho do nome digitado pelo usuário.
        int tamanho = nome2.length();
        System.out.println("Tamanho do nome digitado: "+tamanho);
        
// O caractere armazenado na posição 3 do nome digitado pelo usuário.
        char cp3 = nome2.charAt(3);
        System.out.println("Caractere armazenado na posição 3 do nome digitado: "+cp3);  
        
// Se a letra x está presente no nome digitado pelo usuário.
        int posX = nome2.indexOf('x');
        if (posX != -1)
            System.out.println("A letra x enconta-se na posição "+posX+" do nome.");
        else 
            System.out.println("A letra x não foi encontrada no nome.");
// Se os nomes são iguais ou não, considerando as letras maiúsculas e minúsculas.
        if (nome1.equals(nome2))
            System.out.println("Os nomes são iguais.");
        else
            System.out.println("Os nomes são diferentes.");
// Os dois nomes em ordem alfabética, desconsiderando as letras maiúsculas e minúsculas.
        System.out.println("Nomes em ordem alfabética:");
        if (nome1.compareToIgnoreCase(nome2)< 0){
            System.out.println(nome1);
            System.out.println(nome2);
        }
        else { 
            System.out.println(nome2);
            System.out.println(nome1);
        }
// O nome digitado pelo usuário toda em caixa alta.
        String nomeCA = nome2.toUpperCase();
        System.out.println("Nome digitado em caixa alta: "+nomeCA);
// O nome digitado pelo usuário toda em caixa baixa.
        String nomeCB = nome2.toLowerCase();
        System.out.println("Nome digitado em caixa baixa: "+nomeCB);
// A parte do nome definido como constante que fica entre as posições 9 e 13.
        String sub = nome1.substring(9, 14);
        System.out.println("Substring das posições 9 a 13: "+sub);
    } 
}
