package matematicadiscretacombinaraçãonr;
import java.util.Scanner;
public class MatematicadiscretaCombinaraçãonr {
    
    static int fat(int n){
        int fat = 1;
        for (int i=1;i<=n;i++){
            fat = fat*i;
        }
        return fat;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        float n= Float.valueOf(input.nextLine());
        System.out.print("Sigite o valor de R: ");
        float r= Float.valueOf(input.nextLine());
        int r2=fat((int)((int)n-r));
        n=fat((int)n);
        r=fat((int)r);
        System.out.println(n);
        System.out.println(r);
        System.out.println(r2);
        int resultado=(int)(n/(r*r2));
        System.out.println("O resultado é "+resultado);
    }

}
