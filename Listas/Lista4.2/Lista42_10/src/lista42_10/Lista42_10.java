package lista42_10;
import java.util.Scanner;
public class Lista42_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont;
        char resposta[]=new char[10];
        System.out.println("Insira a resposta a cada uma das 10 Quetões ");
        for(cont=0;cont<10;cont++){
            System.out.print("Resposta da questao "+(cont+1)+" é: ");
            resposta[cont]= input.nextLine().charAt(0);
        }
        int i,j;
        System.out.println("Quantos alunos fizeram a prova? ");
        String alunos[]=new String[Integer.valueOf(input.nextLine())];
        char respostasalunos[][]= new char[alunos.length][10];
        for(i=0;i<alunos.length;i++){
            System.out.println("Digite o nome do aluno "+(i+1));   
            alunos[i]=String.valueOf(input.nextLine());
            for(j=0;j<10;j++){
                System.out.println("Resposta do aluno "+alunos[i]+" na questão"+(j+1)+" foi: ");
                respostasalunos[i][j]=input.nextLine().charAt(0);
            }
        }
        for (i = 0; i < alunos.length; i++) {
            System.out.println("Aluno "+alunos[i]+" respondeu ");
            for (j = 0; j < 10; j++) {
                System.out.print(" "+respostasalunos[i][j]);
            }
              System.out.println(" ");
        }
        for (i = 0; i < alunos.length; i++) {
            cont=0;
            for (j = 0; j < 10; j++) {
                if(respostasalunos[i][j]==resposta[j])
                    cont++;
            }
            System.out.println("Quatidade de acertos do aluno  "+alunos[i]+" : "+cont);
        } 
    }
}
