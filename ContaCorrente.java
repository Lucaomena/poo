public class ContaCorrente extends Conta{
    private double saldoSuficiente;

    public ContaCorrente(int numero, double saldo, int conta,double limite, int contador){
        super(numero, saldo, contador);
        this.saldoSuficiente = saldo;
    }

    public String exibir() {
        return super.exibir() + ":" +saldoSuficiente;
    }
    
    

  
}
