package exercicio11_automovel;

public class Automovel {
    private String marca;
    private float kmInicial;
    private float kmFinal;
    private float capacidadeTanque;
    private float consumoMedio;
    private float litrosConsumidos;
    private float autonomia;

    public Automovel(String marca, float kmInicial, float kmFinal, 
            float capacidadeTanque, float litrosConsumidos) {
        this.marca = marca;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.capacidadeTanque = capacidadeTanque;
        this.consumoMedio = 0;
        this.litrosConsumidos = litrosConsumidos;
        this.autonomia = 0;
    }
    
    public void calculaConsumoMedio() {
        float percurso = this.kmFinal - this.kmInicial;
        this.consumoMedio = percurso / this.litrosConsumidos;
    }
    
    public void calculaAutonomia() {
        float sobraTanque = this.capacidadeTanque - this.litrosConsumidos;
        this.autonomia = this.consumoMedio * sobraTanque;
    }
        
    
    public float getAutonomia() {
        return this.autonomia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(float kmInicial) {
        this.kmInicial = kmInicial;
    }

    public float getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(float kmFinal) {
        this.kmFinal = kmFinal;
    }

    public float getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(float capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public float getConsumoMedio() {
        return consumoMedio;
    }

    public float getLitrosConsumidos() {
        return litrosConsumidos;
    }

    public void setLitrosConsumidos(float litrosConsumidos) {
        this.litrosConsumidos = litrosConsumidos;
    }

    @Override
    public String toString() {
        return "Automovel{" + "marca=" + marca + ", kmInicial=" + kmInicial + ", kmFinal=" + kmFinal + ", capacidadeTanque=" + capacidadeTanque + ", consumoMedio=" + consumoMedio + ", litrosConsumidos=" + litrosConsumidos + ", autonomia=" + autonomia + '}';
    }

   
}