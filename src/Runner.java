public class Runner {
    public static void main(String[] args) {
        Cliente Rickson = new Cliente();
        Rickson.setNome("Rickson");
        Conta cc = new ContaCorrente(Rickson);
        Conta poupanca = new ContaPoupanca(Rickson);

        cc.extrato();
        poupanca.extrato();
        cc.depositar(250);
        cc.transferir(100, poupanca);
        cc.extrato();
        poupanca.extrato();

        }
}
