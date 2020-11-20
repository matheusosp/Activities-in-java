/*
Exemplo 5.5. Quais valores serão apresentados na tela após a execução do código abaixo:
 */
package un5exemplo5;

public class Un5Exemplo5 {

    static void metodo1(int[] x){
        System.out.println(x[0]);
        x[0] = 10;
        System.out.println(x[0]);
    }
    
    public static void main(String[] args) {
        int x[] = {5};
        System.out.println(x[0]);
        metodo1(x);
        System.out.println(x[0]); 
    }
    
}
