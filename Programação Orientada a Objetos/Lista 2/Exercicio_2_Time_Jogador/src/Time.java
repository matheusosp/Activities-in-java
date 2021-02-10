
import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Jogador> listaJogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Jogador> getListaJogadores() {
        return listaJogadores;
    }

    public void associaListaJogadores(ArrayList<Jogador> listaJogadores) {
        this.listaJogadores = listaJogadores;
    }

    @Override
    public String toString() {
        return "Time{" + "nome=" + nome + ", listaJogadores=" + listaJogadores + '}';
    }
    
    
    
}
