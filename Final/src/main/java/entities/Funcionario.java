package entities;


import interfaces.Cadastro;

public abstract class Funcionario extends Pessoa {
    private double salario;
    private String ctps;
    
    public Funcionario(String nome, String cpf, String data_nasc, String login, String senha,
            Endereco endereco, double salario, String cpts) {
        super(nome, cpf, data_nasc, login, senha, endereco);
        this.salario = salario;
        this.ctps = ctps;
    }
    


}
