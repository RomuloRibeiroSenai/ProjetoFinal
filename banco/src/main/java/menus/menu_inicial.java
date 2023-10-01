package menus;

import java.util.ArrayList;
import java.util.Scanner;

import entities.*;


public class menu_inicial {
    Scanner sc = new Scanner(System.in);

    public void menus() {

        String login_digitado, senha_digitada;
        System.out.println("Seja bem-vindo!");
        System.out.println("Digite Login:");
        login_digitado = sc.nextLine();
        System.out.println("digite sua senha: ");
        senha_digitada = sc.nextLine();
        String tipo_menu = login(login_digitado, senha_digitada, Funcionario.getLista_funcionario(), Cliente.getLista_cliente());

        switch(tipo_menu){
            case "cliente":
                this.menu_cliente(login_digitado, senha_digitada);
                break;
            case "gerente":
                this.menu_gerente(); // so falta esse
                break;
            case "caixa":
                this.menu_caixa(login_digitado, senha_digitada);
                break;
            default:
                System.out.println("Erro");
                break;
        }
    }

    public void menu_cliente(String login, String senha) {
        for (int i = 0; i < Cliente.getLista_cliente().size(); i++) {
            if (login.equals(Cliente.getLista_cliente().get(i).getLogin())){
                System.out.println("1.Ver saldo\n2.Depositar\n3.Sacar\n4.Transferir\n5.Sair");
                int escolha = sc.nextInt();
                switch(escolha){
                    case 1:
                        Cliente.getLista_cliente().get(i).saldo();
                        break;
                    case 2:
                        Cliente.getLista_cliente().get(i).deposito();
                        break;
                    case 3:
                        Cliente.getLista_cliente().get(i).saque();
                        break;
                    case 4:
                        Cliente.getLista_cliente().get(i).transferencia();
                    case 5:
                        System.out.println("Até Mais");
                        break;
                    default: 
                        System.out.println("Opção inválida");
                    
                }
                break;
            }
        }
    }
    public int menu_gerente() {
        // gerente exclui,acrescenta, atualiza cadastro,ver lista
        int escolha;
        System.out.println(
                "1.Ver funcionarios\n2.Ver cliente\n3.Cadastrar funcionario \n 4.Cadastrar cliente\n5.Atualizar cadastro fucionario\n6.Atualizar cadastro cliente\n 7.Atualizar cadastro funcionario\n 8.Atualizar cadastro cliente");
        sc.next();
        escolha = sc.nextInt();

        return escolha;
    }

    public void menu_caixa(String login, String senha) {
        // gerente exclui,acrescenta, atualiza cadastro,ver lista
        for (int j = 0; j < Funcionario.getLista_funcionario().size(); j++) {
            if (login.equals(Funcionario.getLista_funcionario().get(j).getLogin())){
                System.out.println("1.Criar cliente\n2.Atualizar cadastro do cliente\n3.Realizar Depósito\n4.Sair");// 3.Consultar saldo\n4.Realizar
                // deposito\n5.Sacar
                int escolha = sc.nextInt();

                switch(escolha){
                    case 1:
                        Funcionario.getLista_funcionario().get(j).criar();
                        break;
                    case 2:
                        Funcionario.getLista_funcionario().get(j).atualizar();
                        break;
                    case 3:
                        Cliente.getLista_cliente().get(0).deposito();
                        break;
                    case 4:
                        System.out.println("Até mais");
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }

            }
        }
     
    }

    public String login(String username, String senha, ArrayList<Funcionario> lista_funcionario, ArrayList<Cliente> lista_cliente){
        for (int i = 0; i < Funcionario.getLista_funcionario().size(); i++){
            if ( username.equalsIgnoreCase(Funcionario.getLista_funcionario().get(i).getNome()) && senha.equals(Funcionario.getLista_funcionario().get(i).getSenha())){
                if (Funcionario.getLista_funcionario().get(i).getClass().getSimpleName().equalsIgnoreCase("gerente")) // converte o tipo da classe pra string para comparar
                return "gerente";
            } else {
                return "caixa";
            }
        }
        for (int i = 0; i < Cliente.getLista_cliente().size(); i++) {
            if (username.equalsIgnoreCase(Cliente.getLista_cliente().get(i).getNome()) && senha.equals(Cliente.getLista_cliente().get(i).getSenha())) {
                return "cliente";
            }
        }
        return "Não cadastrado";
    }
}
