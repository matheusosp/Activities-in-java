package exercicio9_funcionario;

public class Funcionario {
    private String nome;
    private float salarioBruto;
    private float salarioLiquido;

    public Funcionario() { 
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        if (salarioBruto < 0) {
            this.salarioBruto = 0;
        } else {
            this.salarioBruto = salarioBruto;
        }
    }

    public float getSalarioLiquido() {
        return salarioLiquido;
    }

    public void calcularSalarioLiquido() {
        
        float descontoPrevidenciaSocial = this.salarioBruto * 10/100;
        float restante = this.salarioBruto - descontoPrevidenciaSocial;
        float imposto = restante * 5/100;
        float totalDesconto = descontoPrevidenciaSocial + imposto;
        
        this.salarioLiquido = this.salarioBruto - totalDesconto;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", salarioBruto=" + salarioBruto + ", salarioLiquido=" + salarioLiquido + '}';
    }
    
}