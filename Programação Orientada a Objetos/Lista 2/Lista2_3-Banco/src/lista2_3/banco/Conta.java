package lista2_3.banco;
public class Conta {
    
    public int numeroConta;
    private double saldo;
    private double credito;
    private String nome;

    public Conta(int numeroConta,double saldo, double credito, String nome){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.credito = credito;
        this.nome = nome;
    }
    public boolean Sacar(double valorSaque){
        System.out.println("Sacar ");
        if(this.saldo - valorSaque < (this.credito*-1)){
            System.out.printf("Saldo Insuficiente!");
            return false;
        }
        this.saldo -= valorSaque;
        System.out.println("Saldo atual da conta de "+this.nome+" é "+this.saldo);
        return true;
    }

    public void Depositar(double valorDeposito){
        this.saldo += valorDeposito;
        System.out.println("Saldo atual da conta de "+this.nome+" é "+this.saldo);
    }

    public void Transferir(double valorTransferencia, Conta contaDestino){
        if(this.Sacar(valorTransferencia)){
            contaDestino.Depositar(valorTransferencia);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString() {
        return "Conta{" + "numeroConta=" + numeroConta + ", saldo=" + saldo + ", credito=" + credito + ", nome=" + nome + '}';
    }

           
}
