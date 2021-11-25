package transferencia;

public class Conta {

    private String agencia;
    private String numeroconta;
    private double saldo;
    Cliente proprietario;



    public Conta(String agencia, String numeroconta, double saldo, Cliente proprietario) {
        this.agencia = agencia;
        this.numeroconta = numeroconta;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroconta() {
        return numeroconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getProprietario() {
        return proprietario;
    }
    public void realizarDeposito(double valor){
        saldo += valor;
    }

    public boolean realizarSaque(double valor){
        if(valor > saldo){
            return  false;
        }
        saldo -= valor;
        return  true;
    }
    public boolean realizarTansferencia(double valor, Conta destino){
        if(realizarSaque(valor)){
            destino.realizarDeposito((valor));
            return  true;
        }
        return false;

    }
}
