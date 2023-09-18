import java.sql.Date;

public class AtributosCartao {
    private String nome;
    private Int numeroCartao;
    private int CVV;
    private Date dataValidade;
    private String tipo;

    public AtributosCartao(String nome, Int numeroCartao, int cVV, Date dataValidade,String tipo) {
        this.nome = nome;
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
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Int getNumeroCartao() {
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
