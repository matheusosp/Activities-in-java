package exemplocarro;

public class Carro {
    float peso;
    String marca;
    int totalMarchas;
    float velocidadeFinal;
    float velocidadeAtual;
    String placa;
    
    public Carro() {
        peso = 0;
        marca = "sem marca";
        totalMarchas = 0;
        velocidadeFinal = 0;
        velocidadeAtual = 0;
        placa = "Sem placa";
    }
    
     public Carro(float peso, String marca, int totalMarchas, float velocidadeFinal,
                float velocidadeAtual, String placa) {
        this.peso = peso;
        this.marca = marca;
        this.totalMarchas = totalMarchas;
        this.velocidadeFinal = velocidadeFinal;
        this.velocidadeAtual = velocidadeAtual;
        this.placa = placa;
    }
    
    public void frear() {
        velocidadeAtual = velocidadeAtual - 10;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }
    
    public void acelerar() {
        velocidadeAtual = velocidadeAtual + 5;
    }
    
    public void parar() {
        velocidadeAtual = 0;
    }

    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTotalMarchas() {
        return totalMarchas;
    }

    public void setTotalMarchas(int totalMarchas) {
        this.totalMarchas = totalMarchas;
    }

    public float getVelocidadeFinal() {
        return velocidadeFinal;
    }

    public void setVelocidadeFinal(float velocidadeFinal) {
        this.velocidadeFinal = velocidadeFinal;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    @Override
    public String toString() { // se mostre objeto
        return "Carro{" + "peso=" + peso + ", marca=" 
                + marca + ", totalMarchas=" + totalMarchas + ", velocidadeFinal=" + velocidadeFinal + ", velocidadeAtual=" + velocidadeAtual + ", placa=" + placa + '}';
    }
    
    
}
