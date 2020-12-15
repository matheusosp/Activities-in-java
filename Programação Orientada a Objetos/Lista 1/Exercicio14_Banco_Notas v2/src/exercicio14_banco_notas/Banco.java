
package exercicio14_banco_notas;


public class Banco {
    private int notas10;
    private int notas5;
    private int notas1;
    private float totalCompra;
    private float totalPago;
    private int troco;

   

    public Banco(float totalCompra, float totalPago) {
        this.totalCompra = totalCompra;
        this.totalPago = totalPago;
    }
    
    public void calculaNotas() {
        this.troco = (int) (this.totalPago - this.totalCompra);
        
        this.notas10 = troco / 10;
        int resto10 = troco % 10; // resto da divisão
        this.notas5 = resto10 / 5;
        this.notas1 = resto10 % 5;
        
    }
    
     public int getTroco() {
        return troco;
    }

    public void setTroco(int troco) {
        this.troco = troco;
    }

    public int getNotas10() {
        return notas10;
    }

    public void setNotas10(int notas10) {
        this.notas10 = notas10;
    }

    public int getNotas5() {
        return notas5;
    }

    public void setNotas5(int notas5) {
        this.notas5 = notas5;
    }

    public int getNotas1() {
        return notas1;
    }

    public void setNotas1(int notas1) {
        this.notas1 = notas1;
    }

    public float getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(float totalCompra) {
        this.totalCompra = totalCompra;
    }

    public float getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(float totalPago) {
        this.totalPago = totalPago;
    }

    @Override
    public String toString() {
        return "Banco{" + "notas10=" + notas10 + ", notas5=" + notas5 + ", notas1=" + notas1 + ", totalCompra=" + totalCompra + ", totalPago=" + totalPago + ", troco=" + troco + '}';
    }
    
    
    
}
