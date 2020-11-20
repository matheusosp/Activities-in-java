/*
9) O voo de uma empresa aérea possui escala em cinco cidades (A, B, C, D e E). Faça
um programa que leia a quantidade de passageiros presentes no voo, o nome e a cidade
de destino de cada um deles. Por fim, o programa deve imprimir uma lista para cada
cidade, com o nome dos passageiros que a tem como destino.
 */
package un5atividade3;

import java.util.Scanner;

public class Un5Atividade3 {
    static int leiaDados(Scanner input, int n, String[] nom, char[] dest){
        for (int i=0;i<n;i++){
            System.out.print("Digite o nome do passageiro "+i+": ");
            nom[i] = input.nextLine();
            System.out.print("Digite o destino do passageiro "+nom[i]+": ");
            dest[i] = input.nextLine().charAt(0);
        }
        return n;
    }

    static void imprimaLista(int qp,String[] no, char[] de, char cidade){
        System.out.println("Passageiros com destino a cidade "+cidade);
        for (int i=0;i<qp;i++){
            if (de[i]==cidade){    
                System.out.println(no[i]);
            }
                    
        }
    }
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de passageiros no voo: ");
        int n = Integer.valueOf(input.nextLine());
        String[] nomes = new String[n];
        char [] destinos = new char[n];
        leiaDados(input, n, nomes, destinos);
        imprimaLista(n,nomes,destinos,'A');
        imprimaLista(n,nomes,destinos,'B');
        imprimaLista(n,nomes,destinos,'C');
        imprimaLista(n,nomes,destinos,'D');
        imprimaLista(n,nomes,destinos,'E');
    }
    
}
