public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        
        System.out.println("Estou criando uma conta");
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    public boolean transferir(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }

    public void setAgencia(int novaAgencia) {
        this.agencia = novaAgencia;
    }
    public int getAgencia() {
        return this.agencia;
    }

    public void setTitular(Cliente novoTitular) {
        this.titular = novoTitular;
    }
    public Cliente getTitular() {
        return this.titular;
    }
}