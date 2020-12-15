package exercicio17_funcionario_salario;

public class Funcionario {
    private String nome;
    private float salario;
    private char categoria;
    private float salarioNovo;

    public Funcionario(String nome, float salario, char categoria) {
        this.nome = nome;
        this.salario = salario;
        this.categoria = categoria;
    }
    
    public void determinaSalarioNovo() {
        
        switch ( this.categoria )
	{	
	  case 'A', 'C', 'F', 'H': 
			this.salarioNovo = this.salario + this.salario*10/100;
			break;     
	  case 'B', 'D', 'E', 'I', 'J', 'T':
			this.salarioNovo = this.salario + this.salario*5/100;
			break;     
          case 'K', 'R':
			this.salarioNovo = this.salario + this.salario*25/100;
			break;
          case 'L', 'M', 'N', 'O', 'P', 'Q', 'S':
			this.salarioNovo = this.salario + this.salario*35/100;
			break;
          case 'U', 'V', 'X', 'Y', 'W','Z':
			this.salarioNovo = this.salario + this.salario*50/100;
			break;
	}

    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public float getSalarioNovo() {
        return salarioNovo;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", salario=" + salario + ", categoria=" + categoria + ", salarioNovo=" + salarioNovo + '}';
    }

    
    
    
}
