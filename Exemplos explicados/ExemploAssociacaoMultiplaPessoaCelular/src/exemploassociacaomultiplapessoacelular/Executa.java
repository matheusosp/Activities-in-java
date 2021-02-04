package exemploassociacaomultiplapessoacelular;

import java.util.ArrayList;


public class Executa {

    
    public static void main(String[] args) {
    
        ArrayList<Celular> listaCelular = new ArrayList();

        Celular celular1 = new Celular();
        celular1.setCor("verde");
        celular1.setCodigoUnico(1234);
        listaCelular.add( celular1 );
        
        Celular celular2 = new Celular();
        celular2.setCor("vermelho");
        celular2.setCodigoUnico(4567);
        listaCelular.add( celular2 );


        Pessoa pessoa = new Pessoa("Maria",60);
        
        pessoa.associaListaCelular( listaCelular );
        
        System.out.println( pessoa.toString() );
    }
    
}
