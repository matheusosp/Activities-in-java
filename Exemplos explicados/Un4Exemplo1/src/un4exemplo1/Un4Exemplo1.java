package un4exemplo1;
import java.util.Scanner;
public class Un4Exemplo1 {        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        double [] numeros = new double[20];
        double soma=0, media;
        int cont=0;
        for (int i=0;i<=19;i++){
            System.out.print("Digite o número "+i+" : ");
            numeros[i] = Integer.valueOf(input.nextLine());
            soma = soma + numeros[i];
        }
        media = soma / 20;
        for (int i=0;i<=19;i++){
           if (numeros[i]>= media){
               cont = cont + 1;
           }
        }
        System.out.println("Média dos números: "+media);
        System.out.println("Números maiores ou igual a média: "+cont);
    }
    
}
