package lista3_3_exercicio5;

import java.util.Scanner;

/*5) Faça um programa que funcione de forma semelhante a um menu. 
O programa deve apresentar as opções abaixo na tela e solicitar que o usuário 
digite a opção desejada:

1 – Inclusão de cliente.
2 – Alteração de cliente.
3 – Exclusão de cliente.
4 – Visualização de cliente.
5 – Sair.

Quando o usuário digitar um valor entre 1 e 4, o programa deve apresentar uma 
mensagem na tela com a função selecionada e apresentar o menu novamente. Se o 
usuário digitar 5, o programa deve ser encerrado. Se o usuário digitar qualquer
outro valor, o programa deve mostrar a mensagem "Opção inválida" e apresentar o
menu novamente.
*/
public class Lista3_3_Exercicio5 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        
        do {
            System.out.println("************************");
            System.out.println("1 – Inclusão de cliente.");
            System.out.println("2 – Alteração de cliente.");
            System.out.println("3 – Exclusão de cliente.");
            System.out.println("4 – Visualização de cliente.");
            System.out.println("5 – Sair.");
            System.out.println("************************");
            System.out.println("Digite a opção desejada: ");
            op = Integer.valueOf(input.nextLine());
            switch (op) {
                case 1: System.out.println("Você escolheu: 1 – Inclusão de cliente.");
                        break;
                case 2: System.out.println("Você escolheu: 2 – Alteração de cliente.");
                        break;
                case 3: System.out.println("Você escolheu: 3 – Exclusão de cliente.");
                        break;
                case 4: System.out.println("Você escolheu: 4 – Visualização de cliente.");
                        break;
                case 5: break;
                default: System.out.println("Opção inválida.");
            }                       
        } while (op!=5);   
    }
    
}
