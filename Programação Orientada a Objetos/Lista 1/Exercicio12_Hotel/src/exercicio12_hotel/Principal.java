package exercicio12_hotel;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Entre com nome: ");
        String nome = entradaDados.nextLine();
        System.out.println("Entre com ano: ");
        int ano = entradaDados.nextInt();
        System.out.println("Entre com mês: ");
        int mes = entradaDados.nextInt();
        System.out.println("Entre com dia: ");
        int dia = entradaDados.nextInt();
        System.out.println("Entre com número de dias: ");
        int numeroDias = entradaDados.nextInt();
        
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        
        Cliente cliente1 = new Cliente(nome, dataNascimento, numeroDias);
        
        cliente1.calculaTotalConta();
        
        System.out.println( cliente1.toString() );
        
    }
    
}
