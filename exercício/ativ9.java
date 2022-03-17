
/**
 * Escreva uma descrição da classe ativ9 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class ativ9
{
    public static void main(String args[])
    {
        double metros;
        Scanner altura = new Scanner(System.in);
        System.out.print("Informe a altura em metros: ");
        metros = altura.nextDouble();
        System.out.println("Altura em centímetros: " + (metros * 100));
        System.out.println("Altura em milímetros: " + (metros * 1000));
    }
}
