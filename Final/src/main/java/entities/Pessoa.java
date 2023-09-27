package entities;

//@Data
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String data_nasc;
    private String login;
    private String senha;
    private Endereco endereco;
    
    public Pessoa(String nome, String cpf, String data_nasc, String login, String senha,
            Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nasc = data_nasc;
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getData_nasc() {
        return data_nasc;
    }
    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
