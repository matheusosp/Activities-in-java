package exercicio18_calculadorabasica;


public class Calculadora {
    private float valor1;
    private float valor2;
    private float resultado;
    private char operacao;

    public Calculadora(float valor1, float valor2, char operacao) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operacao = operacao;
    }
    
    public Calculadora(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    private float soma() {
        return this.resultado = this.valor1 + this.valor2;
    }
    
    private float subtracao() {
        return this.resultado = this.valor1 - this.valor2;
    }
    
    private float multiplica() {
        return this.resultado = this.valor1 * this.valor2;
    }
    
    private float divisao() {
        return this.resultado = this.valor1 / this.valor2;
    }
    
    private float restoDivisao() {
        return this.resultado = this.valor1 % this.valor2;
    }
    
    public void executa() {
        switch ( this.operacao ) {
            case '+' : soma(); break;
            case '-' : subtracao(); break;
            case '*' : multiplica(); break;
            case '/' : divisao(); break;
            case '%' : restoDivisao(); break;
        }
    }
    
    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public char getOperacao() {
        return operacao;
    }

    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "valor1=" + valor1 + ", valor2=" + valor2 + ", resultado=" + resultado + ", operacao=" + operacao + '}';
    }
    
    
    

    
}
