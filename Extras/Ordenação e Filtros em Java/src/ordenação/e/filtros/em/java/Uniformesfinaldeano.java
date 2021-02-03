package ordenação.e.filtros.em.java;
import java.util.Scanner;
import java.util.Arrays;
/*
O professor Girafales organizou a confecção de um uniforme para as turmas da escola para comemorar o final do ano. Após algumas conversas, ficou decidido com os alunos que eles poderiam escolher a cor do uniforme entre branco ou vermelho. Assim sendo, Girafales precisa de sua ajuda para organizar as listas de quem quer o uniforme em cada uma das turmas, relacionando estas camisetas pela cor, tamanho (P, M ou G) e por último pelo nome.

Entrada
Cada caso de teste inicia com um valor N, (1 ≤ N ≤ 60) inteiro e positivo, que indica a quantidade de uniformes a serem feitas para aquela turma. As próximas N*2 linhas contém informações de cada um dos uniformes (serão duas linhas de informação para cada uniforme). A primeira linha irá conter o nome do estudante e a segunda linha irá conter a cor do uniforme ("branco" ou "vermelho") seguido por um espaço e pelo tamanho do uniforme "P" "M" ou "G". A entrada termina quando o valor de N for igual a zero (0) e esta valor não deverá ser processado.

Saída
Para cada caso de entrada deverão ser impressas as informações ordenadas pela cor em ordem ascendente, seguido pelos tamanhos em ordem descendente e por último por ordem ascendente de nome, conforme o exemplo abaixo.
 

 
Exemplo de Entrada	
9
Maria Jose
branco P
Mangojata Mancuda
vermelho P
Cezar Torres Mo
branco P
Baka Lhau
vermelho P
JuJu Mentina
branco M
Amaro Dinha
vermelho P
Adabi Finho
branco G
Severina Rigudinha
branco G
Carlos Chade Losna
vermelho P
0

Exemplo de Saída
branco P Cezar Torres Mo
branco P Maria Jose
branco M JuJu Mentina
branco G Adabi Finho
branco G Severina Rigudinha
vermelho P Amaro Dinha
vermelho P Baka Lhau
vermelho P Carlos Chade Losna
vermelho P Mangojata Mancuda
*/
public class Uniformesfinaldeano {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int line = Integer.valueOf(input.nextLine());
        int i = 0;
        String texto1[]= new String[line];
        String texto2[]= new String[line];
        String respostaBrancoP[]= new String[line];
        String respostaBrancoM[]= new String[line];
        String respostaBrancoG[]= new String[line];
        String respostaVermelhoP[]= new String[line];
        String respostaVermelhoM[]= new String[line];
        String respostaVermelhoG[]= new String[line];
        while(i<line){
            texto1[i] = input.nextLine();
            texto2[i] = input.nextLine();
            String[] tipo = texto2[i].split(" ");
            if(tipo[0].equals("branco")){
                if(tipo[1].equals("P")){
                    respostaBrancoP[i] = texto2[i] + " " +texto1[i];  
                }
                if(tipo[1].equals("M")){
                    respostaBrancoM[i] = texto2[i] + " " +texto1[i];  
                }
                if(tipo[1].equals("G")){
                    respostaBrancoG[i] = texto2[i] + " " +texto1[i];  
                }
            }
            if(tipo[0].equals("vermelho")){
                if(tipo[1].equals("P")){
                    respostaVermelhoP[i] = texto2[i] + " " +texto1[i];  
                }
                if(tipo[1].equals("M")){
                    respostaVermelhoM[i] = texto2[i] + " " +texto1[i];  
                }
                if(tipo[1].equals("G")){
                    respostaVermelhoG[i] = texto2[i] + " " +texto1[i];  
                }
            }
            i++;
        }
        int cont = 0;
        for (String respostaBrancoP2 : respostaBrancoP){
            if(respostaBrancoP2 != null){
                cont++;
            }
        }
        String respostaBrancoPok[]= new String[cont];
        cont = 0;
        
        
        for (String respostaBrancoM2 : respostaBrancoM) {
            if(respostaBrancoM2 != null){
                cont++;
            }
        }
        String respostaBrancoMok[]= new String[cont];
        cont = 0;
        
        
        for (String respostaBrancoG2 : respostaBrancoG) {
            if(respostaBrancoG2 != null){
                cont++;
            }
        }
        String respostaBrancoGok[]= new String[cont];
        cont = 0;
        
        
        for (String respostaVermelhoP2 : respostaVermelhoP) {
            if(respostaVermelhoP2 != null){
                cont++;
            }
        }
        String respostaVermelhoPok[]= new String[cont];
        cont = 0;
        
        
        for (String respostaVermelhoM2 : respostaVermelhoM) {
            if(respostaVermelhoM2 != null){
                cont++;
            }
        }
        String respostaVermelhoMok[]= new String[cont];
        cont = 0;
        
        
        for (String respostaVermelhoG2 : respostaVermelhoG) {
            if(respostaVermelhoG2 != null){
                cont++;
            }
        }
        String respostaVermelhoGok[]= new String[cont];
        cont = 0;
           
        
        for (String respostaBrancoP1 : respostaBrancoP) {
            if(respostaBrancoP1 != null){
                respostaBrancoPok[cont]= respostaBrancoP1;
                cont++;
            }
        }
        cont = 0;
        
        
        for (String respostaBrancoM1 : respostaBrancoM) {
            if(respostaBrancoM1 != null){
                respostaBrancoMok[cont]= respostaBrancoM1;
                cont++;
            }
        }
        cont = 0;
        
        
        for (String respostaBrancoG1 : respostaBrancoG) {
            if(respostaBrancoG1 != null){
                respostaBrancoGok[cont]= respostaBrancoG1;
                cont++;
            }
        }
        cont = 0;
        
        
        for (String respostaVermelhoP1 : respostaVermelhoP) {
            if(respostaVermelhoP1 != null){
                respostaVermelhoPok[cont]= respostaVermelhoP1;
                cont++;
            }
        }
        cont = 0;
        
        
        for (String respostaVermelhoM1 : respostaVermelhoM) {
            if(respostaVermelhoM1 != null){
                respostaVermelhoMok[cont]= respostaVermelhoM1;
                cont++;
            }
        }
        cont = 0;
        
        
        for (String respostaVermelhoG1 : respostaVermelhoG) {
            if(respostaVermelhoG1 != null){
                respostaVermelhoGok[cont]= respostaVermelhoG1;
                cont++;
            }
        }
        if(respostaBrancoPok.length!=0){
            Arrays.sort(respostaBrancoPok);
        }
        if(respostaBrancoMok.length!=0){
            Arrays.sort(respostaBrancoMok);
        }
        if(respostaBrancoGok.length!=0){
            Arrays.sort(respostaBrancoGok);
        }    
        if(respostaVermelhoPok.length!=0){
            Arrays.sort(respostaVermelhoPok);
        }
        if(respostaVermelhoMok.length!=0){
            Arrays.sort(respostaVermelhoMok);
        }
        if(respostaVermelhoGok.length!=0){
            Arrays.sort(respostaVermelhoGok);
        }
        
        
        for (String respostaBrancoPok1 : respostaBrancoPok) {
            System.out.println(respostaBrancoPok1);
        }
        for (String respostaBrancoMok1 : respostaBrancoMok) {
            System.out.println(respostaBrancoMok1);
        }
        for (String respostaBrancoGok1 : respostaBrancoGok) {
            System.out.println(respostaBrancoGok1);
        }
        for (String respostaVermelhoPok1 : respostaVermelhoPok) {
            System.out.println(respostaVermelhoPok1);
        }
        for (String respostaVermelhoMok1 : respostaVermelhoMok) {
            System.out.println(respostaVermelhoMok1);
        }
        for (String respostaVermelhoGok1 : respostaVermelhoGok) {
            System.out.println(respostaVermelhoGok1);
        }
    } 
}
