/*
Exemplo 5.4. Quais valores serão apresentados na tela após a execução do código
abaixo:
 */
package un5exemplo4;

/**
 *
 * @author Castelo
 */
public class Un5Exemplo4 {


    static void metodo1(int x){
        System.out.println(x);
        x = 10;
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        int x = 5;
        
        System.out.println(x);
        metodo1(x);
        System.out.println(x);
        
    }
    
}
