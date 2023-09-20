package entities;
import java.util.Random;
@Data
public class Cliente extends Pessoa{
    private double saldo;
    private String tipoConta;
    private static Random rand = new Random();
    private static double numeroConta = rand.nextDouble();
    private String gerente;




    
}
