package entities;

import java.util.ArrayList;
import java.util.Scanner;

import enums.UnidadeFederal;

public class Caixa extends Funcionario {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    public Caixa(String nome, String cpf, String data_nasc, String login, String senha,
            Endereco endereco, double salario, String cpts, boolean ativo, String cargo) {
        super(nome, cpf, data_nasc, login, senha, endereco, salario, cpts, ativo, cargo);
    }

    @Override
    public void criar() {
        
        String nome, cpf, data_nac, login, senha, tipo_conta, gerente, bairro, rua, complemento, cidade, cep, uf_string;
        double saldo;
        int numero;
        UnidadeFederal uf;
        // double [] historico = {};
        ArrayList<Double> historico = new ArrayList<>();
        boolean ativo = true;
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
        saldo = 0;
        System.out.println("tipo de conta:");
        tipo_conta = sc.nextLine();
        System.out.println("gerente");
        gerente = sc.nextLine();
        System.out.println("bairro");
        bairro = sc.nextLine();
        System.out.println("Rua:");
        rua = sc.nextLine();
        System.out.println("Número");     
        numero = sc2.nextInt(); 
        System.out.println("Complemento:");
        complemento = sc.nextLine();
        System.out.println("Cidade: ");
        cidade = sc.nextLine();
        System.out.println("CEP:");
        cep = sc.nextLine();
        System.out.println("UF: ");
        uf_string = sc.nextLine().toUpperCase();
        uf = UnidadeFederal.valueOf(uf_string);

        Endereco teste = new Endereco(bairro, rua, numero, complemento, cidade, cep, uf);
        Cliente cliente = new Cliente(nome, cpf, data_nac, login, senha, teste, saldo, tipo_conta, gerente, ativo,historico);
        Cliente.getLista_cliente().add(cliente);
    }

    @Override
    public void atualizar() {
        String cpf;
        System.out.println("CPF do cliente: ");
        cpf = sc.nextLine();
        for (int i = 0; i < Cliente.getLista_cliente().size(); i++) {
            if (cpf.equals(Cliente.getLista_cliente().get(i).getCpf())) {
                int escolha = 0;
                while (escolha != 1 || escolha != 2) {
                    System.out.println("1.Para mudar dados do cliente\n2.Para mudar dados do endereço do cliente");
                    escolha = sc.nextInt();
                }
                if (escolha == 1) {
                    String[] opcoes = { "Nome", "CPF", "Data de nascimento", "Login", "Senha", "Tipo Conta",
                            "Gerente" };
                    for (int j = 0; j < opcoes.length; j++) {
                        System.out.println(opcoes[j] + "\n");
                    }
                    String mudança = sc.nextLine().toLowerCase();
                    switch (mudança) {
                        case "nome":
                            System.out.println("Qual o nome desejado?");
                            String nome = sc.nextLine();
                            Cliente.getLista_cliente().get(i).setNome(nome);
                            break;
                        case "cpf":
                            System.out.println("Qual o CPF desejado?");
                            String cpf1 = sc.nextLine();
                            Cliente.getLista_cliente().get(i).setCpf(cpf1);
                            break;
                        case "data de nascimento":
                            System.out.println("Qual a data desejado?");
                            String data = sc.nextLine();
                            Cliente.getLista_cliente().get(i).setData_nasc(data);
                            break;
                        case "login":
                            System.out.println("Qual o Login desejado?");
                            String login = sc.nextLine();
                            Cliente.getLista_cliente().get(i).setLogin(login);
                            break;
                        case "senha":
                            System.out.println("Qual a senha desejada?");
                            String senha = sc.nextLine();
                            Cliente.getLista_cliente().get(i).setSenha(senha);
                            break;
                        case "tipo conta":
                            System.out.println("Qual o tipo desejado?");
                            String tipo = sc.nextLine();
                            Cliente.getLista_cliente().get(i).setTipoConta(tipo);
                            break;
                        case "gerente":
                            System.out.println("Qual o gerente?");
                            String gerente = sc.nextLine();
                            Cliente.getLista_cliente().get(i).setGerente(gerente);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                            break;
                    }
                    break;
                } else if (escolha == 2) {
                    String[] opcoes = { "Bairro", "Rua", "Número", "Complemento", "Cidade", "CEP", "UF" };
                    for (int j = 0; j < opcoes.length; j++) {
                        System.out.println(opcoes[j] + "\n");
                    }
                    String mudança = sc.nextLine().toLowerCase();
                    switch (mudança) {
                        case "bairro":
                            System.out.println("Qual o bairro desejado?");
                            String bairro = sc.nextLine();
                            Cliente.getLista_cliente().get(i).getEndereco().setBairro(bairro);
                            break;
                        case "rua":
                            System.out.println("Qual a rua desejada?");
                            String rua = sc.nextLine();
                            Cliente.getLista_cliente().get(i).getEndereco().setRua(rua);
                            ;
                            break;
                        case "numero":
                            System.out.println("Qual o numero desejado?");
                            sc.next();
                            int numero = sc.nextInt();
                            sc.next();
                            Cliente.getLista_cliente().get(i).getEndereco().setNumero(numero);
                            break;
                        case "complemento":
                            System.out.println("Qual o complemento desejado?");
                            String comp = sc.nextLine();
                            Cliente.getLista_cliente().get(i).getEndereco().setComplemento(comp);
                            break;
                        case "cidade":
                            System.out.println("Qual a cidade desejada?");
                            String cidade = sc.nextLine();
                            Cliente.getLista_cliente().get(i).getEndereco().setCidade(cidade);
                            break;
                        case "cep":
                            System.out.println("Qual o CEP desejado?");
                            String cep = sc.nextLine();
                            Cliente.getLista_cliente().get(i).getEndereco().setCep(cep);
                            ;
                            break;
                        case "uf":
                            UnidadeFederal uf;
                            System.out.println("Qual a UF?");
                            String uf1 = sc.nextLine().toUpperCase();
                            uf = UnidadeFederal.valueOf(uf1);
                            Cliente.getLista_cliente().get(i).getEndereco().setUf(uf);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                            break;
                    }
                } else {
                    System.out.println("Opção Inválida");
                }
            }
        }
    }

    @Override
    public void excluir() {
        // faz sim!!
        String cpf_digitado;
        System.out.println("Digite o nome da pessoa que deseja excluir");
        cpf_digitado = sc.nextLine();
        for (int i = 0; i < Cliente.getLista_cliente().size(); i++) {
            if (cpf_digitado.equalsIgnoreCase(Cliente.getLista_cliente().get(i).getCpf())) {
                // add metodo para inativar o cliente
                Cliente.getLista_cliente().get(i).setAtivo(false);

            }

        }

    }

    @Override
    public void ver() {
        // perguntar cliente e mostrar infos dele nome,data_nasc,cpf,endereco,tipo de
        // conta, gerente do cliente, saldo
        String cpf_digitado;
        System.out.println("Digite o nome do cliente que você deseja acessar as informações:");
        cpf_digitado = sc.nextLine();
        for (int i = 0; i < Cliente.getLista_cliente().size(); i++) {
            if (cpf_digitado.equalsIgnoreCase(Cliente.getLista_cliente().get(i).getCpf())) {
                // verificar como vai ficar as infos quando chamar esse metodo.
                System.out.println(Cliente.getLista_cliente().get(i).getNome());
                System.out.println(Cliente.getLista_cliente().get(i).getData_nasc());
                System.out.println(Cliente.getLista_cliente().get(i).getCpf());
                System.out.println(Cliente.getLista_cliente().get(i).getEndereco());
                System.out.println(Cliente.getLista_cliente().get(i).getTipoConta());
                System.out.println(Cliente.getLista_cliente().get(i).getGerente());
                System.out.println(Cliente.getLista_cliente().get(i).getSaldo());
            }

        }
    }

    @Override
    public void saldo() {
        
    }

    @Override
    public void deposito() {
        
    }

    @Override
    public void saque() {
        
    }

    @Override
    public void extrato() {
        
    }

    @Override
    public void transferencia() {
       
    }

}
