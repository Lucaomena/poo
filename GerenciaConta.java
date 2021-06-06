import java.util.ArrayList;



public class GerenciaConta {
    private ArrayList<Cliente> listaConta;

    public GerenciaConta(){
        listaConta = new ArrayList<>();
    }
    public void novoCliente(String nome,String cpf,int numero, double saldo, int contador){
        listaConta.add( new Cliente(nome, cpf, numero, saldo, contador));
                
    }
    public boolean remove (String cpf) {
        for( Cliente cliente : listaConta){
            if(cliente.getCpf().equals(cpf)){
                listaConta.remove(cpf);
                return true;

            }
        }
        return false;
    }

    
}
