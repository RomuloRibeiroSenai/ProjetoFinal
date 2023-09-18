package com.enums;
import java.sql.Date;

import com.enums.Pessoas.Cliente;

public class AtributosCartao {
    private Cliente cliente;
    private int numeroCartao;
    private int CVV;
    private Date dataValidade;
    private cartao tipo;

    public AtributosCartao(String nome, int numeroCartao, int cVV, Date dataValidade,cartao tipo) {
       // this.nome = nome;
        this.numeroCartao = numeroCartao;
        this.CVV = cVV;
        this.dataValidade = dataValidade;
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        if (tipo.equalsIgnoreCase("debito")){
            this.tipo = cartao.DEBITO;
        } else if (tipo.equalsIgnoreCase("credito")){
            this.tipo = cartao.CREDITO;
        }
        
    }
  
    public int getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(Int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public int getCVV() {
        return CVV;
    }
    public void setCVV(int cVV) {
        CVV = cVV;
    }
    public Date getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
    

}
