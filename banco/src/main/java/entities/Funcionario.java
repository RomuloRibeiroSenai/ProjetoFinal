package entities;


import java.util.ArrayList;

import interfaces.Cadastro;

public abstract class Funcionario extends Pessoa implements Cadastro{
    private double salario;
    private String ctps;
    private String cargo;
    private static ArrayList<Funcionario> lista_funcionario = new ArrayList<>();
    
    public Funcionario(String nome, String cpf, String data_nasc, String login, String senha,
    Endereco endereco, double salario, String cpts, boolean ativo, String cargo) {
        super(nome, cpf, data_nasc, login, senha, endereco, ativo);
        this.salario = salario;
        this.ctps = ctps;
        this.cargo = cargo;
    }
    
    public static ArrayList<Funcionario> getLista_funcionario() {
        return lista_funcionario;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
