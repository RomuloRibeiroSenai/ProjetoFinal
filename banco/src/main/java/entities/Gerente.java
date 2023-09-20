package entities;

import enums.Agencia;
import interfaces.Cadastro;
//import lombok.Data;

//@Data
public class Gerente extends Funcionario implements Cadastro{
    private String departamento;
    private Agencia agencia;

    public Gerente(String nome, String cpf, String data_nasc, String login, String senha,
            Endereco endereco, double salario, String cpts, String departamento, Agencia agencia) {
        super(nome, cpf, data_nasc, login, senha, endereco, salario, cpts);
        this.departamento = departamento;
        this.agencia = agencia;
    }

    @Override
    public void criar() {
        
    }
    @Override
    public void atualizar() {
       
    }
    @Override
    public void excluir() {
        
    }
    @Override
    public void ver() {
        
    }
    
// Gerente responsável por vários clientes
    
    
}
