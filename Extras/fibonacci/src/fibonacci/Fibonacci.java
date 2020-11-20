package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int atual=1,ultimo=1, penultimo = 0,n,i;
        System.out.println("Digite um numero inteiro:(entre 3 e 20) ");
        n=Integer.valueOf(input.nextLine());
        if(n<3 || n >20 ){
            System.out.println("Digite outro numero");
            n=Integer.valueOf(input.nextLine());
        }else{
        for(i=0;i<n-2;++i){
        atual=ultimo+penultimo;
            System.out.println(atual);
        penultimo = ultimo;
        ultimo=atual;           
        }
            System.out.println("o enésimo termo é "+atual);
    }}}
    

