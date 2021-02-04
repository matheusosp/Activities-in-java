package exemploassociacaomultiplapessoacelular;


public class Executa {

    
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.setCor("verde");
        celular.setCodigoUnico(1234);
        
        Pessoa pessoa = new Pessoa("Maria",60);
        
        // associação simples entre pessoa e celular
        pessoa.associaCelular( celular );
        
        System.out.println( pessoa.toString() );
        
    }
    
}
