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

    }

}
