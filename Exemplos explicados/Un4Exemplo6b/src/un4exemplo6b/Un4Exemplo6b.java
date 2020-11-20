/*
b) Uma empresa possui uma planilha com os registros da conta de energia elétrica
de cada uma de suas filiais. Em cada linha da planilha encontra-se o nome da 
filial e, na sequência, o consumo dos meses de janeiro a abril de 2020. 
Considerando que a empresa possui 3 filiais, faça um programa que leia estes 
dados e apresente:
- O consumo total da empresa neste período.
- O maior consumo da empresa e em qual filial e mês ele ocorreu.
- O consumo de cada filial neste período.
- O consumo da empresa em cada mês deste período.
 */
package un4exemplo6b;

import java.util.Scanner;


public class Un4Exemplo6b {

       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double[][] dados = new double[3][4];
        double soma = 0, maior;
        int linhaMaior, colunaMaior;
        
        //Entrada de dados
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print("Digite o gasto da filial "+i+" no mês "+j+": ");
                dados[i][j] = Double.valueOf(input.nextLine());
            }
        }
        
        //Processamento
        maior = dados[0][0];
        linhaMaior = 0;
        colunaMaior = 0;
        for (int i=0;i<3;i++){
            for (int j=0;j < 4;j++){
                soma = soma + dados[i][j];
                
                if (dados[i][j] > maior){
                    maior = dados[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }
        System.out.println("Consumo total da empresa: "+soma);
        System.out.println("Maior gasto da empresa: "+maior);
        System.out.println("Filial com maior consumo: "+linhaMaior);
        System.out.println("Mês em que aconteceu o maior consumo: "+colunaMaior);
        
       
        for (int i=0;i<3;i++){
            soma = 0;
            for (int j=0;j<4;j++) {
                soma = soma + dados[i][j];
            }
            System.out.println("Gasto da filial "+i+": "+soma);
        }
        
        for (int j=0;j<4;j++){
            soma = 0;
            for (int i=0;i<3;i++) {
                soma = soma + dados[i][j];
            }
            System.out.println("Gasto no mês "+j+": "+soma);
        }
       
      
    }
    
}
