package entities;

import enums.UnidadeFederal;

public abstract class Funcionario extends Pessoa{
    public Funcionario(String nome, String cpf, String data_nasc, String login, String senha,
            Endereco endereco) {
        super(nome, cpf, data_nasc, login, senha, endereco);
    }
    private double salario;
    private String ctps;
    
    


}
