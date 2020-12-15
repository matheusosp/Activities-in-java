package exercicio19_banco;


public class Executa {

    
    public static void main(String[] args) {
        Cliente cliente = new Cliente(400);
        cliente.calculaValorCredito();
        
        System.out.println( cliente.toString() );
    }
    
}
