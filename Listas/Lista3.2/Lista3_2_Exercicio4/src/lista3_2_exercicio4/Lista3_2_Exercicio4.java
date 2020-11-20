package lista3_2_exercicio4;

import java.util.Scanner;

public class Lista3_2_Exercicio4 {

public static void main(String[] args) {      
        Scanner input = new Scanner(System.in);
        int i, idade, cont18=0, soma170=0, cont170=0,  cont20=0;
        double altura, media170, soma20=0, media20;
       
        for (i=1;i<=5;i++){
        //Entrada de dados
            System.out.print("Digite a idade do aluno "+i+": ");
            idade = Integer.valueOf(input.nextLine());
            System.out.print("Digite a altura do aluno "+i+": ");
            altura = Double.valueOf(input.nextLine());
        //Processamento dos dados
            if (idade < 18){
                cont18 = cont18 + 1;
            }
            else {
                if (idade > 20){
                    soma20 = soma20 + altura;
                    cont20 = cont20 + 1;
                }
            }
            if (altura < 1.70){
                soma170 = soma170 + idade;
                cont170 = cont170 + 1;
            }
           
        }
        media170 = (double) soma170 / cont170;
        media20 = soma20 / cont20;
        
        //Saída de dados
        System.out.println("Quantidade de alunos com menos de 18 anos de idade: "+cont18);
        System.out.println("Idade média dos alunos com menos de 1.7m: "+media170);
        System.out.println("Altura média dos alunos com mais de 20 anos: "+media20);
    }    
}
