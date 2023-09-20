package entities;

import enums.UnidadeFederal;
import lombok.Data;
@Data
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String data_nasc;
    private UnidadeFederal UF;
    private String login;
    private String senha;
    private Endereco endereco;
}
