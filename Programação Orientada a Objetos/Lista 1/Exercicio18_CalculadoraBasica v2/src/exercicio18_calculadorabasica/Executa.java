package exercicio18_calculadorabasica;


public class Executa {

   
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10,6,'/');
        
        calc.executa();
        
        System.out.println( calc.toString() );
    }
    
}
