package menus;

import java.util.Scanner;

import entities.Funcionario;

public class menu_inicial {
    Scanner sc = new Scanner(System.in);
        
    public void menus(){
        
        int escolha;
        System.out.println("Seja bem-vindo!");
        System.out.println("Digite 1. para entrar no menu de funcionarios\n 2. para entrar no menu de cliente");
        escolha = sc.nextInt();
        if (escolha == 1) {
            String login_digitado,senha_digitada;

            //conferir o login e senha e achar qual cargo da pessoa 
            System.out.println("digite seu login: ");
            sc.next();
            login_digitado = sc.nextLine();
            System.out.println("digite sua senha: ");
            senha_digitada = sc.nextLine();
            //metodo para verificar login
         
            }
            
        }
        public int menu_gerente(){
            //gerente exclui,acrescenta, atualiza cadastro,ver lista
            int escolha;
            System.out.println("1.Ver funcionarios\n2.Ver cliente\n3.Cadastrar funcionario \n 4.Cadastrar cliente\n5.Atualizar cadastro fucionario\n6.Atualizar cadastro cliente\n 7.Atualizar cadastro funcionario\n 8.Atualizar cadastro cliente");
            sc.next();
            escolha = sc.nextInt();
         
            return escolha;
        }
        public int menu_caixa(){
            //gerente exclui,acrescenta, atualiza cadastro,ver lista
            int escolha;
            System.out.println("1.Criar cliente\n2.Atualizar cadastro do cliente\n3.Consultar saldo\n4.Realizar deposito\n5.Sacar");
            sc.next();
            escolha = sc.nextInt();
         
            return escolha;
        }
        public int menu_cliente(){
            //gerente exclui,acrescenta, atualiza cadastro,ver lista
            int escolha;
            System.out.println("1.Ver saldo\n2.Depositar\n3.Sacar");
            sc.next();
            escolha = sc.nextInt();      
            return escolha;
        }
    }
