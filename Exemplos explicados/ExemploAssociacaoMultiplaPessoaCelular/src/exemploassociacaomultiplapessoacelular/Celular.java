package exemploassociacaomultiplapessoacelular;


public class Celular {
    private String cor;
    private int codigoUnico;

    public Celular() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(int codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    @Override
    public String toString() {
        return "Celular{" + "cor=" + cor + ", codigoUnico=" + codigoUnico + '}';
    }
    
    
    
}
