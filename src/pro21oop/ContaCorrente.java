package pro21oop;

public class ContaCorrente {

    /*
     * Modificadores -> Foca no modelo, pode ser acedida pelo obj mas nao
     * modificadas
     */
    private int numeroContasCriadas;

    public static int getNumeroContasCriadas() {
        return numeroContasCriadas;
    }

    private int numero;
    private String nome;
    private int nif;
    private double saldo;

    public ContaCorrente() {
        this.numero = 1000;
        this.nome = "Sem nome declarado";
        this.nif = 1111111;
        this.saldo = 250.0;
        this.numeroContasCriadas++;
    }

    public ContaCorrente(String n) {
        this.nome = n;
        this.numeroContasCriadas++;
    }

    public ContaCorrente(String n, double s) {
        this(n);
        this.saldo = s;
    }

    // métodos getters & setters
    public String getNome() {
        return this.nome;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int n) {
        if (n > 20)
            this.numero = n;
    }

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Tiago");
        System.out.println("Nome: " + cc.nome);
        ContaCorrente cc1 = new ContaCorrente("Rui", 1000);

    }
}
