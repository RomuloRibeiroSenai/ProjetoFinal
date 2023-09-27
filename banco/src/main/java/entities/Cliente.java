package entities;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


import enums.UnidadeFederal;
import interfaces.Cadastro;
//import lombok.Data;


//@Data
public class Cliente extends Pessoa implements Cadastro{
    
    
    private double saldo;
    private String tipoConta;
    private static Random rand = new Random();
    private static double numeroConta = rand.nextDouble();
    private String gerente;
    
    private static ArrayList<Cliente> lista_cliente = new ArrayList<>();
    
    public Cliente(String nome, String cpf, String data_nasc, String login, String senha,
            Endereco endereco, double saldo, String tipoConta, String gerente) {
        super(nome, cpf, data_nasc, login, senha, endereco);
            this.saldo = saldo;
            this.tipoConta = tipoConta;
            this.gerente = gerente;
    }
    
    @Override
    public void criar() {
        Scanner sc = new Scanner(System.in);
        //  Cliente raquel = new Cliente("raquel", "121", "01/01/01", "raquel", "raquel", teste, 10000, "Corrente", "Anderson");
        String nome,cpf,data_nac,login,senha,tipo_conta,gerente;
        double saldo;
        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
        System.out.println("cpf: ");
        cpf = sc.nextLine();
        System.out.println("data:");
        data_nac = sc.nextLine();
        System.out.println("login:");
        login = sc.nextLine();
        System.out.println("senha: ");
        senha = sc.nextLine();
        System.out.println("saldo");
        saldo = sc.nextDouble();
        System.out.println("tipo de conta:");
        tipo_conta = sc.nextLine();
        System.out.println("gerente");
        gerente = sc.nextLine();
        Endereco teste = new Endereco("Bingen", "Rua bingen", 0, "nada", "Petropolis", "25-556550", UnidadeFederal.RJ);
        Cliente cliente = new Cliente(nome,cpf,data_nac,login,senha,teste,saldo, tipo_conta,gerente);
        getLista_cliente().add(cliente);




    }

    @Override
    public void atualizar() {
        // atualiza proprias infos
    }
    @Override
    public void excluir() {
        // faz nada
        Scanner sc = new Scanner(System.in);
        String login_digitado,senha_digitada;
        System.out.println("login");
        login_digitado= sc.nextLine();
        System.out.println("senha");
        senha_digitada = sc.nextLine();
        for (int i = 0; i < getLista_cliente().size(); i++) {
            if (login_digitado.equalsIgnoreCase(getLista_cliente().get(i).getLogin())&& senha_digitada.equals(getLista_cliente().get(i).getSenha())) {
                getLista_cliente().get(i).getGerente();

            }

        }
    }

    @Override
    public void ver() {
        for (int i = 0; i < getLista_cliente().size();i++ ){
            if(this.getNome().equals(getLista_cliente().get(i).getNome())){
                System.out.println("Nome: " + getLista_cliente().get(i).getNome() + "\n" +
                "CPF: " +getLista_cliente().get(i).getCpf() + "\n" +
                "Data de Nascimento: " +getLista_cliente().get(i).getData_nasc() + "\n" +
                "Login: " + getLista_cliente().get(i).getLogin() + "\n" +
                // ver o get endereço
                "Saldo: " + getLista_cliente().get(i).getSaldo() + "\n"+
                "Tipo de conta: " + getLista_cliente().get(i).getTipoConta() + "\n"+
                "Gerente Responsável: " + getLista_cliente().get(i).getGerente()
                );
            }
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public static double getNumeroConta() {
        return numeroConta;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public static ArrayList<Cliente> getLista_cliente() {
        return lista_cliente;
    }

    public static void setLista_cliente(ArrayList<Cliente> lista_cliente) {
        Cliente.lista_cliente = lista_cliente;
    }




    
}
