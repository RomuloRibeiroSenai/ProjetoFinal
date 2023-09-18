package com.example.interfaces.Cliente;

import java.util.HashMap;
import java.util.Map;

import com.example.interfaces.loginCliente;

public class ClienteLogin implements loginCliente {
    
    private Map<String, String> clientes; // Simulando um banco de dados de clientes (usuário-senha)

    public ClienteLogin() {
        // Inicializa o banco de dados de clientes com alguns valores de exemplo
        clientes = new HashMap<>();
        clientes.put("cliente1", "senha1");
        clientes.put("cliente2", "senha2");
        clientes.put("cliente3", "senha3");
    }

    @Override
    public void loginCliente(String username, String senha) {
        // Verifica se o cliente está no banco de dados
        if (clientes.containsKey(username)) {
            // Verifica se a senha corresponde
            String senhaArmazenada = clientes.get(username);
            if (senhaArmazenada.equals(senha)) {
                System.out.println("Login bem-sucedido para o cliente: " + username);
            } else {
                System.out.println("Senha incorreta para o cliente: " + username);
            }
        } else {
            System.out.println("Cliente não encontrado: " + username);
        }
    }

    public static void main(String[] args) {
        ClienteLogin clienteLogin = new ClienteLogin();
        clienteLogin.loginCliente("cliente1", "senha1"); // Exemplo de login bem-sucedido
        clienteLogin.loginCliente("cliente2", "senhaerrada"); // Exemplo de senha incorreta
        clienteLogin.loginCliente("cliente4", "senha4"); // Exemplo de cliente não encontrado
    }
}
