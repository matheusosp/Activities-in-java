package lista.pkg1.ex19;

public class Main {
    public static void main(String[] args) {
        ClienteBanco cliente1 = new ClienteBanco(500);
        cliente1.calculaValorCredito();
        System.out.println(cliente1.toString());
    }

}
