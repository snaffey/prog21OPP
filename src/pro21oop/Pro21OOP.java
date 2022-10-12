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

        ContaCorrente ccAna = new ContaCorrente("Ana");
        System.out.println("Nome: " + ccAna.getNome());
        ccAna.setNumero(25);
        System.out.println("Numero: " + ccAna.getNumero());
        ContaCorrente ccMaria = new ContaCorrente("Maria");
        int qt = ContaCorrente.getNumeroContasCriadas();
        System.out.println("Numero de contas criadas: " + qt);

        // Array de objetos

        // int[] numeros = new int[2];
        ContaCorrente[] lcc = new ContaCorrente[5];
        ContaCorrente[] lcc1;

        lcc1 = new ContaCorrente[2];
        // Erro porque nao tem valor valido
        // System.out.println("1 pos -> " + lcc[0].getNome());

        lcc[0] = ccAna;
        lcc[1] = ccMaria;
        System.out.println("1 pos -> " + lcc[0].getSaldo());
        System.out.println("2 pos -> " + lcc[1].getSaldo());
        lcc[0].deposito(50);
        lcc[1].levantamento(100);
        System.out.println("Ana -> " + lcc[0].getSaldo());
        System.out.println("Maria -> " + lcc[1].getSaldo());

        lcc[2] = new ContaCorrente("Manel");

    }

}
