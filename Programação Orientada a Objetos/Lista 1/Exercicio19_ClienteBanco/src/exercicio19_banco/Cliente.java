package exercicio19_banco;

public class Cliente {
    private float saldoMedio;
    private float valorCredito;
    
    public Cliente(float saldoMedio) {
        this.saldoMedio = saldoMedio;
    }
    
    public void calculaValorCredito() {
        if (this.saldoMedio >= 0 && this.saldoMedio <= 200) {
            this.valorCredito = 0;
        } else {
            if (this.saldoMedio >= 201 && this.saldoMedio <= 400) {
                this.valorCredito = this.saldoMedio * 20/100;
            } else {
                if (this.saldoMedio >= 401 && this.saldoMedio <= 600) {
                    this.valorCredito = this.saldoMedio * 30/100;
                } else {
                    if (this.saldoMedio >= 601) {
                       this.valorCredito = this.saldoMedio * 40/100; 
                    }
                }
            }
        }
    }

   
 
    public float getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(float saldoMedio) {
        this.saldoMedio = saldoMedio;
    }

    public float getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(float valorCredito) {
        this.valorCredito = valorCredito;
    }

     @Override
    public String toString() {
        return "Cliente{" + "saldoMedio=" + saldoMedio + ", valorCredito=" + valorCredito + '}';
    }
    
}
