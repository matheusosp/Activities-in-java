package exercicio10_produto_versao_2;

public class Produto {
    private float precoUnitarioParafuso;
    private int quantidadeParafuso;
    private float precoUnitarioPorca;
    private int quantidadePorca;
    private float precoUnitarioArruela;
    private int quantidadeArruela;
    
    private float totalCompra;

    public Produto(float precoUnitarioParafuso, int quantidadeParafuso, float precoUnitarioPorca, int quantidadePorca, float precoUnitarioArruela, int quantidadeArruela) {
        this.precoUnitarioParafuso = precoUnitarioParafuso;
        this.quantidadeParafuso = quantidadeParafuso;
        this.precoUnitarioPorca = precoUnitarioPorca;
        this.quantidadePorca = quantidadePorca;
        this.precoUnitarioArruela = precoUnitarioArruela;
        this.quantidadeArruela = quantidadeArruela;
        
        this.totalCompra = 0;
    }
    
    public void calculaCompra() {
        float valorParafuso = this.precoUnitarioParafuso * this.quantidadeParafuso;
        float valorParafusoLiquido = valorParafuso * 80/100;
        
        float valorPorca = this.precoUnitarioPorca * this.quantidadePorca;
        float valorPorcaLiquido = valorPorca * 90/100;
        
        float valorArruela = this.precoUnitarioArruela * this.quantidadeArruela;
        float valorArruelaLiquido = valorArruela * 70/100;
        
        this.totalCompra = valorArruelaLiquido + valorPorcaLiquido + valorParafusoLiquido;
    }
    
    public float getTotalCompra() {
        return this.totalCompra;
    }

    public float getPrecoUnitarioParafuso() {
        return precoUnitarioParafuso;
    }

    public void setPrecoUnitarioParafuso(float precoUnitarioParafuso) {
        this.precoUnitarioParafuso = precoUnitarioParafuso;
    }

    public int getQuantidadeParafuso() {
        return quantidadeParafuso;
    }

    public void setQuantidadeParafuso(int quantidadeParafuso) {
        this.quantidadeParafuso = quantidadeParafuso;
    }

    public float getPrecoUnitarioPorca() {
        return precoUnitarioPorca;
    }

    public void setPrecoUnitarioPorca(float precoUnitarioPorca) {
        this.precoUnitarioPorca = precoUnitarioPorca;
    }

    public int getQuantidadePorca() {
        return quantidadePorca;
    }

    public void setQuantidadePorca(int quantidadePorca) {
        this.quantidadePorca = quantidadePorca;
    }

    public float getPrecoUnitarioArruela() {
        return precoUnitarioArruela;
    }

    public void setPrecoUnitarioArruela(float precoUnitarioArruela) {
        this.precoUnitarioArruela = precoUnitarioArruela;
    }

    public int getQuantidadeArruela() {
        return quantidadeArruela;
    }

    public void setQuantidadeArrule(int quantidadeArruela) {
        this.quantidadeArruela = quantidadeArruela;
    }

    @Override
    public String toString() {
        return "Produto{" + "precoUnitarioParafuso=" + precoUnitarioParafuso + ", quantidadeParafuso=" + quantidadeParafuso + ", precoUnitarioPorca=" + precoUnitarioPorca + ", quantidadePorca=" + quantidadePorca + ", precoUnitarioArruela=" + precoUnitarioArruela + ", quantidadeArruela=" + quantidadeArruela + ", totalCompra=" + totalCompra + '}';
    }
    
    
    
}
