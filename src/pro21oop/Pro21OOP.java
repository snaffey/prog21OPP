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

        // Array iterator
        /*
         * System.out.println("Nº de contas -> " + lcc.length);
         * for(int i = 0; i < lcc.length; i++) {
         * if(lcc[i] != null) {
         * System.out.println("i"+lcc[i]);
         * System.out.println("Nome: " + lcc[i].getNome());
         * System.out.println("Saldo: " + lcc[i].getSaldo());
         * }
         * }
         */

        /*
         * Exemplo 2 com for.in
         * Sintaxe
         * for(tipo_de_dados var de item atual: Array)
         */
        for (ContaCorrente cx : lcc) {
            if (cx != null) {
                System.out.println("Nome: " + cx.getNome());
            }
        }

        // ----
        // OPP- Array de referências
        // Criar array contas
        ContaCorrente[] contas = new ContaCorrente[20];
        // Percorrer contas forma automática
        for (int i = 0; i < contas.length; i++) {
            contas[i] = new ContaCorrente("Conta " + i);
            // atribuir acréscimo de 20% no saldo de cada conta que seja de índice ímpar
            if (i % 2 != 0) {
                contas[i].deposito(contas[i].getSaldo() * 0.2);
            }
            // Para contas com saldo inferior a 100€, atribuir um acréscimo de 1000€
            if (contas[i].getSaldo() < 100) {
                contas[i].deposito(1000);
            }
        }
        // Criar uma rotina que devolva a media do saldo de todas as contas
        double media = 0;
        for (ContaCorrente cx : contas) {
            media += cx.getSaldo();
            System.out.println("Nome: " + cx.getNome() + " Saldo: " + cx.getSaldo());
        }

    }

}
