package exemploassociacaomultiplapessoacelular;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private float peso;
    
    private ArrayList<Celular> listaCelular;


    public Pessoa(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public ArrayList<Celular> getListaCelular() {
        return listaCelular;
    }

    public void associaListaCelular(ArrayList<Celular> listaCelular) {
        this.listaCelular = listaCelular;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", peso=" + peso + ", celular=" + 
                listaCelular + '}';
    }
    
    
    
}
