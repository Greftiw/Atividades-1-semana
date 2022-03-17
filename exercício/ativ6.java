
/**
 * Escreva uma descrição da classe ativ6 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class ativ6
{
    public static void main(String args[])
    {
        Scanner graus = new Scanner(System.in);
        double fahr, cels;
        
        System.out.print("Informe a quantidade de graus Fahrenheit: ");
        fahr = graus.nextDouble();
        cels = 5.0/9 * (fahr - 32);
        System.out.println("A temperatura em graus Celsius é: " + cels);
    }
}
