package exercicio11_automovel;

public class Execucao {

    public static void main(String[] args) {
       
        Automovel automovel = new Automovel("Mercedes", 0, 100, 50, 10);
        
        automovel.calculaConsumoMedio();
        automovel.calculaAutonomia();
        
        System.out.println( automovel.toString() );
        
    }
    
}