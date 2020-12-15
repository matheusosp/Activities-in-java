package exercicio16_pessoaimc;


public class Executa {

    
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Alexandre", 69.9f, 1.68f);
        pessoa1.determinaClassificacao();
        
        System.out.println( pessoa1.toString() );
        
        Pessoa pessoa2 = new Pessoa("Alexandre", 89.9f, 1.50f);
        pessoa2.determinaClassificacao();
        
        System.out.println( pessoa2.toString() );
        
    }
    
}
