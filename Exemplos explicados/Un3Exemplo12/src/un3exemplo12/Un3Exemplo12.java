package un3exemplo12;
import java.util.Scanner;
public class Un3Exemplo12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTitulo, voto, cont1=0, cont2=0, cont3=0, contNulo=0;
        String confirma;
        
        System.out.println("Digite o título de eleitor: ");
        numTitulo = Integer.valueOf(input.nextLine());
        while (numTitulo!=0){
         do {
            System.out.println("Digite o número do candidato: ");
            voto = Integer.valueOf(input.nextLine());
            switch (voto){
                case 1: System.out.println("Você votou no João.");
                        break;
                case 2: System.out.println("Você votou na Maria.");
                        break;
                case 3: System.out.println("Você votou no José.");
                        break;
                default: System.out.println("Você votou nulo.");
            }
            System.out.println("Confirma seu voto (SIM/NÃO)?");
            confirma = input.nextLine();
            if (confirma.equalsIgnoreCase("SIM")){
                switch (voto){
                    case 1: cont1 = cont1 + 1;
                            break;
                    case 2: cont2 = cont2 + 1;
                            break;
                    case 3: cont3 = cont3 + 1;
                            break;
                    default: contNulo = contNulo + 1;
                }    
            }
         } while (!confirma.equalsIgnoreCase("SIM"));
         System.out.println("Digite o título de eleitor: ");
         numTitulo = Integer.valueOf(input.nextLine());
        }
        System.out.println("Votos no candidato 1 - João: "+cont1);
        System.out.println("Votos no candidato 2 - Maria: "+cont2);
        System.out.println("Votos no candidato 3 - José: "+cont3);
        System.out.println("Votos nulos: "+contNulo);
        
    }
    
}
