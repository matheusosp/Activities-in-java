public class Jogador {
    private String nome;
    private String posicao;
    private int nCamisa;

    public Jogador(String nome, String posicao, int nCamisa) {
        this.nome = nome;
        this.posicao = posicao;
        this.nCamisa = nCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getnCamisa() {
        return nCamisa;
    }

    public void setnCamisa(int nCamisa) {
        this.nCamisa = nCamisa;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", posicao=" + posicao + ", nCamisa=" + nCamisa + '}';
    }
    
    
    
}
