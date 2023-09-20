package entities;

import enums.Agencia;
import lombok.Data;

@Data
public class Gerente extends Funcionario{
    private String departamento;
    private Agencia agencia;
    
// Gerente responsável por vários clientes
    
    
}
