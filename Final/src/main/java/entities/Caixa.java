package entities;


public class Caixa extends Funcionario{

    public Caixa(String nome, String cpf, String data_nasc, String login, String senha,
            Endereco endereco, double salario, String cpts) {
        super(nome, cpf, data_nasc, login, senha, endereco, salario, cpts);
    }
    
    
}
