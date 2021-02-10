import java.util.ArrayList;
import java.util.Scanner;

public class Execucao {

    public static void main(String[] args) {
        ArrayList<Contato> listaContatos = new ArrayList();
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos contatos você possui:");
        int totalContatos = entrada.nextInt();
        
        for (int i = 0; i < totalContatos; i++) {
            
            System.out.println("Informe o nome:");
            String nome = entrada.next();
            
            System.out.println("Informe o telefone:");
            String telefone = entrada.next();
            
            Contato contato = new Contato(nome,telefone);
            listaContatos.add( contato );
        }
        
        // a) 
        System.out.println("a) Total de contatos: " + listaContatos.size());
        
        // b)
        System.out.println("b) Contatos armazenados: " + listaContatos.toString());
        
        // c)
        Contato c = listaContatos.get(1);
        System.out.println("c) Segundo contato: " + c.toString());
        System.out.println("c) Segundo contato: " + listaContatos.get(1).toString());
        
        // d)
        if ( listaContatos.isEmpty() ) {
            System.out.println("d) lista vazia!");
        } else {
            System.out.println("d) lista não vazia!");
        }
        
        // e)
        listaContatos.remove(0);
        System.out.println("e) primeiro contato removido!");
        
        // f) 
        Contato contatoNovo = new Contato("Novo","0000");
        listaContatos.add(0, contatoNovo );
        System.out.println("f) Novo contato na 1a posição");
        System.out.println( listaContatos.toString() );
        
        // g)
        Contato contato1 = new Contato("Ana","12345");
        listaContatos.set(3, contato1);
        System.out.println("g) " + listaContatos.toString() );
    }
    
}