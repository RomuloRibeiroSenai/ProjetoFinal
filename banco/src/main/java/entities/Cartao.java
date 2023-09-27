package entities;

import java.util.Date;

import lombok.Data;
//@Data
public class Cartao {
    private Cliente cliente;
    private int numeroCartao;
    private int cvv;
    private Date dataValidade;
    private boolean credito;
    private boolean debito;

    
}
