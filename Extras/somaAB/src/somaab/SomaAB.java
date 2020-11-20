package somaab;

import java.util.Scanner;

public class SomaAB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] A = new int[10];
        int [] B = new int[10];
        int [] C = new int[10];
        int i;
        for (i=0;i<=3;i++){
        System.out.print("Digite 10 numeros para A: ");
        A[i] = Integer.valueOf(input.nextLine());
        System.out.print("Digite 10 numeros para B: ");
        B[i] = Integer.valueOf(input.nextLine());
        C[i]=A[i]+B[i];
        }        
        for(i=0;i<=9;i++){
        System.out.print(" "+A[i]);
        System.out.print("+"+B[i]);
        System.out.print(" = "+C[i]+"\n");
        }
    }
    
}
