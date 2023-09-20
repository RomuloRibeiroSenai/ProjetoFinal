package entities;

import enums.UnidadeFederal;

public class Caixa extends Funcionario{

    public Caixa(String nome, String cpf, String data_nasc, String login, String senha,
            Endereco endereco) {
        super(nome, cpf, data_nasc, login, senha, endereco);
    }
    
    
}
