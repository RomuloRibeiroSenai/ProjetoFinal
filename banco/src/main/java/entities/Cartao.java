package entities;

import java.util.Date;

import interfaces.Cadastro;
import lombok.Data;
//@Data
public class Cartao implements Cadastro{
    private Cliente cliente;
    private int numeroCartao;
    private int cvv;
    private Date dataValidade;
    private boolean credito;
    private boolean debito;
    /*
    1-criar um contador para gerar numero do cartão e codigo de segurança
    2-criar um local date e colocar um calculo para ele add data de validade
    3-colocar para ele criar o cartão automaticamente quando ele criar a conta de uma pessoa
    
     */


	@Override
	public void criar() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'criar'");
	}
	@Override
	public void atualizar() {
		// tentar colocar nesse metodo para ele atualizar a senha do cartão
		throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
	}
	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'excluir'");
	}
	@Override
	public void ver() {
		// colocar talvez o historico de compras ou todos os cartoes que ele tem
		throw new UnsupportedOperationException("Unimplemented method 'ver'");
	}
	@Override
	public void saldo() {
		// tentar implementar a ideia do anderson de o limite ser de acordo com o saldo da pessoa ou para ele ver o saldo que ele ainda tem de credito
		throw new UnsupportedOperationException("Unimplemented method 'saldo'");
	}
	@Override
	public void deposito() {
		// usar esse metodo para aumentar o valor de credito dele
		throw new UnsupportedOperationException("Unimplemented method 'deposito'");
	}
	@Override
	public void saque() {
		// metodo responsavel pela compra
		throw new UnsupportedOperationException("Unimplemented method 'saque'");
	}
	@Override
	public void extrato() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'extrato'");
	}
	@Override
	public void transferencia() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'transferencia'");
	}

    
}
