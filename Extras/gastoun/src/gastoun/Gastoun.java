package gastoun;

import java.util.Scanner;

public class Gastoun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome,continua;
        int cont = 0,cont2=0;
        float renda_mensal, alimentacao,aluguel,gt,paluguel,palimentacao,mediaaluguel = 0,medialuguel = 0,s=0,media2 = 0; 
       do{
            cont+=1;
            System.out.println("Digite o nome do aluno "+cont);
            nome= input.nextLine();
            System.out.println("Digite renda mensal da família");
            renda_mensal=Float.valueOf(input.nextLine());
            System.out.println("Digite gasto com alimentação");
            alimentacao=Float.valueOf(input.nextLine());
            System.out.println("Digite gasto com aluguel e outros gastos");
            aluguel=Float.valueOf(input.nextLine());
            gt=alimentacao+aluguel;
            System.out.println("O aluno"+nome+"teve um gasto total de:"+gt);
            paluguel=aluguel/renda_mensal*100;
            palimentacao= alimentacao/renda_mensal*100;
            System.out.println("A proporção de gastos com alimentação em relação a sua renda é de "+palimentacao+"%");
            System.out.println("A proporção de gastos com aluguel em relação a sua renda é de "+paluguel+"%");
            medialuguel+=aluguel;
            mediaaluguel=medialuguel/cont;
            System.out.println("O gasto médio com aluguel é de "+mediaaluguel);
            System.out.println("Desejae registrar mais algum aluno (SIM ou NÃO)");
            continua=input.nextLine();
            if(renda_mensal>2000){
                cont2+=1;
                s+=gt;
                media2=s/cont2;
            }
       }while(continua.equalsIgnoreCase("SIM"));
       System.out.println("O gasto total médio dos alunos cuja renda familiar é superior a R$ 2000,00 é de: "+media2);
    }
    
}
