package lista.pkg1.ex17;
import java.util.Scanner;
public class Lista1Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a categoria: ");
        char categoria = input.nextLine().charAt(0);
        System.out.println("Digite o salario: ");
        float salario = Float.valueOf(input.nextLine());
        Funcionario funcionario1 = new Funcionario(categoria,salario);
        System.out.println("Salario Bruto = "+funcionario1.getSalarioBruto());
        System.out.println("Novo Salario = "+funcionario1.getNewsalario());
    }

}
