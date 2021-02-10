
import java.util.ArrayList;
import java.util.Scanner;

public class Executa {

   
    public static void main(String[] args) {
        
        Time time = new Time("T1");
        
        ArrayList<Jogador> listaJogadores = new ArrayList();
        
        for (int i = 0; i < 4; i++) {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Nome: ");
            String nome = leitura.next();
            
            System.out.println("Posição: ");
            String posicao = leitura.next();
            
            System.out.println("Camisa: ");
            int nCamisa = leitura.nextInt();
            
            Jogador jogador = new Jogador(nome,posicao,nCamisa);
            listaJogadores.add( jogador );
        }
        time.associaListaJogadores( listaJogadores );
       
        
        // a) foreach
        for (Jogador jogador : time.getListaJogadores()) {
            System.out.println("a)" + jogador.toString() );
        }
        // tradicional
        int n = time.getListaJogadores().size();
        for(int i = 0; i < n; i++) {
            Jogador j = time.getListaJogadores().get(i);
            System.out.println("a)" + j.toString() );
        }
        
        // b)
        System.out.println("b) Total de jogadores: " + time.getListaJogadores().size());
        
        // c)
        for (Jogador jogador : time.getListaJogadores()) {
            if ( jogador.getPosicao().equals("Atacante") ) {
                System.out.println("c) Atacante: " + jogador.toString() );
            }
        }
        
        // d)
        Jogador j = time.getListaJogadores().get(3);
        System.out.println("d)" + j.toString());
    }
    
}
