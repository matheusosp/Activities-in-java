package prova1ex7;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco ();
        banco.Deposito(180.25f);
        banco.Saque(50);

        System.out.println(banco.toString());
    }

}
