package categoriafuncionario;
import java.util.Scanner;
public class Categoriafuncionario {
    public static void main(String[] args) {
    String nome,categoria;
    double salario;
    Scanner input = new Scanner(System.in);
    System.out.print("Nome do funcionario ");
    nome=input.nextLine();
    System.out.print("O funcionario é da categoria A,B,C,D,E,F ou H?(DIGITE EM MAIUSCULO) ");
    categoria=input.nextLine();
    System.out.print("Digite o salario do funcionario: ");
    salario=Double.valueOf(input.nextLine());
    if("A".equals(categoria)||"H".equals(categoria)){
        salario=salario*1.10;
        System.out.print(nome+" da categoria "+categoria+" vai receber o salario no valor de:"+salario);}
    else if("B".equals(categoria)||"D".equals(categoria)||"E".equals(categoria)){
        salario=salario*1.15;
        System.out.print(nome+" da categoria "+categoria+" vai receber o salario no valor de:"+salario);}
    else if("C".equals(categoria)||"F".equals(categoria)){
        salario=salario*1.25;
        System.out.print(nome+" da categoria "+categoria+" vai receber o salario no valor de:"+salario);}
    else{
    salario=salario*1.30;
    System.out.print(nome+" que não é de nenhuma categoria listada vai receber o salario no valor de:"+salario);}
    }}