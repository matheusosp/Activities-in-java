package exercicio10_produto_versao_2;

import java.util.Scanner;


public class Executa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com a quantidade de parafusos: ");
        int quantidadeParafuso = entrada.nextInt();
        
        System.out.println("Entre com o preço unitário do parafusos: ");
        float precoUnitarioParafuso = entrada.nextFloat();
        
        Produto produto = new Produto(precoUnitarioParafuso, quantidadeParafuso, 1, 100, 1, 100);
        produto.calculaCompra();
        
        System.out.println(produto.toString());
    }
    
}
