package entities;

import enums.Agencia;
import enums.UnidadeFederal;
import interfaces.Cadastro;
import lombok.Data;

//@Data
public class Gerente extends Funcionario implements Cadastro{
    private String departamento;
    private Agencia agencia;

    public Gerente(String nome, String cpf, String data_nasc, String login, String senha,
            Endereco endereco) {
        super(nome, cpf, data_nasc, login, senha, endereco);
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
