package exemplocarro;

public class Executa {

    public static void main(String[] args) {
        Carro  carro1 = new Carro(); 
        carro1.setMarca("Fiat");
        carro1.setPeso(2500);
           
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();
        
        System.out.println( carro1.getMarca() );
        
        System.out.println( carro1.toString() ); // carro1 qual é o seu estado
    }
    
}
