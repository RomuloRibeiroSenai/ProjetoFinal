package entities;


import java.util.ArrayList;

import interfaces.Cadastro;

public abstract class Funcionario extends Pessoa implements Cadastro{
    private double salario;
    private String ctps;

    private static ArrayList<Funcionario> lista_funcionario = new ArrayList<>();

    public Funcionario(String nome, String cpf, String data_nasc, String login, String senha,
            Endereco endereco, double salario, String cpts, boolean ativo) {
        super(nome, cpf, data_nasc, login, senha, endereco, ativo);
        this.salario = salario;
        this.ctps = ctps;

    }

    public static ArrayList<Funcionario> getLista_funcionario() {
        return lista_funcionario;
    }

}
