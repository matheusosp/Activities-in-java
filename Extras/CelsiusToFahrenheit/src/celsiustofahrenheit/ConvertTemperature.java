package celsiustofahrenheit;
import java.util.Scanner;
public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();
        Convert Celsius = new Convert(celsius);
        System.out.println(Celsius.Fahrenheit);
        System.out.println(Celsius.Kelvin);
    }

}
