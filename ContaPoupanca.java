public class ContaPoupanca extends Conta {
    private double taxaOperacao = 0.25;

    public ContaPoupanca(int numero, double saldo, int conta,double limite, int contador ){
        super(numero, saldo,  contador);
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    public String toString(){
        return super.toString()+"R$"+taxaOperacao;
    }

    }


    


    

