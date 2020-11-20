package menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        char n;
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("1 – Inclusão de cliente.");
        System.out.println("2 – Alteração de cliente.");
        System.out.println("3 – Exclusão de cliente.");
        System.out.println("4 – Visualização de cliente.");
        System.out.println("5 – Sair.");
        System.out.println("Digite um numero");
        n=input.nextLine().charAt(0);
        if(n=='5'){
          System.out.println("Voce selecionou a opção 5 – Sair.");
        }
        else {
          switch(n){
          case '1': System.out.println("Voce selecionou a opção 1 – Inclusão de cliente.");
          break;
          case '2': System.out.println("Voce selecionou a opção 2 – Alteração de cliente.");
          break;
          case '3': System.out.println("Voce selecionou a opção 3 – Exclusão de cliente.");
          break;        
          case '4': System.out.println("Voce selecionou a opção 4 – Visualização de cliente.");
          break;        
          default:System.out.println("Opção invalida");
          }}}while(n!='5');
        
       } 
    }
    

