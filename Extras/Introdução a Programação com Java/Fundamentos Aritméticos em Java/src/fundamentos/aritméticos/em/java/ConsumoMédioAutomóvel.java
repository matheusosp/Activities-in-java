package fundamentos.aritméticos.em.java;
import java.util.Scanner;
import java.io.IOException;
/*
Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km) e o total de combustível consumido (em litros).

Entrada
Você receberá dois valores: um valor inteiro X com a distância total percorrida (em Km), e um valor real Y que representa o total de combustível consumido, com um dígito após o ponto decimal.

Saída
Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula), incluindo no final a mensagem "km/l".

 
Exemplo de Entrada	
500
35.0

Exemplo de Saída
14.286 km/l

Exemplo de Entrada
2254
124.4

Exemplo de Saída
18.119 km/l

Exemplo de Entrada
4554
464.6

Exemplo de Saída
9.802 km/l

*/
public class ConsumoMédioAutomóvel {
    
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int distancia = input.nextInt();
        double total = input.nextDouble();
        double consumo = distancia/total;
        System.out.printf("%.3f km/l%n",consumo);
    }
    
}
