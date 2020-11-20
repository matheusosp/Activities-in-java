package prova2questao1;

import java.util.Scanner;


public class Prova2Questao1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo, quantidade;
        double valorPago;
        String nome;
        
        System.out.print("Digite o código do produto: ");
        codigo = Integer.valueOf(input.nextLine());
        System.out.print("Digite a quantidade comprada: ");
        quantidade = Integer.valueOf(input.nextLine());
        switch (codigo){
            case 1: nome = "Cachorro quente";
                    valorPago = 8.0 * quantidade;
                    break;
            case 2: nome = "Bauru";
                    valorPago = 9.0 * quantidade;
                    break;
            case 3: nome = "Hamburger";
                    valorPago = 12.0 * quantidade;
                    break;
            case 4: nome = "Cheeseburger";
                    valorPago = 13.0 * quantidade;
                    break;
            case 5: nome = "Refrigerante";
                    valorPago = 5.0 * quantidade;
                    break;
            case 6: nome = "Água";
                    valorPago = 3.0 * quantidade;
                    break;
            default:nome = "Produto inválido";
                    valorPago = 0;
                    break;
        }
        System.out.println("Produto comprado: "+nome);
        System.out.println("Valor gasto: "+valorPago);
    }
    
}
