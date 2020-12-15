package exercicio17_funcionario_salario;


public class Executa {

    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Pedro", 100, 'U');
        funcionario.determinaSalarioNovo();
        System.out.println( funcionario.toString() );
        
        Funcionario funcionario1 = new Funcionario("Ana", 100, 'F');
        funcionario1.determinaSalarioNovo();
        System.out.println( funcionario1.toString() );
    }
    
}
