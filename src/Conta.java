public class Conta {
    protected int agencia, numero;
    protected double saldo;
    public static int sequencial;
    public static final int AGENCIA_PADRAO = 1;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = sequencial++;
        this.cliente = cliente;
        
          }


    public void sacar(double valor){
        if(valor<=this.saldo){
            saldo-=valor;
        }else{
            System.out.println("Saque não autorizado");
        }
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public int getAgencia(){
        return this.agencia;
    }
    public int getNumero(){
        return this.numero;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void extrato(){
        System.out.println("Olá "+ cliente.getNome());
        System.out.println("Extrato da sua conta: ");
        System.out.println("Agência: "+agencia);
        System.out.println("Número da conta: "+numero);
        System.out.println("Saldo: "+saldo);

    }
}
