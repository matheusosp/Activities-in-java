package exercicio13_diasvividos;

import java.time.LocalDate;
import java.util.Scanner;


public class Executa {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com nome: ");
        String nome = entrada.nextLine();
        
        LocalDate dataNascimento = LocalDate.of(2019, 12, 9);
        LocalDate dataAtual = LocalDate.of(2020, 12, 9);
        
        Pessoa pessoa = new Pessoa(nome, dataNascimento, dataAtual);
        
        pessoa.calculaDiasVividos();
        
        System.out.println( pessoa.toString() );
        
    }
    
}
