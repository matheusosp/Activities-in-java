package contato;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList();
        Contato contato1 = new Contato("Romário","49999999");
        contatos.add( contato1 ); 
        Contato contato2 = new Contato("Romário2","45645376");
        contatos.add( contato2 ); 
        System.out.println("Tamanho da lista: "+contatos.size());
        contatos.forEach(System.out::println);
        System.out.println("----------");
        System.out.println(contatos.get(1));
        System.out.println("----------");
        System.out.println("Lista vazia? "+ contatos.isEmpty());
        System.out.println("----------");
        contatos.remove(0);
        contatos.forEach(System.out::println);
        System.out.println("----------");
        contatos.add(0, contato2);
        contatos.forEach(System.out::println);
        System.out.println("----------");
        Contato contato3 = new Contato("Romário3","59281");
        contatos.add( contato3 ); 
        Contato contato4 = new Contato("Romário4","814818");
        contatos.add( contato4 ); 
        contato4.setName("Ana");
        contato4.setPhone("123456");
        for (Contato contato : contatos) {  
            System.out.println(contato);
        }

    }

}
