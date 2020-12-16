package prova1ex7;
public class Banco {
    private float saque;
    private float deposito;
    private float saldo;
    private float impostoSaque;
    
    public Banco() {
        this.saldo = 100;
    }

    public Banco(float saque, float deposito) {
        this.saque = saque;
        this.deposito = deposito;
        this.saldo = 100;
    }

    public void Deposito(float deposito) {
        setSaldo(this.saldo+deposito);
        this.deposito = deposito;
    }
    public void Saque(float saque) {
        calculaImposto(saque);
        setSaldo(saldo - saque - impostoSaque);
        this.saque = saque;
    }
    private void calculaImposto(float saque) {
        impostoSaque = saque*25/100;
    }
    
    
    public float getSaque() {
        return saque;
    }

    public float getDeposito() {
        return deposito;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Banco{" + "saque=" + saque + ", deposito=" + deposito + ", saldo=" + saldo + ", impostoSaque=" + impostoSaque + '}';
    }
}
