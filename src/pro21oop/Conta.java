package pro21oop;

public class Conta {
    /*
     * Atributos da classe/modelo
     * Por padrão o encapsulamento é publico
     */
    int numero; // por padrão é igual public int numero;
    String nomeTitular;
    double saldo;

    // função sem retorno
    void levantamento(double qt) {
        double novoSaldo = this.saldo - qt;
        this.saldo = novoSaldo;
    }

    void deposito(double qt) {
        this.saldo += qt;
    }
}