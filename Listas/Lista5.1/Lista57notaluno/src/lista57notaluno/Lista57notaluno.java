package lista57notaluno;
import java.util.Scanner;
public class Lista57notaluno {
    static double nota(Scanner input){
        System.out.print("Digite a nota do aluno: ");
        return Double.valueOf(input.nextLine());
    } 
    
    static String conceito(double nota){
        String conceito=null;
        if (nota<50 && nota >=0){
            conceito="Insuficiente";
        }
        if (nota>=50 && nota<65){
            conceito="Regular";
        }
        if (nota>=65 && nota<85){
            conceito="Bom";
        }
        if (nota>=85 && nota<=100){
            conceito="Ótimo";
        }
        return conceito;
    } 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota=nota(input);
        String conceito= conceito(nota);
        System.out.println("O conceito do aluno é "+conceito);
    }

}
