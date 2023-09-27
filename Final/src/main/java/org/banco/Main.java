package org.banco;

import entities.Cliente;
import entities.Endereco;
import enums.UnidadeFederal;

public class Main {
    public static void main(String[] args) {
        Endereco teste = new Endereco("Bingen", "Rua bingen", 0, "nada", "Petropolis", "25-556550", UnidadeFederal.RJ);
        Cliente raquel = new Cliente("raquel", "121", "01/01/01", "raquel", "raquel", teste, 10000, "Corrente", "Anderson");
        raquel.getLista_cliente().add(raquel);
        raquel.ver();
    }
}