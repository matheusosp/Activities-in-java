package exemploassociacaomultiplapessoacelular;


public class Pessoa {
    private String nome;
    private float peso;
    
    private Celular celular;

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

    public Celular getCelular() {
        return celular;
    }

    public void associaCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", peso=" + peso + ", celular=" + celular + '}';
    }
    
    
    
}
