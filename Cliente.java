public class Cliente extends Conta{
    
    private String nome;
    private String cpf;

    public Cliente(String nome,String cpf,int numero, double saldo, int contador) {
        super(numero,saldo,contador);
        this.cpf = cpf;
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    
    @Override 
    public String toString(){
        return "CPF:"+cpf+"Nome"+nome;
    }

}
