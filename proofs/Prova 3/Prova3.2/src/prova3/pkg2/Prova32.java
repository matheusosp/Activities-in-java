package prova3.pkg2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Prova32 {
    int index;
    public static void ler(Scanner input,int []pai){
        for(int i=0;i<pai.length;i++){       
            System.out.print("Digite o cromossomo na posição "+i+": ");
            pai[i] = Integer.valueOf(input.nextLine());         
       }    
    }

    public static void resultado(int [] filho){
        System.out.println(Arrays.toString(filho));
    }
    public static void gerarfilho(int []pai1,int [] pai2,int x){
        int i=1;
        int filho[]=new int[8];
        while(i!=x){
            filho[i]=pai1[i];
            i++;
        }
        while(i<8){
            filho[i]=pai2[i];
            i++;
        }
        resultado(filho);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pai1[]=new int[8];
        int pai2[]=new int[8];
        System.out.println("Digite o dados do cromossomo do pai 1 ");
        ler(input,pai1);
        System.out.println("Digite o dados do cromossomo do pai 2 ");
        ler(input,pai2);
        Random random = new Random();
        int x = random.nextInt(8);
        x=4;
        int index = 0,i=0;
        while(pai1[i]!=x){          
            i++;
            index=i;
        }        
        System.out.println(index);
        System.out.print("Filho 1: ");
        gerarfilho(pai1,pai2,x);
        System.out.print("Filho 2: ");
        gerarfilho(pai2,pai1,x);
    }

}
