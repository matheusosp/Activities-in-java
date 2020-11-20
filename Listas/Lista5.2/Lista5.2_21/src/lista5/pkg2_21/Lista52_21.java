package lista5.pkg2_21;
import java.util.Scanner;
public class Lista52_21 {
    
    static String ler(Scanner input){
        System.out.print("Digite o CPF: ");
        return input.nextLine();
    } 

    static boolean validarCPF(String A){
        String Character9=Character.toString(A.charAt(9));
        String Character10=Character.toString(A.charAt(10));
        int digito9=Integer.parseInt(Character9);
        int digito10=Integer.parseInt(Character10);
        int j=10;
        double mult=0;
        int soma=0;
        for(int i=0;i<9;i++){
            String caracter=Character.toString(A.charAt(i));
            mult=Integer.parseInt(caracter)*j;
            soma+=mult;
            j--;
        }
        soma=soma%11;
        int digitook;
        boolean etapa1=false;
        boolean etapa2=false;
        if (soma==0 || soma==1){
            digitook=0;
            etapa1 = digito9==digitook;          
        }else{
            digitook=11-soma;
            etapa1=digito9==digitook;           
        }
        System.out.println(digitook);
        System.out.println(digito9);
        j=11;
        soma=0;
        for(int i=0;i<9;i++){
            String caracter=Character.toString(A.charAt(i));
            mult=Integer.parseInt(caracter)*j;
            soma+=mult;
            j--;
        } 
        soma+=(digitook*2);
        soma=soma%11;
        if (soma==0 || soma==1){
            digitook=0;
            etapa2 = digito10==digitook;          
        }else{
            digitook=11-soma;
            etapa2=digito10==digitook;           
        } 
        System.out.println(digitook);
        System.out.println(digito10);
        return etapa1 && etapa2;
    } 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A=ler(input);
        boolean valida=validarCPF(A);
        if (valida==true){
            System.out.println("O CPF é valido");
        }else{
            System.out.println("O CPF não é valido");
        }
    }

}
