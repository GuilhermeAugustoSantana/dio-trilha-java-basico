package DesafioContaBancaria;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Informe seu nome: ");
        nomeCliente = scan.nextLine();

        System.out.println("Infome o numero da sua conta: ");
        numero = scan.nextInt();

        System.out.println("Informe a agência: ");
        scan.nextLine();
        agencia = scan.nextLine();

        System.out.println("Informe seu saldo: ");
        saldo = scan.nextDouble();

        System.out.println("Olá ".concat(nomeCliente)+", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia)+", conta "+ numero +" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
 