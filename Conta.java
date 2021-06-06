public abstract class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;
    private static int contador;
    private double valor;


    public Conta(int numero, double saldo, int contador){
        this.numero = numero;
        this.saldo = saldo;
        this.contador = contador;
        this.valor = valor;

    }
    public Conta(Cliente cliente){
        numero = Conta.contador++;
        this.cliente = cliente;
    }
    public double depositar(Double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
            return this.saldo;
        } else {
            return this.saldo;
        }
    }
    public double sacar(Double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return this.saldo;
        } else {
            return this.saldo;
        }

    }
    public Cliente getCliente(){
        return cliente;
    }
    public double getSaldo(){
        return saldo;
    }
    public int getNumero(){
        return numero;
    }
    public static int getContador(){
        return Conta.contador;
    }
    public String exibir(){
        return "Numero"+numero+"Cliente"+cliente+"Saldo:"+saldo;

    }

    @Override 
    public String toString(){
        return "Numero:"+numero+"Saldo:"+saldo;
    }

    }


