public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double saldo, int conta,double limite,  int contador ){
        super(numero, saldo, contador);
        this.limite = limite;

    }

    public String exibir() {
        return super.exibir()+":"+limite;
    }

    @Override
    public String toString(){
        return super.toString()+ "R$" +limite;
    }

    public double getLimite(){
        return limite;
    }
    
}
