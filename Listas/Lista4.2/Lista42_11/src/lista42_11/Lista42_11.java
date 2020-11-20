package lista42_11;
import java.util.Scanner;
public class Lista42_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome="matheus Di oliveira de sousa E pereira";
        int j =0,cont=0,i=0;
        String sub,nomeseparado="",sub2,sub3 = "";
        char[] vetor = nome.toCharArray();
        sub = nome.substring(0, 1).toUpperCase();
        vetor[0]=sub.charAt(0);
        for (i=0;i<nome.length();i++){ 
            if(vetor[i]==' '){
                sub=nome.substring(i+1, i+2).toUpperCase();
                vetor[i+1]=sub.charAt(0);
                cont++;
            }
        }    
        for (i=0;i<nome.length();i++){          
            System.out.print(vetor[i]);
        }
        System.out.print(" => "+vetor[0]);
        int cagada=0;
        boolean o;
        cont++;
        String separados[]=new String[cont];
        int c=0;
        for (i=0;i<nome.length();i++){
            if(vetor[i]==' '){
                nomeseparado=nome.substring(cagada, i);
                separados[c]=nomeseparado;
                c++;
                cagada=i;
            }
        }
        nomeseparado=nome.substring(cagada, i);
        separados[c]=nomeseparado;
        for(c=1;c<cont;c++){
            char[] vetor2 = separados[c].toCharArray();
            boolean e=" e".equalsIgnoreCase(separados[c]);
            boolean doo=" do".equalsIgnoreCase(separados[c]);
            boolean da=" da".equalsIgnoreCase(separados[c]);
            boolean dos=" dos".equalsIgnoreCase(separados[c]);
            boolean das=" das".equalsIgnoreCase(separados[c]);
            boolean de=" de".equalsIgnoreCase(separados[c]);
            boolean di=" di".equalsIgnoreCase(separados[c]);
            boolean du=" du".equalsIgnoreCase(separados[c]);
            if(!e && !doo && !da && !dos && !das && !de && !di && !du){      
                sub=separados[c].substring(0, 2).toUpperCase();
                System.out.print(" "+sub.charAt(1));
            }else{
                separados[c]=separados[c].toLowerCase();
            } 
}}}    




