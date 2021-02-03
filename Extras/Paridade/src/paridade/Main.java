package paridade;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;
public class Main {
    public static void inverteBits(int numBits, Paridade paridadeBloco) {
        Random r = new Random();
        int tamanhoArr = paridadeBloco.getLenSeq();
        String seq1[] = paridadeBloco.getSeq1();
        String seq2[] = paridadeBloco.getSeq2();
        String col[] = paridadeBloco.getCol();
        String[] join = Stream.of(seq1, seq2, col).flatMap(Stream::of).toArray(String[]::new);
  //      System.out.println("Sinal transmitido: "+Arrays.toString(join));
        if(numBits > join.length){
            numBits = join.length;
            System.out.println("Maximo de bits == "+join.length);
        }
        int[] arrRand = new int[numBits];
        boolean randomRepetido;
        int rand = r.nextInt(join.length); 
        arrRand[0] = rand;
        for (int i = 1; i < arrRand.length; i++) {
            arrRand[i] = -1;
        }
        for (int j = 1; j < arrRand.length; j++) {
            randomRepetido=true;
            while(randomRepetido==true){ 
                rand = r.nextInt(join.length);
                randomRepetido = check(arrRand, rand);  
                if(randomRepetido==false){
                    arrRand[j] = rand;
                }
            }
        }
        for (int i = 0; i < numBits; i++) {            
            if("0".equals(join[arrRand[i]])){
                join[arrRand[i]]="1";
            }else{
                join[arrRand[i]]="0";
            }
        }
   //     System.out.println("Sinal recebido:    "+Arrays.toString(join));
        System.arraycopy(join, 0, seq1, 0, tamanhoArr+1);
        for (int j = 0; j < tamanhoArr+1; j++) {
               seq2[j] = join[j+(tamanhoArr+1)];
        }
        for (int j = 0; j < tamanhoArr; j++) {
               col[j] = join[j+(tamanhoArr+1)+(tamanhoArr+1)];
        }
        paridadeBloco.setSeq1(seq1);
        paridadeBloco.setSeq2(seq2);
        paridadeBloco.setCol(col);
    }
    private static boolean check(int[] arr, int toCheckValue) { 
        boolean test = false; 
        for (int element : arr) { 
            if (element == toCheckValue) { 
                test = true; 
                break; 
            } 
        } 
  
        return test;
    } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bits: ");
        String arr[] = input.nextLine().split("");
        Paridade paridadeBloco = new Paridade();
        paridadeBloco.criaParidadeBloco(arr);
        System.out.println("Sinal transmitido: ");
        System.out.println(Arrays.toString(paridadeBloco.getSeq1()));
        System.out.println(Arrays.toString(paridadeBloco.getSeq2()));
        System.out.println(Arrays.toString(paridadeBloco.getCol()));
        System.out.print("Numero de bits a serem invertidos: ");
        int numBits = Integer.valueOf(input.nextLine());
        inverteBits(numBits, paridadeBloco);
        System.out.println("Sinal recebido: ");
        System.out.println(Arrays.toString(paridadeBloco.getSeq1()));
        System.out.println(Arrays.toString(paridadeBloco.getSeq2()));
        System.out.println(Arrays.toString(paridadeBloco.getCol()));
        paridadeBloco.verificaParidade();
    }

}
