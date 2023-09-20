package com.banco.banco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entities.Cliente;
import entities.Endereco;
import enums.UnidadeFederal;

@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
      Endereco teste = new Endereco("Bingen", "Rua bingen", 0, "nada", "Petropolis", "25-556550", UnidadeFederal.RJ);
      Cliente raquel = new Cliente("raquel", "121", "01/01/01", "raquel", "raquel", teste, 10000, "Corrente", "Anderson");
      raquel.getLista_cliente().add(raquel);
      raquel.ver();
	}

}
// Banco
// Login de Cliente
// Login de Gerente que pode incluir, alterar ou excluir funcionário
// Login de Caixa que pode incluir cliente
// Gerador de número de conta automático
// No mínimo 3 agências
// Transferências bancárias entre clientes
// Saque
// Depósito
// Extrato
// Parte 2
// Login de Gerente que pode cliente que mais movimenta
// Login de Gerente que pode liberar uma transferencia 
// que ficou pendente de aprovacao

/*
 * private static ArrayList<Funcionario> listaFuncionarios;

    incluiFunc
    editaFunc
    excluiFunc
    listaFunc
    listaFuncByIndex
 */