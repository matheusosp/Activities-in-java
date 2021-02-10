package lista2_3.banco;
import java.util.ArrayList;

import java.util.Scanner;
public class Main {
    public static ArrayList<Conta> listContas = new ArrayList<Conta>();
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        String opcaoUsuario = ObterOpcaoUsuario();
        while(!"X".equals(opcaoUsuario.toUpperCase())){
            switch (opcaoUsuario){
                case "0":
                    System.out.println("Total de contas cadastradas = "+listContas.size());
                    break;
                case "1":
                    ListarContas();
                    break;
                case "2":
                    InserirConta();
                    break;
                case "3":
                    Transferir();
                    break;
                case "4":
                    Sacar();
                    break;
                case "5":
                    Depositar();
                    break;
                case "6":
                    if(listContas.isEmpty()){
                        System.out.println("Nenhuma conta cadastrada! ");
                        break;
                    }
                    Conta maiorSaldo = listContas.get(0);
                    for (Conta e: listContas) {
                        if(e.getSaldo() > maiorSaldo.getSaldo()) {
                            maiorSaldo = e;
                        }
                    }
                    System.out.println("O numero da conta com o maior saldo é: "+maiorSaldo.getNumeroConta()+" proprietario: "+maiorSaldo.getNome());
                    break;
                case "7":
                    int j = 0;
                    for (Conta e: listContas) {
                        if(e.getSaldo() < 0) {
                            j++;
                        }
                    }
                    System.out.println("Numero de contas com saldo Negativo = "+j);
                    break;    
                case "8":
                    System.out.println("Numero da Conta: ");
                    int NumeroConta = Integer.valueOf(input.nextLine());
                    boolean encontrado = false;
                    for (Conta e: listContas) {
                        if(e.getNumeroConta() == NumeroConta) {
                            System.out.println(e);
                            encontrado = true;
                        }
                    }
                    if(encontrado==false){
                        System.out.println("Conta com o numero "+ NumeroConta+" não foi encontrada");
                    }
                    break;                     
                default:
                   throw new IllegalArgumentException();
            }
            opcaoUsuario = ObterOpcaoUsuario();
        }
    }

    private static void ListarContas() {
        System.out.println("Listar contas");

        if (listContas.isEmpty()){
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }

        for (Conta conta : listContas) {
            System.out.println(conta);
        }
    }

    private static void InserirConta() {
        System.out.println("Inserir nova conta");
        
        System.out.println("Digite o numero da conta: ");
        int numero = Integer.valueOf(input.nextLine());
        
        System.out.println("Digite o Nome do Cliente: ");
        String entradaNome = input.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double entradaSaldo = Double.valueOf(input.nextLine());

        System.out.println("Digite o crédito: ");
        double entradaCredito = Double.valueOf(input.nextLine());

        Conta novaConta = new Conta(numero,entradaSaldo,entradaCredito,entradaNome);

        listContas.add(novaConta);
    }

    private static void Transferir() {
        System.out.println("Digite o número da conta de origem: ");
        int indiceContaOrigem = Integer.valueOf(input.nextLine());

        System.out.println("Digite o número da conta de destino: ");
        int indiceContaDestino = Integer.valueOf(input.nextLine());

        System.out.println("Digite o valor a ser transferido: ");
        double valorTransferencia = Double.valueOf(input.nextLine());
        if(listContas.size()>1){
            Conta contaOrigem = listContas.get(0);
            Conta contaDestino = listContas.get(0);
            for (Conta conta : listContas) {
                if (conta.getNumeroConta()==indiceContaOrigem) {
                    contaOrigem = conta;
                }
                if (conta.getNumeroConta()==indiceContaDestino) {
                    contaDestino = conta;
                }
            } 
            contaOrigem.Transferir(valorTransferencia, contaDestino);  
        }
    }

    private static void Sacar() {
        System.out.println("Digite o número da conta: ");
        int indiceConta = Integer.valueOf(input.nextLine());

        System.out.println("Digite o valor a ser sacado: ");
        double valorSaque = Double.valueOf(input.nextLine());
        for (Conta conta : listContas) {
            if (conta.getNumeroConta()==indiceConta) {
                conta.Sacar(valorSaque);
            }
        }  
    }

    private static void Depositar() {
        System.out.println("Digite o número da conta: ");
        int indiceConta = Integer.valueOf(input.nextLine());

        System.out.println("Digite o valor a ser depositado: ");
        double valorDeposito = Double.valueOf(input.nextLine());
        for (Conta conta : listContas) {
            if (conta.getNumeroConta()==indiceConta) {
                conta.Depositar(valorDeposito);
            }
        }  
    }
    private static String ObterOpcaoUsuario(){
        System.out.println("");
        System.out.println("Banco a seu dispor!!!");
        System.out.println("Informe a opção desejada:");
        System.out.println("0- Total de contas");
        System.out.println("1- Listar contas");
        System.out.println("2- Inserir nova conta");
        System.out.println("3- Transferir");
        System.out.println("4- Sacar");
        System.out.println("5- Depositar");
        System.out.println("6- Número da conta que possui o maior saldo");
        System.out.println("7- Total de contas cujo saldo é negativo");
        System.out.println("8- procurar numero de Conta");
        System.out.println("X- Sair");

        String opcaoUsuario = input.nextLine().toUpperCase();
        return opcaoUsuario;
     }
}
