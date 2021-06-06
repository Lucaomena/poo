import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu,nome, numero;
        double cpf;   
        GerenciaConta contas = new GerenciaConta();
        do{
            System.out.println("1-Adicionar:");
            System.out.println("2-Remover:");
            System.out.println("3-Listar Contas:");
            System.out.println("4-Sacar:");
            System.out.println("5-Depositar:");
            System.out.println("6-Sair:");
            menu = Integer.parseInt(teclado.nextLine());

        switch (menu) {
            case 1:
            System.out.println("informe o nome:");
                nome = teclado.nextLine();
                System.out.println("informe o CPF:");
                cpf = teclado.nextLine();
                System.out.println("Numero:");
                numero = teclado.nextLine();
                Conta.novoCliente(nome,cpf,numero, saldo, contador);
                break;
            case 2:
            System.out.println("Remover Conta");
            contas = teclado.nextLine();
            if (Cliente.remove(cliente)) {
                System.out.println("Removido com sucesso");                
            } else {
                System.out.println("Erro. Conta não encontrada");
            }
                break;


            default:

            System.err.println("opção invalida.");
               
        }
        } while (menu !=6);
        teclado.close();

}
}