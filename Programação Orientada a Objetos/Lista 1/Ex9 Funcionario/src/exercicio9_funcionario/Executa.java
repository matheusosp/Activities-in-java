package exercicio9_funcionario;

import javax.swing.JOptionPane;


public class Executa {

    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 2; i++) {
            Funcionario funcionario = new Funcionario();
            
            String nome = JOptionPane.showInputDialog("Informe o nome: ");
            funcionario.setNome(nome);
        
            String salarioBrutoStr = JOptionPane.showInputDialog("Informe o salário bruto: ");
            float salarioBruto = Float.parseFloat( salarioBrutoStr );
            funcionario.setSalarioBruto( salarioBruto );
        
            funcionario.calcularSalarioLiquido();
        
            JOptionPane.showMessageDialog(null, funcionario.toString()); 
        }
        
    }
    
}
