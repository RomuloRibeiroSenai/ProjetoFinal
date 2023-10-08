package entities;

import enums.UnidadeFederal;

public class Endereco {
    private String bairro;
    private String rua;
    private int numero;
    private String complemento;
    private String cidade;
    private String cep;
    private UnidadeFederal uf;

    
    public Endereco(String bairro, String rua, int numero, String complemento, String cidade, String cep,
            UnidadeFederal uf) {
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public UnidadeFederal getUf() {
        return uf;
    }
    public void setUf(UnidadeFederal uf) {
        this.uf = uf;
    }
    
}
