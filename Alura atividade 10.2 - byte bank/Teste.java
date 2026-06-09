public class Teste {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1,5);
        ContaPoupanca cp = new ContaPoupanca(42,555);
        
        cc.depositar(150);
        cp.depositar(300);

        cc.transferir(50, cp);

        System.out.println("O Saldo de cc é: " + cc.getSaldo());
        System.out.println("O Saldo de cp é: " + cp.getSaldo());
    }
}
