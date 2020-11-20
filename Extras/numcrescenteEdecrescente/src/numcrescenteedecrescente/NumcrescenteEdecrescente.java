package numcrescenteedecrescente;
import java.util.Arrays;
import java.util.Scanner;
public class NumcrescenteEdecrescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int line = input.nextInt();
    int num [] = new int[line];
    for (int i=0;i<line;i++){
      num[i] = input.nextInt();
    }
    Arrays.sort(num);
    int len = 0;
    for (int i=0;i<line;i++){
      if(num[i] % 2 == 0){
        System.out.println(num[i]);
      }else{
        len++;
      }
    }
    int impar []= new int[len];
    int j = 0;
    for (int i=0;i<line;i++){
      if(num[i] % 2 != 0){
        impar[j] = num[i];
        j++;
      }
    }
    for (int i=len-1;i>=0;--i){
      System.out.println(impar[i]);
    }
    }

}
