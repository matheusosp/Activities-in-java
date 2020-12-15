package exercicio14_banco_notas;

public class Executa {

    public static void main(String[] args) {
        Banco banco = new Banco(100,216);
        banco.calculaNotas();
        
        System.out.println(banco.toString());
    }
    
}
