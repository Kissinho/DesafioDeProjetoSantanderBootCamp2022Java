public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }
    public void extrato(){
        System.out.println("Olá "+ cliente.getNome()+" !");
        System.out.println("Este é o extrato da sua conta corrente: ");
        System.out.println("Agência: "+agencia);
        System.out.println("Número da conta: "+numero);
        System.out.println("Saldo: "+saldo);

    }
  
}
