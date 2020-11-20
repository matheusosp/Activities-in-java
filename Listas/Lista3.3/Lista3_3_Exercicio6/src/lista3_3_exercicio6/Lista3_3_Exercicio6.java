/*6) Considere que para cada aluno de uma universidade, tenha-se as seguintes 
informações: nome do aluno, renda mensal da família, gasto com alimentação, 
gasto com aluguel e outros gastos. Faça um programa que leia estes dados, 
calcule e apresente:
a) Para cada aluno:
	- Seu gasto total;
	- A proporção de gastos com alimentação em relação a sua renda;
	- A proporção de gastos com aluguel em relação a sua renda;
b) O gasto médio com alguel.
c) O gasto total médio dos alunos cuja renda familiar é superior a R$ 2000,00.

O programa deve ler e processar a ficha de um aluno e no final perguntar se 
deseja-se registrar mais algum aluno (SIM ou NÃO).

*/
package lista3_3_exercicio6;

import java.util.Scanner;

public class Lista3_3_Exercicio6 {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, continua;
        int contTotal2000=0, i=0;
        double renda, gastoAlimentacao, gastoAluguel, gastoOutros, gastoTotal,
               propAlimentacao, propAluguel, somaAluguel=0, mediaAluguel, 
               somaTotal2000=0, mediaTotal2000;
        
        do {
            System.out.print("Digite o nome do aluno: ");
            nome = input.nextLine();
            System.out.print("Digite a renda familiar: ");
            renda = Double.valueOf(input.nextLine());
            System.out.print("Digite o gasto com alimentação: ");
            gastoAlimentacao = Double.valueOf(input.nextLine());
            System.out.print("Digite o gasto com aluguel: ");
            gastoAluguel = Double.valueOf(input.nextLine());
            System.out.print("Digite o valor dos outros gastos: ");
            gastoOutros = Double.valueOf(input.nextLine());
            gastoTotal = gastoAlimentacao + gastoAluguel + gastoOutros;
            propAlimentacao = gastoAlimentacao / renda * 100;
            propAluguel = gastoAluguel / renda * 100;
            System.out.println("Gasto do total do aluno "+nome+" :"+gastoTotal);
            System.out.println("Proporção da renda gasta com alimentação :"+propAlimentacao);
            System.out.println("Proporção da renda gasta com aluguel :"+propAluguel);
            somaAluguel = somaAluguel + gastoAluguel;
            if (renda > 2000){
                somaTotal2000 = somaTotal2000 + gastoTotal;
                contTotal2000 = contTotal2000 + 1;
            }
            System.out.print("Deseja registrar mais um aluno (SIM/NÃO): ");
            continua = input.nextLine();
            i = i + 1;
        }while (continua.equalsIgnoreCase("SIM"));
        mediaAluguel = somaAluguel / i;
        mediaTotal2000 = somaTotal2000 / contTotal2000;
        System.out.println("Gasto médio com aluguel: "+mediaAluguel);
        System.out.println("Gasto médio total das famílias com renda superior a R$ 2.000,00: "+mediaTotal2000);
    }
    
}
