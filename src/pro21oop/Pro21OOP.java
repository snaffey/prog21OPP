package pro21oop;

import java.util.Scanner;

public class Pro21OOP {

    public static void main(String[] args) {
        /*
         * System.out.println("Ola");
         * Scanner entrada = new Scanner(System.in);
         * int idade = entrada.nextInt();
         * System.out.println("idade "+idade);
         */

        Conta conta = new Conta();

        conta.numero = 1;
        System.out.println("num da conta -> " + conta.numero);

        conta.saldo = 1000;
        System.out.println("Saldo da conta -> " + conta.saldo);

        conta.levantamento(100);
        System.out.println("Saldo da conta depois -> " + conta.saldo);

        conta.deposito(500);
        System.out.println("Saldo da conta depois (Deposito) -> " + conta.saldo);

        Conta conta2 = conta;
        System.out.println("Saldo da conta2 -> " + conta2.saldo);

        Conta conta3 = new Conta();
        System.out.println("Saldo da conta3 -> " + conta3.saldo);

        ContaCorrente cc = new ContaCorrente("Ana");
        System.out.println("Nome: " + cc.getNome());
        cc.setNumero(25);
        System.out.println("Numero: " + cc.getNumero());
        ContaCorrente cc1 = new ContaCorrente("Maria");
        int qt = ContaCorrente.getNumeroContasCriadas();
        System.out.println("Numero de contas criadas: " + qt);
    }

}
